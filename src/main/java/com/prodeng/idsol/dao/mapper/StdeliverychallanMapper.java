package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Stdeliverychallan;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface StdeliverychallanMapper{

	@Select ("SELECT * FROM stdeliverychallan")
	List<Stdeliverychallan> getAllStdeliverychallan();

	@Select ("SELECT * FROM stdeliverychallan WHERE DCId = #{dCId} ")
	Stdeliverychallan getStdeliverychallan(@Param("dCId") Integer dCId);

	@Insert ("INSERT INTO stdeliverychallan(DCId, DCNo, DCType, DCDate, OrderType, OrderNo, CustomerCode, YourDCRef, DelyAt, TransCode, TransName, WeighBridge, WeighBillNo, VehicleNo, DriverName, Remarks, DelyPerson1, DelyPerson2, Status, Stage, RejectReason, Comments, StageOneName, StageOneDate, StageOneTime, StageTwoName, StageTwoDate, StageTwoTime, StageThreeName, StageThreeDate, StageThreeTime, StageFourName, StageFourDate, StageFourTime, StageFiveName, StageFiveDate, StageFiveTime, ClosureStatus, ClosureRemarks, ClosureName, ClosureDate, ClosureTime, ValueOfGoodsRs, ValueOfGoodsWords, DeliveryDate, DelyCode, ProcType)  VALUES (#{dCId} , #{dCNo} , #{dCType} , #{dCDate} , #{orderType} , #{orderNo} , #{customerCode} , #{yourDCRef} , #{delyAt} , #{transCode} , #{transName} , #{weighBridge} , #{weighBillNo} , #{vehicleNo} , #{driverName} , #{remarks} , #{delyPerson1} , #{delyPerson2} , #{status} , #{stage} , #{rejectReason} , #{comments} , #{stageOneName} , #{stageOneDate} , #{stageOneTime} , #{stageTwoName} , #{stageTwoDate} , #{stageTwoTime} , #{stageThreeName} , #{stageThreeDate} , #{stageThreeTime} , #{stageFourName} , #{stageFourDate} , #{stageFourTime} , #{stageFiveName} , #{stageFiveDate} , #{stageFiveTime} , #{closureStatus} , #{closureRemarks} , #{closureName} , #{closureDate} , #{closureTime} , #{valueOfGoodsRs} , #{valueOfGoodsWords} , #{deliveryDate} , #{delyCode} , #{procType} )")
	void  saveStdeliverychallan(Stdeliverychallan stdeliverychallan);

	@Update ("UPDATE  stdeliverychallan SET DCNo = #{dCNo}, DCType = #{dCType}, DCDate = #{dCDate}, OrderType = #{orderType}, OrderNo = #{orderNo}, CustomerCode = #{customerCode}, YourDCRef = #{yourDCRef}, DelyAt = #{delyAt}, TransCode = #{transCode}, TransName = #{transName}, WeighBridge = #{weighBridge}, WeighBillNo = #{weighBillNo}, VehicleNo = #{vehicleNo}, DriverName = #{driverName}, Remarks = #{remarks}, DelyPerson1 = #{delyPerson1}, DelyPerson2 = #{delyPerson2}, Status = #{status}, Stage = #{stage}, RejectReason = #{rejectReason}, Comments = #{comments}, StageOneName = #{stageOneName}, StageOneDate = #{stageOneDate}, StageOneTime = #{stageOneTime}, StageTwoName = #{stageTwoName}, StageTwoDate = #{stageTwoDate}, StageTwoTime = #{stageTwoTime}, StageThreeName = #{stageThreeName}, StageThreeDate = #{stageThreeDate}, StageThreeTime = #{stageThreeTime}, StageFourName = #{stageFourName}, StageFourDate = #{stageFourDate}, StageFourTime = #{stageFourTime}, StageFiveName = #{stageFiveName}, StageFiveDate = #{stageFiveDate}, StageFiveTime = #{stageFiveTime}, ClosureStatus = #{closureStatus}, ClosureRemarks = #{closureRemarks}, ClosureName = #{closureName}, ClosureDate = #{closureDate}, ClosureTime = #{closureTime}, ValueOfGoodsRs = #{valueOfGoodsRs}, ValueOfGoodsWords = #{valueOfGoodsWords}, DeliveryDate = #{deliveryDate}, DelyCode = #{delyCode}, ProcType = #{procType} WHERE DCId = #{dCId} ")
	void  updateStdeliverychallan(@Param("dCId") Integer dCId);

	@Delete ("DELETE FROM stdeliverychallan WHERE DCId = #{dCId} ")
	void  deleteStdeliverychallan(@Param("dCId") Integer dCId);

}
