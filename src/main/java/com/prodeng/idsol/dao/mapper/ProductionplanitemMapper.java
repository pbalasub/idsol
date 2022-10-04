package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Productionplanitem;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface ProductionplanitemMapper{

	@Select ("SELECT * FROM productionplanitem")
	List<Productionplanitem> getAllProductionplanitem();

	@Select ("SELECT * FROM productionplanitem WHERE PPId = #{pPId} AND ItemCode = #{itemCode} ")
	Productionplanitem getProductionplanitem(@Param("pPId") Integer pPId, @Param("itemCode") String itemCode);

	@Insert ("INSERT INTO productionplanitem(PPId, ItemCode)  VALUES (#{pPId} , #{itemCode} )")
	void  saveProductionplanitem(Productionplanitem productionplanitem);

	@Update ("UPDATE  productionplanitem SET  WHERE PPId = #{pPId} AND ItemCode = #{itemCode} ")
	void  updateProductionplanitem(@Param("pPId") Integer pPId, @Param("itemCode") String itemCode);

	@Delete ("DELETE FROM productionplanitem WHERE PPId = #{pPId} AND ItemCode = #{itemCode} ")
	void  deleteProductionplanitem(@Param("pPId") Integer pPId, @Param("itemCode") String itemCode);

    void updateProductionplanitem(Productionplanitem productionplanitem);
}
