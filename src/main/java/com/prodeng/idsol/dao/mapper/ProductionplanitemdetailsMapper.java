package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Productionplanitemdetails;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface ProductionplanitemdetailsMapper{

	@Select ("SELECT * FROM productionplanitemdetails")
	List<Productionplanitemdetails> getAllProductionplanitemdetails();

	@Select ("SELECT * FROM productionplanitemdetails WHERE PPId = #{pPId} AND ItemCode = #{itemCode} AND SerialNo = #{serialNo} ")
	Productionplanitemdetails getProductionplanitemdetails(@Param("pPId") Integer pPId, @Param("itemCode") String itemCode, @Param("serialNo") Integer serialNo);

	@Insert ("INSERT INTO productionplanitemdetails(PPId, ItemCode, SerialNo, QtyInNos, TargetDate)  VALUES (#{pPId} , #{itemCode} , #{serialNo} , #{qtyInNos} , #{targetDate} )")
	void  saveProductionplanitemdetails(Productionplanitemdetails productionplanitemdetails);

	@Update ("UPDATE  productionplanitemdetails SET QtyInNos = #{qtyInNos}, TargetDate = #{targetDate} WHERE PPId = #{pPId} AND ItemCode = #{itemCode} AND SerialNo = #{serialNo} ")
	void  updateProductionplanitemdetails(@Param("pPId") Integer pPId, @Param("itemCode") String itemCode, @Param("serialNo") Integer serialNo);

	@Delete ("DELETE FROM productionplanitemdetails WHERE PPId = #{pPId} AND ItemCode = #{itemCode} AND SerialNo = #{serialNo} ")
	void  deleteProductionplanitemdetails(@Param("pPId") Integer pPId, @Param("itemCode") String itemCode, @Param("serialNo") Integer serialNo);

    void updateProductionplanitemdetails(Productionplanitemdetails productionplanitemdetails);
}
