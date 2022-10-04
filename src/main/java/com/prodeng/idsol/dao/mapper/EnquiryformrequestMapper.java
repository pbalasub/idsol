package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Enquiryformrequest;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface EnquiryformrequestMapper{

	@Select ("SELECT * FROM enquiryformrequest")
	List<Enquiryformrequest> getAllEnquiryformrequest();

	@Select ("SELECT * FROM enquiryformrequest WHERE EnquiryId = #{enquiryId} ")
	Enquiryformrequest getEnquiryformrequest(@Param("enquiryId") Integer enquiryId);

	@Insert ("INSERT INTO enquiryformrequest(EnquiryId, EnquiryNo, EnquiryType, Dept, SupplierCode, ReqLatestDate, Remarks, QuoteNo, FieldPersonRemarks, SupplierRemarks, ApproverRemarks, PurchaserName1, PurchaserName2, RefNo, QuoteValidFrom, QuoteValidTill, Status, Stage, RejectReason, StageOneName, StageOneDate, StageOneTime, StageTwoName, StageTwoDate, StageTwoTime, StageThreeName, StageThreeDate, StageThreeTime, StageFourName, StageFourDate, StageFourTime, StageFiveName, StageFiveDate, StageFiveTime)  VALUES (#{enquiryId} , #{enquiryNo} , #{enquiryType} , #{dept} , #{supplierCode} , #{reqLatestDate} , #{remarks} , #{quoteNo} , #{fieldPersonRemarks} , #{supplierRemarks} , #{approverRemarks} , #{purchaserName1} , #{purchaserName2} , #{refNo} , #{quoteValidFrom} , #{quoteValidTill} , #{status} , #{stage} , #{rejectReason} , #{stageOneName} , #{stageOneDate} , #{stageOneTime} , #{stageTwoName} , #{stageTwoDate} , #{stageTwoTime} , #{stageThreeName} , #{stageThreeDate} , #{stageThreeTime} , #{stageFourName} , #{stageFourDate} , #{stageFourTime} , #{stageFiveName} , #{stageFiveDate} , #{stageFiveTime} )")
	void  saveEnquiryformrequest(Enquiryformrequest enquiryformrequest);

	@Update ("UPDATE  enquiryformrequest SET EnquiryNo = #{enquiryNo}, EnquiryType = #{enquiryType}, Dept = #{dept}, SupplierCode = #{supplierCode}, ReqLatestDate = #{reqLatestDate}, Remarks = #{remarks}, QuoteNo = #{quoteNo}, FieldPersonRemarks = #{fieldPersonRemarks}, SupplierRemarks = #{supplierRemarks}, ApproverRemarks = #{approverRemarks}, PurchaserName1 = #{purchaserName1}, PurchaserName2 = #{purchaserName2}, RefNo = #{refNo}, QuoteValidFrom = #{quoteValidFrom}, QuoteValidTill = #{quoteValidTill}, Status = #{status}, Stage = #{stage}, RejectReason = #{rejectReason}, StageOneName = #{stageOneName}, StageOneDate = #{stageOneDate}, StageOneTime = #{stageOneTime}, StageTwoName = #{stageTwoName}, StageTwoDate = #{stageTwoDate}, StageTwoTime = #{stageTwoTime}, StageThreeName = #{stageThreeName}, StageThreeDate = #{stageThreeDate}, StageThreeTime = #{stageThreeTime}, StageFourName = #{stageFourName}, StageFourDate = #{stageFourDate}, StageFourTime = #{stageFourTime}, StageFiveName = #{stageFiveName}, StageFiveDate = #{stageFiveDate}, StageFiveTime = #{stageFiveTime} WHERE EnquiryId = #{enquiryId} ")
	void  updateEnquiryformrequest(@Param("enquiryId") Integer enquiryId);

	@Delete ("DELETE FROM enquiryformrequest WHERE EnquiryId = #{enquiryId} ")
	void  deleteEnquiryformrequest(@Param("enquiryId") Integer enquiryId);

}
