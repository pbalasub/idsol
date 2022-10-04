package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Employeetrainingeffectiveness;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface EmployeetrainingeffectivenessMapper{

	@Select ("SELECT * FROM employeetrainingeffectiveness")
	List<Employeetrainingeffectiveness> getAllEmployeetrainingeffectiveness();

	@Select ("SELECT * FROM employeetrainingeffectiveness WHERE ETRId = #{eTRId} AND SerialNo = #{serialNo} ")
	Employeetrainingeffectiveness getEmployeetrainingeffectiveness(@Param("eTRId") Integer eTRId, @Param("serialNo") Integer serialNo);

	@Insert ("INSERT INTO employeetrainingeffectiveness(ETRId, SerialNo, Criteria, EvalRemarks, Rating)  VALUES (#{eTRId} , #{serialNo} , #{criteria} , #{evalRemarks} , #{rating} )")
	void  saveEmployeetrainingeffectiveness(Employeetrainingeffectiveness employeetrainingeffectiveness);

	@Update ("UPDATE  employeetrainingeffectiveness SET Criteria = #{criteria}, EvalRemarks = #{evalRemarks}, Rating = #{rating} WHERE ETRId = #{eTRId} AND SerialNo = #{serialNo} ")
	void  updateEmployeetrainingeffectiveness(@Param("eTRId") Integer eTRId, @Param("serialNo") Integer serialNo);

	@Delete ("DELETE FROM employeetrainingeffectiveness WHERE ETRId = #{eTRId} AND SerialNo = #{serialNo} ")
	void  deleteEmployeetrainingeffectiveness(@Param("eTRId") Integer eTRId, @Param("serialNo") Integer serialNo);

    void updateEmployeetrainingeffectiveness(Employeetrainingeffectiveness employeetrainingeffectiveness);
}
