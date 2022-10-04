package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Receivinginspectiondispersion;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface ReceivinginspectiondispersionMapper{

	@Select ("SELECT * FROM receivinginspectiondispersion")
	List<Receivinginspectiondispersion> getAllReceivinginspectiondispersion();

	@Select ("SELECT * FROM receivinginspectiondispersion WHERE RIId = #{rIId} ")
	Receivinginspectiondispersion getReceivinginspectiondispersion(@Param("rIId") Integer rIId);

	@Insert ("INSERT INTO receivinginspectiondispersion(RIId, SegregationAt, SegregationQty, AcceptedQty, AcceptedDetails, RejectedQty, RejectedDetails, AccConcessionQty, AccConcessionDetails, AccConditionQty, AccConditionDetails)  VALUES (#{rIId} , #{segregationAt} , #{segregationQty} , #{acceptedQty} , #{acceptedDetails} , #{rejectedQty} , #{rejectedDetails} , #{accConcessionQty} , #{accConcessionDetails} , #{accConditionQty} , #{accConditionDetails} )")
	void  saveReceivinginspectiondispersion(Receivinginspectiondispersion receivinginspectiondispersion);

	@Update ("UPDATE  receivinginspectiondispersion SET SegregationAt = #{segregationAt}, SegregationQty = #{segregationQty}, AcceptedQty = #{acceptedQty}, AcceptedDetails = #{acceptedDetails}, RejectedQty = #{rejectedQty}, RejectedDetails = #{rejectedDetails}, AccConcessionQty = #{accConcessionQty}, AccConcessionDetails = #{accConcessionDetails}, AccConditionQty = #{accConditionQty}, AccConditionDetails = #{accConditionDetails} WHERE RIId = #{rIId} ")
	void  updateReceivinginspectiondispersion(@Param("rIId") Integer rIId);

	@Delete ("DELETE FROM receivinginspectiondispersion WHERE RIId = #{rIId} ")
	void  deleteReceivinginspectiondispersion(@Param("rIId") Integer rIId);

}
