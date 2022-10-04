package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Employeeperformanceassessment;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface EmployeeperformanceassessmentMapper{

	@Select ("SELECT * FROM employeeperformanceassessment")
	List<Employeeperformanceassessment> getAllEmployeeperformanceassessment();

	@Select ("SELECT * FROM employeeperformanceassessment WHERE EPANo = #{ePANo} AND SerialNo = #{serialNo} ")
	Employeeperformanceassessment getEmployeeperformanceassessment(@Param("ePANo") String ePANo, @Param("serialNo") Integer serialNo);

	@Insert ("INSERT INTO employeeperformanceassessment(EPANo, SerialNo, Criteria, EvalRemarks, Rating, RatingValue)  VALUES (#{ePANo} , #{serialNo} , #{criteria} , #{evalRemarks} , #{rating} , #{ratingValue} )")
	void  saveEmployeeperformanceassessment(Employeeperformanceassessment employeeperformanceassessment);

	@Update ("UPDATE  employeeperformanceassessment SET Criteria = #{criteria}, EvalRemarks = #{evalRemarks}, Rating = #{rating}, RatingValue = #{ratingValue} WHERE EPANo = #{ePANo} AND SerialNo = #{serialNo} ")
	void  updateEmployeeperformanceassessment(@Param("ePANo") String ePANo, @Param("serialNo") Integer serialNo);

	@Delete ("DELETE FROM employeeperformanceassessment WHERE EPANo = #{ePANo} AND SerialNo = #{serialNo} ")
	void  deleteEmployeeperformanceassessment(@Param("ePANo") String ePANo, @Param("serialNo") Integer serialNo);

    void updateEmployeeperformanceassessment(Employeeperformanceassessment employeeperformanceassessment);
}
