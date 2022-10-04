package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Employeeaddress;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface EmployeeaddressMapper{

	@Select ("SELECT * FROM employeeaddress")
	List<Employeeaddress> getAllEmployeeaddress();

	@Select ("SELECT * FROM employeeaddress WHERE EmpCode = #{empCode} AND SerialNo = #{serialNo} ")
	Employeeaddress getEmployeeaddress(@Param("empCode") String empCode, @Param("serialNo") Integer serialNo);

	@Insert ("INSERT INTO employeeaddress(EmpCode, SerialNo, AddressType, AddressLine1, AddressLine2, City, State, Country, PostalCode, PhoneNo)  VALUES (#{empCode} , #{serialNo} , #{addressType} , #{addressLine1} , #{addressLine2} , #{city} , #{state} , #{country} , #{postalCode} , #{phoneNo} )")
	void  saveEmployeeaddress(Employeeaddress employeeaddress);

	@Update ("UPDATE  employeeaddress SET AddressType = #{addressType}, AddressLine1 = #{addressLine1}, AddressLine2 = #{addressLine2}, City = #{city}, State = #{state}, Country = #{country}, PostalCode = #{postalCode}, PhoneNo = #{phoneNo} WHERE EmpCode = #{empCode} AND SerialNo = #{serialNo} ")
	void  updateEmployeeaddress(@Param("empCode") String empCode, @Param("serialNo") Integer serialNo);

	@Delete ("DELETE FROM employeeaddress WHERE EmpCode = #{empCode} AND SerialNo = #{serialNo} ")
	void  deleteEmployeeaddress(@Param("empCode") String empCode, @Param("serialNo") Integer serialNo);

    void updateEmployeeaddress(Employeeaddress employeeaddress);
}
