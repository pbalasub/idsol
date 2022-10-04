package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Calibrationhistorycard;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface CalibrationhistorycardMapper{

	@Select ("SELECT * FROM calibrationhistorycard")
	List<Calibrationhistorycard> getAllCalibrationhistorycard();

	@Select ("SELECT * FROM calibrationhistorycard WHERE CHCId = #{cHCId} ")
	Calibrationhistorycard getCalibrationhistorycard(@Param("cHCId") Integer cHCId);

	@Insert ("INSERT INTO calibrationhistorycard(CHCId, HistoryCode, CHCDate, CalibrationAt, AcceptanceCriteria, LeastCount, Frequency, LocationUsed, LastUpdatedBy, LastUpdatedDate, LastUpdatedTime)  VALUES (#{cHCId} , #{historyCode} , #{cHCDate} , #{calibrationAt} , #{acceptanceCriteria} , #{leastCount} , #{frequency} , #{locationUsed} , #{lastUpdatedBy} , #{lastUpdatedDate} , #{lastUpdatedTime} )")
	void  saveCalibrationhistorycard(Calibrationhistorycard calibrationhistorycard);

	@Update ("UPDATE  calibrationhistorycard SET HistoryCode = #{historyCode}, CHCDate = #{cHCDate}, CalibrationAt = #{calibrationAt}, AcceptanceCriteria = #{acceptanceCriteria}, LeastCount = #{leastCount}, Frequency = #{frequency}, LocationUsed = #{locationUsed}, LastUpdatedBy = #{lastUpdatedBy}, LastUpdatedDate = #{lastUpdatedDate}, LastUpdatedTime = #{lastUpdatedTime} WHERE CHCId = #{cHCId} ")
	void  updateCalibrationhistorycard(@Param("cHCId") Integer cHCId);

	@Delete ("DELETE FROM calibrationhistorycard WHERE CHCId = #{cHCId} ")
	void  deleteCalibrationhistorycard(@Param("cHCId") Integer cHCId);

}
