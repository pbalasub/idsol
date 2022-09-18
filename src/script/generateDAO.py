import mysql.connector
from mysql.connector import Error
import os

entity_package = "com.prodeng.idsol.dao.entity"
mapper_package = "com.prodeng.idsol.dao.mapper"
parent_dir = "/tmp"

all_tables = []

DATA_TYPE_MAP = {
    'varchar': 'String',
    'int': 'Integer',
    'date': 'Date',
    'decimal': 'Double',
    'time': 'LocalTime'
}


def create_dir(parent_dir, directory):

    path = os.path.join(parent_dir, directory)

    try:
        os.makedirs(path, exist_ok=True)
        print("Directory '%s' created successfully" % directory)
        return path
    except OSError as error:
        print("Directory '%s' can not be created" % directory)


def get_connection():
    # make it global
    global connection

    try:
        connection = mysql.connector.connect(host='localhost',
                                             database='srkferp',
                                             user='root',
                                             password='verizon1')
        if connection.is_connected():
            db_Info = connection.get_server_info()
            print("Connected to MySQL Server version ", db_Info)
            cursor = connection.cursor()
            cursor.execute("select database();")
            record = cursor.fetchone()
            print("You're connected to database: ", record)

        return connection
    except Error as e:
        print("Error while connecting to MySQL", e)
    finally:
        if connection.is_connected():
            cursor.close()


def capitalize(var):
    return var[0].upper() + var[1:]


def lowerFirstChar(var):
    return var[0].lower() + var[1:]


def get_tables():

    try:
        sql_select_Query = "show tables"
        cursor = connection.cursor()
        cursor.execute(sql_select_Query)
        # get all records
        records = cursor.fetchall()
        print("Total number of rows in table: ", cursor.rowcount)
        for row in records:
            all_tables.append(row[0])
    except mysql.connector.Error as e:
        print("Error reading data from MySQL table", e)
    finally:
        if connection.is_connected():
            cursor.close()


def get_table_metadata(table):

    # map->map->list
    # table->cols->metdata
    table_meta = {}

    try:
        sql_select_Query = "DESCRIBE " + table
        cursor = connection.cursor()
        cursor.execute(sql_select_Query)
        # get all records
        records = cursor.fetchall()
        print("Total number of rows in table: ", cursor.rowcount)
        for row in records:
            table_meta[row[0]] = {}
            table_meta[row[0]]['datatype'] = row[1]
            table_meta[row[0]]['notnull'] = row[2]
            table_meta[row[0]]['primary'] = row[3]
        print(table_meta)
        return table_meta

    except mysql.connector.Error as e:
        print("Error reading data from MySQL table", e)
    finally:
        if connection.is_connected():
            cursor.close()


def generate_daos():
    for table in all_tables:
        #table = "employeeaddress"
        generate_dao(table, get_table_metadata(table))
        generate_mapper(table, get_table_metadata(table))


def get_datatype(details):
    datatype = "String"
    for type in DATA_TYPE_MAP:
        if type.encode('utf-8') in details['datatype']:
            datatype = DATA_TYPE_MAP[type]
    return datatype


def generate_members(colname, details):
    # annotate
    memberVariable = ""
    if details['notnull'] == 'NO':
        memberVariable += "\t@NonNull\n"

    memberVariable += "\tprivate "
    memberVariable += get_datatype(details) + " "
    memberVariable += lowerFirstChar(colname)
    memberVariable += ";\n"

    return memberVariable


def generate_dao(tablename, tablemeta):
    path = create_dir(parent_dir, "entity")
    clazz = capitalize(tablename)
    print("Generate POJO for " + clazz)
    # Generate POJO
    filename = path + "/" + clazz+".java"
    with open(filename, "w") as JFH:
        JFH.write("package " + entity_package + ";")
        JFH.write("\n")
        JFH.write("\n")
        JFH.write("import lombok.AllArgsConstructor;\n")
        JFH.write("import lombok.Data;\n")
        JFH.write("import lombok.NoArgsConstructor;\n")
        JFH.write("import lombok.NonNull;\n")
        JFH.write("\n")
        JFH.write("@AllArgsConstructor\n")
        JFH.write("@NoArgsConstructor\n")
        JFH.write("@Data\n")
        JFH.write("public class " + clazz + "{\n")
        JFH.write("\n")
        for key in tablemeta:
            JFH.write(generate_members(key, tablemeta[key]))
        JFH.write("}\n")


def insertWhereCls(tablemeta):
    whereclause = ""
    for key in tablemeta:
        if tablemeta[key]['primary'] == 'PRI':
            if (whereclause):
                whereclause += "AND "
            whereclause += key + " = #{" + lowerFirstChar(key)+"} "
    return whereclause


def insertParams(tablemeta):
    params = ""
    for key in tablemeta:
        if tablemeta[key]['primary'] == 'PRI':
            if params:
                params += ", "
            params += "@Param(\""+lowerFirstChar(key) + "\") " + \
                get_datatype(tablemeta[key]) + " " + lowerFirstChar(key)
    return params


def generate_mapper(tablename, tablemeta):
    path = create_dir(parent_dir, "mapper")
    entity_clazz = capitalize(tablename)
    clazz = capitalize(tablename) + "Mapper"
    print("Generate Mapper for " + clazz)
    # Generate Mapper
    filename = path + "/" + clazz+".java"
    with open(filename, "w") as JFH:
        JFH.write("package " + mapper_package + ";")
        JFH.write("\n")
        JFH.write("\n")
        JFH.write("import " + entity_package + "." + entity_clazz + ";\n")
        JFH.write("import org.apache.ibatis.annotations.*;\n")
        JFH.write("import java.util.List;\n")
        JFH.write("\n")
        JFH.write("public interface " + clazz + "{\n")
        JFH.write("\n")
        # select all
        JFH.write("\t@Select (\"SELECT * FROM "+tablename+"\")\n")
        JFH.write("\tList<"+capitalize(entity_clazz) +
                  "> getAll"+capitalize(entity_clazz)+"()\n")
        JFH.write("\n")
        # select by Id
        JFH.write("\t@Select (\"SELECT * FROM "+tablename +
                  " WHERE " + insertWhereCls(tablemeta)+"\")\n")
        JFH.write("\t"+capitalize(entity_clazz) +
                  " get"+capitalize(entity_clazz)+"(" + insertParams(tablemeta) + ")\n")
        JFH.write("\n")
        # insert
        # update
        # delete
        JFH.write("}\n")


get_connection()
get_tables()

# print(all_tables)

# get_table_metadata()

# get_table_metadata("employeeaddress")

generate_daos()
