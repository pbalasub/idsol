package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Workorderrequest;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface WorkorderrequestMapper{

	@Select ("SELECT * FROM workorderrequest")
	List<Workorderrequest> getAllWorkorderrequest();

	@Select ("SELECT * FROM workorderrequest WHERE WOId = #{wOId} ")
	Workorderrequest getWorkorderrequest(@Param("wOId") Integer wOId);

	@Insert ("INSERT INTO workorderrequest(WOId, WONo, WODate, WOType, WOSection, BatchNo, Remarks, CumWOQtyInNos, CumWOWeight, AdditivePercentage, AdditiveWeight, ClosureStatus, ClosureRemarks, ClosureName, ClosureDate, ClosureTime, RejectReason, Comments, Status, Stage, StageOneName, StageOneDate, StageOneTime, StageTwoName, StageTwoDate, StageTwoTime, StageThreeName, StageThreeDate, StageThreeTime, StageFourName, StageFourDate, StageFourTime)  VALUES (#{wOId} , #{wONo} , #{wODate} , #{wOType} , #{wOSection} , #{batchNo} , #{remarks} , #{cumWOQtyInNos} , #{cumWOWeight} , #{additivePercentage} , #{additiveWeight} , #{closureStatus} , #{closureRemarks} , #{closureName} , #{closureDate} , #{closureTime} , #{rejectReason} , #{comments} , #{status} , #{stage} , #{stageOneName} , #{stageOneDate} , #{stageOneTime} , #{stageTwoName} , #{stageTwoDate} , #{stageTwoTime} , #{stageThreeName} , #{stageThreeDate} , #{stageThreeTime} , #{stageFourName} , #{stageFourDate} , #{stageFourTime} )")
	void  saveWorkorderrequest(Workorderrequest workorderrequest);

	@Update ("UPDATE  workorderrequest SET WONo = #{wONo}, WODate = #{wODate}, WOType = #{wOType}, WOSection = #{wOSection}, BatchNo = #{batchNo}, Remarks = #{remarks}, CumWOQtyInNos = #{cumWOQtyInNos}, CumWOWeight = #{cumWOWeight}, AdditivePercentage = #{additivePercentage}, AdditiveWeight = #{additiveWeight}, ClosureStatus = #{closureStatus}, ClosureRemarks = #{closureRemarks}, ClosureName = #{closureName}, ClosureDate = #{closureDate}, ClosureTime = #{closureTime}, RejectReason = #{rejectReason}, Comments = #{comments}, Status = #{status}, Stage = #{stage}, StageOneName = #{stageOneName}, StageOneDate = #{stageOneDate}, StageOneTime = #{stageOneTime}, StageTwoName = #{stageTwoName}, StageTwoDate = #{stageTwoDate}, StageTwoTime = #{stageTwoTime}, StageThreeName = #{stageThreeName}, StageThreeDate = #{stageThreeDate}, StageThreeTime = #{stageThreeTime}, StageFourName = #{stageFourName}, StageFourDate = #{stageFourDate}, StageFourTime = #{stageFourTime} WHERE WOId = #{wOId} ")
	void  updateWorkorderrequest(@Param("wOId") Integer wOId);

	@Delete ("DELETE FROM workorderrequest WHERE WOId = #{wOId} ")
	void  deleteWorkorderrequest(@Param("wOId") Integer wOId);

}
