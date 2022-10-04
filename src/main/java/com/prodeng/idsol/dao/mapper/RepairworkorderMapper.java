package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Repairworkorder;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface RepairworkorderMapper{

	@Select ("SELECT * FROM repairworkorder")
	List<Repairworkorder> getAllRepairworkorder();

	@Select ("SELECT * FROM repairworkorder WHERE RWOId = #{rWOId} ")
	Repairworkorder getRepairworkorder(@Param("rWOId") Integer rWOId);

	@Insert ("INSERT INTO repairworkorder(RWOId, RWONo, RWRNo, RWODate, OrderType, dept, SupplierCode, PackageForward, Freight, Insurance, Others, BasicED, VAT, Guarantee, PaymentTerms, DeliveryAt, TotalRWO, Advance, ToBePaid, ServiceTax, RejectReason, Comments, Status, Stage, StageOneName, StageOneDate, StageOneTime, StageTwoName, StageTwoDate, StageTwoTime, StageThreeName, StageThreeDate, StageThreeTime, DisbursedAmt, ClosureStatus, ClosureRemarks, ClosureName, ClosureDate, ClosureTime)  VALUES (#{rWOId} , #{rWONo} , #{rWRNo} , #{rWODate} , #{orderType} , #{dept} , #{supplierCode} , #{packageForward} , #{freight} , #{insurance} , #{others} , #{basicED} , #{vAT} , #{guarantee} , #{paymentTerms} , #{deliveryAt} , #{totalRWO} , #{advance} , #{toBePaid} , #{serviceTax} , #{rejectReason} , #{comments} , #{status} , #{stage} , #{stageOneName} , #{stageOneDate} , #{stageOneTime} , #{stageTwoName} , #{stageTwoDate} , #{stageTwoTime} , #{stageThreeName} , #{stageThreeDate} , #{stageThreeTime} , #{disbursedAmt} , #{closureStatus} , #{closureRemarks} , #{closureName} , #{closureDate} , #{closureTime} )")
	void  saveRepairworkorder(Repairworkorder repairworkorder);

	@Update ("UPDATE  repairworkorder SET RWONo = #{rWONo}, RWRNo = #{rWRNo}, RWODate = #{rWODate}, OrderType = #{orderType}, dept = #{dept}, SupplierCode = #{supplierCode}, PackageForward = #{packageForward}, Freight = #{freight}, Insurance = #{insurance}, Others = #{others}, BasicED = #{basicED}, VAT = #{vAT}, Guarantee = #{guarantee}, PaymentTerms = #{paymentTerms}, DeliveryAt = #{deliveryAt}, TotalRWO = #{totalRWO}, Advance = #{advance}, ToBePaid = #{toBePaid}, ServiceTax = #{serviceTax}, RejectReason = #{rejectReason}, Comments = #{comments}, Status = #{status}, Stage = #{stage}, StageOneName = #{stageOneName}, StageOneDate = #{stageOneDate}, StageOneTime = #{stageOneTime}, StageTwoName = #{stageTwoName}, StageTwoDate = #{stageTwoDate}, StageTwoTime = #{stageTwoTime}, StageThreeName = #{stageThreeName}, StageThreeDate = #{stageThreeDate}, StageThreeTime = #{stageThreeTime}, DisbursedAmt = #{disbursedAmt}, ClosureStatus = #{closureStatus}, ClosureRemarks = #{closureRemarks}, ClosureName = #{closureName}, ClosureDate = #{closureDate}, ClosureTime = #{closureTime} WHERE RWOId = #{rWOId} ")
	void  updateRepairworkorder(@Param("rWOId") Integer rWOId);

	@Delete ("DELETE FROM repairworkorder WHERE RWOId = #{rWOId} ")
	void  deleteRepairworkorder(@Param("rWOId") Integer rWOId);

}
