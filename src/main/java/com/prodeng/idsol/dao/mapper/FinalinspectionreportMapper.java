package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Finalinspectionreport;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface FinalinspectionreportMapper{

	@Select ("SELECT * FROM finalinspectionreport")
	List<Finalinspectionreport> getAllFinalinspectionreport();

	@Select ("SELECT * FROM finalinspectionreport WHERE FIRId = #{fIRId} ")
	Finalinspectionreport getFinalinspectionreport(@Param("fIRId") Integer fIRId);

	@Insert ("INSERT INTO finalinspectionreport(FIRId, FIRNo, FIRDate, ControlPlanNo, CustomerCode, ItemCode, DrawingName, RevisionNo, CustItemCode, DCNo, FIRQty, SampleQty, InspectedBy1, InspectedBy2, InspectedBy3, InspectedBy4, Remarks, RejectReason, Comments, Status, Stage, StageOneName, StageOneDate, StageOneTime, StageTwoName, StageTwoDate, StageTwoTime, StageThreeName, StageThreeDate, StageThreeTime, FIRCondition, Specification, SupplierCode)  VALUES (#{fIRId} , #{fIRNo} , #{fIRDate} , #{controlPlanNo} , #{customerCode} , #{itemCode} , #{drawingName} , #{revisionNo} , #{custItemCode} , #{dCNo} , #{fIRQty} , #{sampleQty} , #{inspectedBy1} , #{inspectedBy2} , #{inspectedBy3} , #{inspectedBy4} , #{remarks} , #{rejectReason} , #{comments} , #{status} , #{stage} , #{stageOneName} , #{stageOneDate} , #{stageOneTime} , #{stageTwoName} , #{stageTwoDate} , #{stageTwoTime} , #{stageThreeName} , #{stageThreeDate} , #{stageThreeTime} , #{fIRCondition} , #{specification} , #{supplierCode} )")
	void  saveFinalinspectionreport(Finalinspectionreport finalinspectionreport);

	@Update ("UPDATE  finalinspectionreport SET FIRNo = #{fIRNo}, FIRDate = #{fIRDate}, ControlPlanNo = #{controlPlanNo}, CustomerCode = #{customerCode}, ItemCode = #{itemCode}, DrawingName = #{drawingName}, RevisionNo = #{revisionNo}, CustItemCode = #{custItemCode}, DCNo = #{dCNo}, FIRQty = #{fIRQty}, SampleQty = #{sampleQty}, InspectedBy1 = #{inspectedBy1}, InspectedBy2 = #{inspectedBy2}, InspectedBy3 = #{inspectedBy3}, InspectedBy4 = #{inspectedBy4}, Remarks = #{remarks}, RejectReason = #{rejectReason}, Comments = #{comments}, Status = #{status}, Stage = #{stage}, StageOneName = #{stageOneName}, StageOneDate = #{stageOneDate}, StageOneTime = #{stageOneTime}, StageTwoName = #{stageTwoName}, StageTwoDate = #{stageTwoDate}, StageTwoTime = #{stageTwoTime}, StageThreeName = #{stageThreeName}, StageThreeDate = #{stageThreeDate}, StageThreeTime = #{stageThreeTime}, FIRCondition = #{fIRCondition}, Specification = #{specification}, SupplierCode = #{supplierCode} WHERE FIRId = #{fIRId} ")
	void  updateFinalinspectionreport(@Param("fIRId") Finalinspectionreport fIRId);

	@Delete ("DELETE FROM finalinspectionreport WHERE FIRId = #{fIRId} ")
	void  deleteFinalinspectionreport(@Param("fIRId") Integer fIRId);

}
