package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Receivinginspection;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface ReceivinginspectionMapper{

	@Select ("SELECT * FROM receivinginspection")
	List<Receivinginspection> getAllReceivinginspection();

	@Select ("SELECT * FROM receivinginspection WHERE RIId = #{rIId} ")
	Receivinginspection getReceivinginspection(@Param("rIId") Integer rIId);

	@Insert ("INSERT INTO receivinginspection(RIId, RINo, RIDate, InwardNo, ItemCode, InspectionReport, Receipt, ColourCode, ReceivedQty, SampleQty, TestCertificateNo, TestedAt, ReportDetail, Result, ResultReason, RejectReason, Comments, Status, Stage, StageOneName, StageOneDate, StageOneTime, StageTwoName, StageTwoDate, StageTwoTime, StageThreeName, StageThreeDate, StageThreeTime, StageFourName, StageFourDate, StageFourTime, BatchNoInd, BatchNo, CPNo, MRNNo, CPFor, SupplierCode, SupplierDCNo, WorkOrderNo)  VALUES (#{rIId} , #{rINo} , #{rIDate} , #{inwardNo} , #{itemCode} , #{inspectionReport} , #{receipt} , #{colourCode} , #{receivedQty} , #{sampleQty} , #{testCertificateNo} , #{testedAt} , #{reportDetail} , #{result} , #{resultReason} , #{rejectReason} , #{comments} , #{status} , #{stage} , #{stageOneName} , #{stageOneDate} , #{stageOneTime} , #{stageTwoName} , #{stageTwoDate} , #{stageTwoTime} , #{stageThreeName} , #{stageThreeDate} , #{stageThreeTime} , #{stageFourName} , #{stageFourDate} , #{stageFourTime} , #{batchNoInd} , #{batchNo} , #{cPNo} , #{mRNNo} , #{cPFor} , #{supplierCode} , #{supplierDCNo} , #{workOrderNo} )")
	void  saveReceivinginspection(Receivinginspection receivinginspection);

	@Update ("UPDATE  receivinginspection SET RINo = #{rINo}, RIDate = #{rIDate}, InwardNo = #{inwardNo}, ItemCode = #{itemCode}, InspectionReport = #{inspectionReport}, Receipt = #{receipt}, ColourCode = #{colourCode}, ReceivedQty = #{receivedQty}, SampleQty = #{sampleQty}, TestCertificateNo = #{testCertificateNo}, TestedAt = #{testedAt}, ReportDetail = #{reportDetail}, Result = #{result}, ResultReason = #{resultReason}, RejectReason = #{rejectReason}, Comments = #{comments}, Status = #{status}, Stage = #{stage}, StageOneName = #{stageOneName}, StageOneDate = #{stageOneDate}, StageOneTime = #{stageOneTime}, StageTwoName = #{stageTwoName}, StageTwoDate = #{stageTwoDate}, StageTwoTime = #{stageTwoTime}, StageThreeName = #{stageThreeName}, StageThreeDate = #{stageThreeDate}, StageThreeTime = #{stageThreeTime}, StageFourName = #{stageFourName}, StageFourDate = #{stageFourDate}, StageFourTime = #{stageFourTime}, BatchNoInd = #{batchNoInd}, BatchNo = #{batchNo}, CPNo = #{cPNo}, MRNNo = #{mRNNo}, CPFor = #{cPFor}, SupplierCode = #{supplierCode}, SupplierDCNo = #{supplierDCNo}, WorkOrderNo = #{workOrderNo} WHERE RIId = #{rIId} ")
	void  updateReceivinginspection(@Param("rIId") Integer rIId);

	@Delete ("DELETE FROM receivinginspection WHERE RIId = #{rIId} ")
	void  deleteReceivinginspection(@Param("rIId") Integer rIId);

}
