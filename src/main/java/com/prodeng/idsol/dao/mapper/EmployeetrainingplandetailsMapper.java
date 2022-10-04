package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Employeetrainingplandetails;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface EmployeetrainingplandetailsMapper{

	@Select ("SELECT * FROM employeetrainingplandetails")
	List<Employeetrainingplandetails> getAllEmployeetrainingplandetails();

	@Select ("SELECT * FROM employeetrainingplandetails WHERE ETPId = #{eTPId} AND SerialNo = #{serialNo} ")
	Employeetrainingplandetails getEmployeetrainingplandetails(@Param("eTPId") Integer eTPId, @Param("serialNo") Integer serialNo);

	@Insert ("INSERT INTO employeetrainingplandetails(ETPId, SerialNo, TrainingName, Remarks, TrainingDate, NoOfDays, NoOfPerson)  VALUES (#{eTPId} , #{serialNo} , #{trainingName} , #{remarks} , #{trainingDate} , #{noOfDays} , #{noOfPerson} )")
	void  saveEmployeetrainingplandetails(Employeetrainingplandetails employeetrainingplandetails);

	@Update ("UPDATE  employeetrainingplandetails SET TrainingName = #{trainingName}, Remarks = #{remarks}, TrainingDate = #{trainingDate}, NoOfDays = #{noOfDays}, NoOfPerson = #{noOfPerson} WHERE ETPId = #{eTPId} AND SerialNo = #{serialNo} ")
	void  updateEmployeetrainingplandetails(@Param("eTPId") Integer eTPId, @Param("serialNo") Integer serialNo);

	@Delete ("DELETE FROM employeetrainingplandetails WHERE ETPId = #{eTPId} AND SerialNo = #{serialNo} ")
	void  deleteEmployeetrainingplandetails(@Param("eTPId") Integer eTPId, @Param("serialNo") Integer serialNo);

    void updateEmployeetrainingplandetails(Employeetrainingplandetails employeetrainingplandetails);
}
