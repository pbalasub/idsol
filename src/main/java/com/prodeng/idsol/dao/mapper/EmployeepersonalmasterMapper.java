package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Employeepersonalmaster;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface EmployeepersonalmasterMapper{

	@Select ("SELECT * FROM employeepersonalmaster")
	List<Employeepersonalmaster> getAllEmployeepersonalmaster();

	@Select ("SELECT * FROM employeepersonalmaster WHERE EmpCode = #{empCode} ")
	Employeepersonalmaster getEmployeepersonalmaster(@Param("empCode") String empCode);

	@Insert ("INSERT INTO employeepersonalmaster(EmpCode, EmpName, FatherName, MotherName, PhoneNo, BloodGroup, DateOfBirth, Gender, MaritalStatus, Qualification, EmpCategory, Remarks, LastUpdatedBy, LastUpdatedDate, LastUpdatedTime, Branch)  VALUES (#{empCode} , #{empName} , #{fatherName} , #{motherName} , #{phoneNo} , #{bloodGroup} , #{dateOfBirth} , #{gender} , #{maritalStatus} , #{qualification} , #{empCategory} , #{remarks} , #{lastUpdatedBy} , #{lastUpdatedDate} , #{lastUpdatedTime} , #{branch} )")
	void  saveEmployeepersonalmaster(Employeepersonalmaster employeepersonalmaster);

	@Update ("UPDATE  employeepersonalmaster SET EmpName = #{empName}, FatherName = #{fatherName}, MotherName = #{motherName}, PhoneNo = #{phoneNo}, BloodGroup = #{bloodGroup}, DateOfBirth = #{dateOfBirth}, Gender = #{gender}, MaritalStatus = #{maritalStatus}, Qualification = #{qualification}, EmpCategory = #{empCategory}, Remarks = #{remarks}, LastUpdatedBy = #{lastUpdatedBy}, LastUpdatedDate = #{lastUpdatedDate}, LastUpdatedTime = #{lastUpdatedTime}, Branch = #{branch} WHERE EmpCode = #{empCode} ")
	void  updateEmployeepersonalmaster(@Param("empCode") String empCode);

	@Delete ("DELETE FROM employeepersonalmaster WHERE EmpCode = #{empCode} ")
	void  deleteEmployeepersonalmaster(@Param("empCode") String empCode);

}
