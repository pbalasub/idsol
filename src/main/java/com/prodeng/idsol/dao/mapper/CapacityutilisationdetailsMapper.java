package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Capacityutilisationdetails;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface CapacityutilisationdetailsMapper{

	@Select ("SELECT * FROM capacityutilisationdetails")
	List<Capacityutilisationdetails> getAllCapacityutilisationdetails();

	@Select ("SELECT * FROM capacityutilisationdetails WHERE CUId = #{cUId} AND SerialNo = #{serialNo} ")
	Capacityutilisationdetails getCapacityutilisationdetails(@Param("cUId") Integer cUId, @Param("serialNo") Integer serialNo);

	@Insert ("INSERT INTO capacityutilisationdetails(CUId, SerialNo, CUSection, PlannedHours)  VALUES (#{cUId} , #{serialNo} , #{cUSection} , #{plannedHours} )")
	void  saveCapacityutilisationdetails(Capacityutilisationdetails capacityutilisationdetails);

	@Update ("UPDATE  capacityutilisationdetails SET CUSection = #{cUSection}, PlannedHours = #{plannedHours} WHERE CUId = #{cUId} AND SerialNo = #{serialNo} ")
	void  updateCapacityutilisationdetails(@Param("cUId") Integer cUId, @Param("serialNo") Integer serialNo);

	@Delete ("DELETE FROM capacityutilisationdetails WHERE CUId = #{cUId} AND SerialNo = #{serialNo} ")
	void  deleteCapacityutilisationdetails(@Param("cUId") Integer cUId, @Param("serialNo") Integer serialNo);

    void updateCapacityutilisationdetails(Capacityutilisationdetails capacityutilisationdetails);
}
