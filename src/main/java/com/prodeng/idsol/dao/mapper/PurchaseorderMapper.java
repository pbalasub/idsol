package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Purchaseorder;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface PurchaseorderMapper{

	@Select ("SELECT * FROM purchaseorder")
	List<Purchaseorder> getAllPurchaseorder();

	@Select ("SELECT * FROM purchaseorder WHERE POId = #{pOId} ")
	Purchaseorder getPurchaseorder(@Param("pOId") Integer pOId);

	@Insert ("INSERT INTO purchaseorder(POId, PONo, PRNo, PODate, dept, SupplierCode, PackageForward, Freight, Insurance, Others, BasicED, VAT, Guarantee, PaymentTerms, DeliveryAt, TotalPO, Advance, ToBePaid, ServiceTax, DisbursedAmt, RejectReason, Comments, Status, Stage, StageOneName, StageOneDate, StageOneTime, StageTwoName, StageTwoDate, StageTwoTime, StageThreeName, StageThreeDate, StageThreeTime, ClosureStatus, ClosureRemarks, ClosureName, ClosureDate, ClosureTime)  VALUES (#{pOId} , #{pONo} , #{pRNo} , #{pODate} , #{dept} , #{supplierCode} , #{packageForward} , #{freight} , #{insurance} , #{others} , #{basicED} , #{vAT} , #{guarantee} , #{paymentTerms} , #{deliveryAt} , #{totalPO} , #{advance} , #{toBePaid} , #{serviceTax} , #{disbursedAmt} , #{rejectReason} , #{comments} , #{status} , #{stage} , #{stageOneName} , #{stageOneDate} , #{stageOneTime} , #{stageTwoName} , #{stageTwoDate} , #{stageTwoTime} , #{stageThreeName} , #{stageThreeDate} , #{stageThreeTime} , #{closureStatus} , #{closureRemarks} , #{closureName} , #{closureDate} , #{closureTime} )")
	void  savePurchaseorder(Purchaseorder purchaseorder);

	@Update ("UPDATE  purchaseorder SET PONo = #{pONo}, PRNo = #{pRNo}, PODate = #{pODate}, dept = #{dept}, SupplierCode = #{supplierCode}, PackageForward = #{packageForward}, Freight = #{freight}, Insurance = #{insurance}, Others = #{others}, BasicED = #{basicED}, VAT = #{vAT}, Guarantee = #{guarantee}, PaymentTerms = #{paymentTerms}, DeliveryAt = #{deliveryAt}, TotalPO = #{totalPO}, Advance = #{advance}, ToBePaid = #{toBePaid}, ServiceTax = #{serviceTax}, DisbursedAmt = #{disbursedAmt}, RejectReason = #{rejectReason}, Comments = #{comments}, Status = #{status}, Stage = #{stage}, StageOneName = #{stageOneName}, StageOneDate = #{stageOneDate}, StageOneTime = #{stageOneTime}, StageTwoName = #{stageTwoName}, StageTwoDate = #{stageTwoDate}, StageTwoTime = #{stageTwoTime}, StageThreeName = #{stageThreeName}, StageThreeDate = #{stageThreeDate}, StageThreeTime = #{stageThreeTime}, ClosureStatus = #{closureStatus}, ClosureRemarks = #{closureRemarks}, ClosureName = #{closureName}, ClosureDate = #{closureDate}, ClosureTime = #{closureTime} WHERE POId = #{pOId} ")
	void  updatePurchaseorder(@Param("pOId") Integer pOId);

	@Delete ("DELETE FROM purchaseorder WHERE POId = #{pOId} ")
	void  deletePurchaseorder(@Param("pOId") Integer pOId);

}
