package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Revenuebudgetplandetails;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface RevenuebudgetplandetailsMapper{

	@Select ("SELECT * FROM revenuebudgetplandetails")
	List<Revenuebudgetplandetails> getAllRevenuebudgetplandetails();

	@Select ("SELECT * FROM revenuebudgetplandetails WHERE RBPId = #{rBPId} AND SerialNo = #{serialNo} ")
	Revenuebudgetplandetails getRevenuebudgetplandetails(@Param("rBPId") Integer rBPId, @Param("serialNo") Integer serialNo);

	@Insert ("INSERT INTO revenuebudgetplandetails(RBPId, SerialNo, MainCategory, SubCategory, ItemCode, LabourCharge, RMCost, CustomerCode, Remarks, AprQty, MayQty, JunQty, JulQty, AugQty, SepQty, OctQty, NovQty, DecQty, JanQty, FebQty, MarQty)  VALUES (#{rBPId} , #{serialNo} , #{mainCategory} , #{subCategory} , #{itemCode} , #{labourCharge} , #{rMCost} , #{customerCode} , #{remarks} , #{aprQty} , #{mayQty} , #{junQty} , #{julQty} , #{augQty} , #{sepQty} , #{octQty} , #{novQty} , #{decQty} , #{janQty} , #{febQty} , #{marQty} )")
	void  saveRevenuebudgetplandetails(Revenuebudgetplandetails revenuebudgetplandetails);

	@Update ("UPDATE  revenuebudgetplandetails SET MainCategory = #{mainCategory}, SubCategory = #{subCategory}, ItemCode = #{itemCode}, LabourCharge = #{labourCharge}, RMCost = #{rMCost}, CustomerCode = #{customerCode}, Remarks = #{remarks}, AprQty = #{aprQty}, MayQty = #{mayQty}, JunQty = #{junQty}, JulQty = #{julQty}, AugQty = #{augQty}, SepQty = #{sepQty}, OctQty = #{octQty}, NovQty = #{novQty}, DecQty = #{decQty}, JanQty = #{janQty}, FebQty = #{febQty}, MarQty = #{marQty} WHERE RBPId = #{rBPId} AND SerialNo = #{serialNo} ")
	void  updateRevenuebudgetplandetails(@Param("rBPId") Integer rBPId, @Param("serialNo") Integer serialNo);

	@Delete ("DELETE FROM revenuebudgetplandetails WHERE RBPId = #{rBPId} AND SerialNo = #{serialNo} ")
	void  deleteRevenuebudgetplandetails(@Param("rBPId") Integer rBPId, @Param("serialNo") Integer serialNo);

    void updateRevenuebudgetplandetails(Revenuebudgetplandetails revenuebudgetplandetails);
}
