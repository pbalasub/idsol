package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Itemmastercostreq;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface ItemmastercostreqMapper{

	@Select ("SELECT * FROM itemmastercostreq")
	List<Itemmastercostreq> getAllItemmastercostreq();

	@Select ("SELECT * FROM itemmastercostreq WHERE MainCategory = #{mainCategory} AND SubCategory = #{subCategory} AND ItemCode = #{itemCode} AND ReqItemCode = #{reqItemCode} ")
	Itemmastercostreq getItemmastercostreq(@Param("mainCategory") String mainCategory, @Param("subCategory") String subCategory, @Param("itemCode") String itemCode, @Param("reqItemCode") String reqItemCode);

	@Insert ("INSERT INTO itemmastercostreq(MainCategory, SubCategory, ItemCode, ReqItemCode, QtyReq, JobCost, Identity)  VALUES (#{mainCategory} , #{subCategory} , #{itemCode} , #{reqItemCode} , #{qtyReq} , #{jobCost} , #{identity} )")
	void  saveItemmastercostreq(Itemmastercostreq itemmastercostreq);

	@Update ("UPDATE  itemmastercostreq SET QtyReq = #{qtyReq}, JobCost = #{jobCost}, Identity = #{identity} WHERE MainCategory = #{mainCategory} AND SubCategory = #{subCategory} AND ItemCode = #{itemCode} AND ReqItemCode = #{reqItemCode} ")
	void  updateItemmastercostreq(@Param("mainCategory") String mainCategory, @Param("subCategory") String subCategory, @Param("itemCode") String itemCode, @Param("reqItemCode") String reqItemCode);

	@Delete ("DELETE FROM itemmastercostreq WHERE MainCategory = #{mainCategory} AND SubCategory = #{subCategory} AND ItemCode = #{itemCode} AND ReqItemCode = #{reqItemCode} ")
	void  deleteItemmastercostreq(@Param("mainCategory") String mainCategory, @Param("subCategory") String subCategory, @Param("itemCode") String itemCode, @Param("reqItemCode") String reqItemCode);

    void updateItemmastercostreq(Itemmastercostreq itemmastercostreq);
}
