package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Employeequalification;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface EmployeequalificationMapper{

	@Select ("SELECT * FROM employeequalification")
	List<Employeequalification> getAllEmployeequalification();

	@Select ("SELECT * FROM employeequalification WHERE EmpCode = #{empCode} AND SerialNo = #{serialNo} ")
	Employeequalification getEmployeequalification(@Param("empCode") String empCode, @Param("serialNo") Integer serialNo);

	@Insert ("INSERT INTO employeequalification(EmpCode, SerialNo, Qualification, Institution, YearPassed, GradePercentage)  VALUES (#{empCode} , #{serialNo} , #{qualification} , #{institution} , #{yearPassed} , #{gradePercentage} )")
	void  saveEmployeequalification(Employeequalification employeequalification);

	@Update ("UPDATE  employeequalification SET Qualification = #{qualification}, Institution = #{institution}, YearPassed = #{yearPassed}, GradePercentage = #{gradePercentage} WHERE EmpCode = #{empCode} AND SerialNo = #{serialNo} ")
	void  updateEmployeequalification(@Param("empCode") String empCode, @Param("serialNo") Integer serialNo);

	@Delete ("DELETE FROM employeequalification WHERE EmpCode = #{empCode} AND SerialNo = #{serialNo} ")
	void  deleteEmployeequalification(@Param("empCode") String empCode, @Param("serialNo") Integer serialNo);

    void updateEmployeequalification(Employeequalification employeequalification);
}
