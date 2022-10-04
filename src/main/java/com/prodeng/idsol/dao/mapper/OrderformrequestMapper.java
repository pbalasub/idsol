package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Orderformrequest;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface OrderformrequestMapper{

	@Select ("SELECT * FROM orderformrequest")
	List<Orderformrequest> getAllOrderformrequest();

	@Select ("SELECT * FROM orderformrequest WHERE OFId = #{oFId} ")
	Orderformrequest getOrderformrequest(@Param("oFId") Integer oFId);

	@Insert ("INSERT INTO orderformrequest(OFId, OFNo, OFDate, Dept, Type, CustomerCode, Remarks, ClosureStatus, ClosureRemarks, ClosureName, ClosureDate, ClosureTime, RejectReason, Comments, Status, Stage, StageOneName, StageOneDate, StageOneTime, StageTwoName, StageTwoDate, StageTwoTime, StageThreeName, StageThreeDate, StageThreeTime, StageFourName, StageFourDate, StageFourTime, StageFiveName, StageFiveDate, StageFiveTime)  VALUES (#{oFId} , #{oFNo} , #{oFDate} , #{dept} , #{type} , #{customerCode} , #{remarks} , #{closureStatus} , #{closureRemarks} , #{closureName} , #{closureDate} , #{closureTime} , #{rejectReason} , #{comments} , #{status} , #{stage} , #{stageOneName} , #{stageOneDate} , #{stageOneTime} , #{stageTwoName} , #{stageTwoDate} , #{stageTwoTime} , #{stageThreeName} , #{stageThreeDate} , #{stageThreeTime} , #{stageFourName} , #{stageFourDate} , #{stageFourTime} , #{stageFiveName} , #{stageFiveDate} , #{stageFiveTime} )")
	void  saveOrderformrequest(Orderformrequest orderformrequest);

	@Update ("UPDATE  orderformrequest SET OFNo = #{oFNo}, OFDate = #{oFDate}, Dept = #{dept}, Type = #{type}, CustomerCode = #{customerCode}, Remarks = #{remarks}, ClosureStatus = #{closureStatus}, ClosureRemarks = #{closureRemarks}, ClosureName = #{closureName}, ClosureDate = #{closureDate}, ClosureTime = #{closureTime}, RejectReason = #{rejectReason}, Comments = #{comments}, Status = #{status}, Stage = #{stage}, StageOneName = #{stageOneName}, StageOneDate = #{stageOneDate}, StageOneTime = #{stageOneTime}, StageTwoName = #{stageTwoName}, StageTwoDate = #{stageTwoDate}, StageTwoTime = #{stageTwoTime}, StageThreeName = #{stageThreeName}, StageThreeDate = #{stageThreeDate}, StageThreeTime = #{stageThreeTime}, StageFourName = #{stageFourName}, StageFourDate = #{stageFourDate}, StageFourTime = #{stageFourTime}, StageFiveName = #{stageFiveName}, StageFiveDate = #{stageFiveDate}, StageFiveTime = #{stageFiveTime} WHERE OFId = #{oFId} ")
	void  updateOrderformrequest(@Param("oFId") Integer oFId);

	@Delete ("DELETE FROM orderformrequest WHERE OFId = #{oFId} ")
	void  deleteOrderformrequest(@Param("oFId") Integer oFId);

}
