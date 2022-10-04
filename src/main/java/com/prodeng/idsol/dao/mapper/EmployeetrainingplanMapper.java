package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Employeetrainingplan;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface EmployeetrainingplanMapper{

	@Select ("SELECT * FROM employeetrainingplan")
	List<Employeetrainingplan> getAllEmployeetrainingplan();

	@Select ("SELECT * FROM employeetrainingplan WHERE ETPId = #{eTPId} ")
	Employeetrainingplan getEmployeetrainingplan(@Param("eTPId") Integer eTPId);

	@Insert ("INSERT INTO employeetrainingplan(ETPId, ETPNo, ETPDate, ETPName, ETPFromDate, ETPTillDate, Remarks, LastUpdatedBy, LastUpdatedDate, LastUpdatedTime)  VALUES (#{eTPId} , #{eTPNo} , #{eTPDate} , #{eTPName} , #{eTPFromDate} , #{eTPTillDate} , #{remarks} , #{lastUpdatedBy} , #{lastUpdatedDate} , #{lastUpdatedTime} )")
	void  saveEmployeetrainingplan(Employeetrainingplan employeetrainingplan);

	@Update ("UPDATE  employeetrainingplan SET ETPNo = #{eTPNo}, ETPDate = #{eTPDate}, ETPName = #{eTPName}, ETPFromDate = #{eTPFromDate}, ETPTillDate = #{eTPTillDate}, Remarks = #{remarks}, LastUpdatedBy = #{lastUpdatedBy}, LastUpdatedDate = #{lastUpdatedDate}, LastUpdatedTime = #{lastUpdatedTime} WHERE ETPId = #{eTPId} ")
	void  updateEmployeetrainingplan(@Param("eTPId") Integer eTPId);

	@Delete ("DELETE FROM employeetrainingplan WHERE ETPId = #{eTPId} ")
	void  deleteEmployeetrainingplan(@Param("eTPId") Integer eTPId);

}
