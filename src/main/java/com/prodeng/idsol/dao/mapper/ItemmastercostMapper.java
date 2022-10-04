package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Itemmastercost;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface ItemmastercostMapper{

	@Select ("SELECT * FROM itemmastercost")
	List<Itemmastercost> getAllItemmastercost();

	@Select ("SELECT * FROM itemmastercost WHERE MainCategory = #{mainCategory} AND SubCategory = #{subCategory} AND ItemCode = #{itemCode} ")
	Itemmastercost getItemmastercost(@Param("mainCategory") String mainCategory, @Param("subCategory") String subCategory, @Param("itemCode") String itemCode);

	@Insert ("INSERT INTO itemmastercost(MainCategory, SubCategory, ItemCode, Remarks, LastUpdatedBy, LastUpdatedDate, LastUpdatedTime)  VALUES (#{mainCategory} , #{subCategory} , #{itemCode} , #{remarks} , #{lastUpdatedBy} , #{lastUpdatedDate} , #{lastUpdatedTime} )")
	void  saveItemmastercost(Itemmastercost itemmastercost);

	@Update ("UPDATE  itemmastercost SET Remarks = #{remarks}, LastUpdatedBy = #{lastUpdatedBy}, LastUpdatedDate = #{lastUpdatedDate}, LastUpdatedTime = #{lastUpdatedTime} WHERE MainCategory = #{mainCategory} AND SubCategory = #{subCategory} AND ItemCode = #{itemCode} ")
	void  updateItemmastercost(@Param("mainCategory") String mainCategory, @Param("subCategory") String subCategory, @Param("itemCode") String itemCode);

	@Delete ("DELETE FROM itemmastercost WHERE MainCategory = #{mainCategory} AND SubCategory = #{subCategory} AND ItemCode = #{itemCode} ")
	void  deleteItemmastercost(@Param("mainCategory") String mainCategory, @Param("subCategory") String subCategory, @Param("itemCode") String itemCode);

    void updateItemmastercost(Itemmastercost itemmastercost);
}
