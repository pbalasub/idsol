package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Repairworkrequest;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface RepairworkrequestMapper{

	@Select ("SELECT * FROM repairworkrequest")
	List<Repairworkrequest> getAllRepairworkrequest();

	@Select ("SELECT * FROM repairworkrequest WHERE RWRId = #{rWRId} ")
	Repairworkrequest getRepairworkrequest(@Param("rWRId") Integer rWRId);

	@Insert ("INSERT INTO repairworkrequest(RWRId, RWRNo, RWRDate, OrderType, dept, RejectReason, Comments, Status, Stage, StageOneName, StageOneDate, StageOneTime, StageTwoName, StageTwoDate, StageTwoTime, StageThreeName, StageThreeDate, StageThreeTime, StageFourName, StageFourDate, StageFourTime, StageFiveName, StageFiveDate, StageFiveTime, ClosureStatus, ClosureRemarks, ClosureName, ClosureDate, ClosureTime)  VALUES (#{rWRId} , #{rWRNo} , #{rWRDate} , #{orderType} , #{dept} , #{rejectReason} , #{comments} , #{status} , #{stage} , #{stageOneName} , #{stageOneDate} , #{stageOneTime} , #{stageTwoName} , #{stageTwoDate} , #{stageTwoTime} , #{stageThreeName} , #{stageThreeDate} , #{stageThreeTime} , #{stageFourName} , #{stageFourDate} , #{stageFourTime} , #{stageFiveName} , #{stageFiveDate} , #{stageFiveTime} , #{closureStatus} , #{closureRemarks} , #{closureName} , #{closureDate} , #{closureTime} )")
	void  saveRepairworkrequest(Repairworkrequest repairworkrequest);

	@Update ("UPDATE  repairworkrequest SET RWRNo = #{rWRNo}, RWRDate = #{rWRDate}, OrderType = #{orderType}, dept = #{dept}, RejectReason = #{rejectReason}, Comments = #{comments}, Status = #{status}, Stage = #{stage}, StageOneName = #{stageOneName}, StageOneDate = #{stageOneDate}, StageOneTime = #{stageOneTime}, StageTwoName = #{stageTwoName}, StageTwoDate = #{stageTwoDate}, StageTwoTime = #{stageTwoTime}, StageThreeName = #{stageThreeName}, StageThreeDate = #{stageThreeDate}, StageThreeTime = #{stageThreeTime}, StageFourName = #{stageFourName}, StageFourDate = #{stageFourDate}, StageFourTime = #{stageFourTime}, StageFiveName = #{stageFiveName}, StageFiveDate = #{stageFiveDate}, StageFiveTime = #{stageFiveTime}, ClosureStatus = #{closureStatus}, ClosureRemarks = #{closureRemarks}, ClosureName = #{closureName}, ClosureDate = #{closureDate}, ClosureTime = #{closureTime} WHERE RWRId = #{rWRId} ")
	void  updateRepairworkrequest(@Param("rWRId") Integer rWRId);

	@Delete ("DELETE FROM repairworkrequest WHERE RWRId = #{rWRId} ")
	void  deleteRepairworkrequest(@Param("rWRId") Integer rWRId);

}
