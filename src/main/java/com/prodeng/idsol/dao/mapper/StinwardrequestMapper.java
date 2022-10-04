package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Stinwardrequest;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface StinwardrequestMapper{

	@Select ("SELECT * FROM stinwardrequest")
	List<Stinwardrequest> getAllStinwardrequest();

	@Select ("SELECT * FROM stinwardrequest WHERE InwardId = #{inwardId} ")
	Stinwardrequest getStinwardrequest(@Param("inwardId") Integer inwardId);

	@Insert ("INSERT INTO stinwardrequest(InwardId, inwardno, InwardDate, dept, OrderNo, OrderType, OurDcNo, OurDCType, SupplierCode, SupplierDCNo, SupplierDCDate, SupplierBillNo, SupplierBillDate, SupplierExciseGatePassNo, SupplierExciseGatePassDate, WeighAt, TransporterName, LRNo, WeighBridgeName, WeighBillNo, Remarks, InspectionReport, ReceivedThrough, ReceivedThrough1, DriverName, Status, Stage, RejectReason, Comments, StageOneName, StageOneDate, StageOneTime, StageTwoName, StageTwoDate, StageTwoTime, StageThreeName, StageThreeDate, StageThreeTime, StageFourName, StageFourDate, StageFourTime, StageFiveName, StageFiveDate, StageFiveTime, ClosureStatus, ClosureRemarks, ClosureName, ClosureDate, ClosureTime)  VALUES (#{inwardId} , #{inwardno} , #{inwardDate} , #{dept} , #{orderNo} , #{orderType} , #{ourDcNo} , #{ourDCType} , #{supplierCode} , #{supplierDCNo} , #{supplierDCDate} , #{supplierBillNo} , #{supplierBillDate} , #{supplierExciseGatePassNo} , #{supplierExciseGatePassDate} , #{weighAt} , #{transporterName} , #{lRNo} , #{weighBridgeName} , #{weighBillNo} , #{remarks} , #{inspectionReport} , #{receivedThrough} , #{receivedThrough1} , #{driverName} , #{status} , #{stage} , #{rejectReason} , #{comments} , #{stageOneName} , #{stageOneDate} , #{stageOneTime} , #{stageTwoName} , #{stageTwoDate} , #{stageTwoTime} , #{stageThreeName} , #{stageThreeDate} , #{stageThreeTime} , #{stageFourName} , #{stageFourDate} , #{stageFourTime} , #{stageFiveName} , #{stageFiveDate} , #{stageFiveTime} , #{closureStatus} , #{closureRemarks} , #{closureName} , #{closureDate} , #{closureTime} )")
	void  saveStinwardrequest(Stinwardrequest stinwardrequest);

	@Update ("UPDATE  stinwardrequest SET inwardno = #{inwardno}, InwardDate = #{inwardDate}, dept = #{dept}, OrderNo = #{orderNo}, OrderType = #{orderType}, OurDcNo = #{ourDcNo}, OurDCType = #{ourDCType}, SupplierCode = #{supplierCode}, SupplierDCNo = #{supplierDCNo}, SupplierDCDate = #{supplierDCDate}, SupplierBillNo = #{supplierBillNo}, SupplierBillDate = #{supplierBillDate}, SupplierExciseGatePassNo = #{supplierExciseGatePassNo}, SupplierExciseGatePassDate = #{supplierExciseGatePassDate}, WeighAt = #{weighAt}, TransporterName = #{transporterName}, LRNo = #{lRNo}, WeighBridgeName = #{weighBridgeName}, WeighBillNo = #{weighBillNo}, Remarks = #{remarks}, InspectionReport = #{inspectionReport}, ReceivedThrough = #{receivedThrough}, ReceivedThrough1 = #{receivedThrough1}, DriverName = #{driverName}, Status = #{status}, Stage = #{stage}, RejectReason = #{rejectReason}, Comments = #{comments}, StageOneName = #{stageOneName}, StageOneDate = #{stageOneDate}, StageOneTime = #{stageOneTime}, StageTwoName = #{stageTwoName}, StageTwoDate = #{stageTwoDate}, StageTwoTime = #{stageTwoTime}, StageThreeName = #{stageThreeName}, StageThreeDate = #{stageThreeDate}, StageThreeTime = #{stageThreeTime}, StageFourName = #{stageFourName}, StageFourDate = #{stageFourDate}, StageFourTime = #{stageFourTime}, StageFiveName = #{stageFiveName}, StageFiveDate = #{stageFiveDate}, StageFiveTime = #{stageFiveTime}, ClosureStatus = #{closureStatus}, ClosureRemarks = #{closureRemarks}, ClosureName = #{closureName}, ClosureDate = #{closureDate}, ClosureTime = #{closureTime} WHERE InwardId = #{inwardId} ")
	void  updateStinwardrequest(@Param("inwardId") Integer inwardId);

	@Delete ("DELETE FROM stinwardrequest WHERE InwardId = #{inwardId} ")
	void  deleteStinwardrequest(@Param("inwardId") Integer inwardId);

}
