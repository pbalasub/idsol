package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Employeeattntimedetails;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

public interface EmployeeattntimedetailsMapper{

	@Select ("SELECT * FROM employeeattntimedetails")
	List<Employeeattntimedetails> getAllEmployeeattntimedetails();

	@Select ("SELECT * FROM employeeattntimedetails WHERE EmpCode = #{empCode} AND AttnDate = #{attnDate} AND AttnTime = #{attnTime} ")
	Employeeattntimedetails getEmployeeattntimedetails(@Param("empCode") String empCode, @Param("attnDate") Date attnDate, @Param("attnTime") String attnTime);

	@Insert ("INSERT INTO employeeattntimedetails(EmpId, EmpCode, AttnDate, AttnTime, TnsId, TrnsBarCode)  VALUES (#{empId} , #{empCode} , #{attnDate} , #{attnTime} , #{tnsId} , #{trnsBarCode} )")
	void  saveEmployeeattntimedetails(Employeeattntimedetails employeeattntimedetails);

	@Update ("UPDATE  employeeattntimedetails SET EmpId = #{empId}, TnsId = #{tnsId}, TrnsBarCode = #{trnsBarCode} WHERE EmpCode = #{empCode} AND AttnDate = #{attnDate} AND AttnTime = #{attnTime} ")
	void  updateEmployeeattntimedetails(@Param("empCode") String empCode, @Param("attnDate") Date attnDate, @Param("attnTime") String attnTime);

	@Delete ("DELETE FROM employeeattntimedetails WHERE EmpCode = #{empCode} AND AttnDate = #{attnDate} AND AttnTime = #{attnTime} ")
	void  deleteEmployeeattntimedetails(@Param("empCode") String empCode, @Param("attnDate") Date attnDate, @Param("attnTime") String attnTime);

	void updateEmployeeattntimedetails(Employeeattntimedetails employeeattntimedetails);
}
