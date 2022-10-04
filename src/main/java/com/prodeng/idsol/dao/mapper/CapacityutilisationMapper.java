package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Capacityutilisation;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface CapacityutilisationMapper{

	@Select ("SELECT * FROM capacityutilisation")
	List<Capacityutilisation> getAllCapacityutilisation();

	@Select ("SELECT * FROM capacityutilisation WHERE CUId = #{cUId} ")
	Capacityutilisation getCapacityutilisation(@Param("cUId") Integer cUId);

	@Insert ("INSERT INTO capacityutilisation(CUId, CUNo, CUDate, CUName, CUFromDate, CUTillDate, Remarks, LastUpdatedBy, LastUpdatedDate, LastUpdatedTime)  VALUES (#{cUId} , #{cUNo} , #{cUDate} , #{cUName} , #{cUFromDate} , #{cUTillDate} , #{remarks} , #{lastUpdatedBy} , #{lastUpdatedDate} , #{lastUpdatedTime} )")
	void  saveCapacityutilisation(Capacityutilisation capacityutilisation);

	@Update ("UPDATE  capacityutilisation SET CUNo = #{cUNo}, CUDate = #{cUDate}, CUName = #{cUName}, CUFromDate = #{cUFromDate}, CUTillDate = #{cUTillDate}, Remarks = #{remarks}, LastUpdatedBy = #{lastUpdatedBy}, LastUpdatedDate = #{lastUpdatedDate}, LastUpdatedTime = #{lastUpdatedTime} WHERE CUId = #{cUId} ")
	void  updateCapacityutilisation(@Param("cUId") Integer cUId);

	@Delete ("DELETE FROM capacityutilisation WHERE CUId = #{cUId} ")
	void  deleteCapacityutilisation(@Param("cUId") Integer cUId);

}
