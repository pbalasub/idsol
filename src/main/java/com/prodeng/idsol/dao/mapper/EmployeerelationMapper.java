package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Employeerelation;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface EmployeerelationMapper{

	@Select ("SELECT * FROM employeerelation")
	List<Employeerelation> getAllEmployeerelation();

	@Select ("SELECT * FROM employeerelation WHERE EmpCode = #{empCode} AND SerialNo = #{serialNo} ")
	Employeerelation getEmployeerelation(@Param("empCode") String empCode, @Param("serialNo") Integer serialNo);

	@Insert ("INSERT INTO employeerelation(EmpCode, SerialNo, Relationship, RelationName, DateOfBirth, StayTogether, Dependent, Nominee, Qualification, NatureOfWork)  VALUES (#{empCode} , #{serialNo} , #{relationship} , #{relationName} , #{dateOfBirth} , #{stayTogether} , #{dependent} , #{nominee} , #{qualification} , #{natureOfWork} )")
	void  saveEmployeerelation(Employeerelation employeerelation);

	@Update ("UPDATE  employeerelation SET Relationship = #{relationship}, RelationName = #{relationName}, DateOfBirth = #{dateOfBirth}, StayTogether = #{stayTogether}, Dependent = #{dependent}, Nominee = #{nominee}, Qualification = #{qualification}, NatureOfWork = #{natureOfWork} WHERE EmpCode = #{empCode} AND SerialNo = #{serialNo} ")
	void  updateEmployeerelation(@Param("empCode") String empCode, @Param("serialNo") Integer serialNo);

	@Delete ("DELETE FROM employeerelation WHERE EmpCode = #{empCode} AND SerialNo = #{serialNo} ")
	void  deleteEmployeerelation(@Param("empCode") String empCode, @Param("serialNo") Integer serialNo);

    void updateEmployeerelation(Employeerelation employeerelation);
}
