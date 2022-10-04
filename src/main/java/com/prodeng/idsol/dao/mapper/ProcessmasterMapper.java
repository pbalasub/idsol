package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Processmaster;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface ProcessmasterMapper{

	@Select ("SELECT * FROM processmaster")
	List<Processmaster> getAllProcessmaster();

	@Select ("SELECT * FROM processmaster WHERE MainCategory = #{mainCategory} AND SubCategory = #{subCategory} AND ItemCode = #{itemCode} ")
	Processmaster getProcessmaster(@Param("mainCategory") String mainCategory, @Param("subCategory") String subCategory, @Param("itemCode") String itemCode);

	@Insert ("INSERT INTO processmaster(MainCategory, SubCategory, ItemCode, Description, LastUpdatedBy, LastUpdatedDate, LastUpdatedTime)  VALUES (#{mainCategory} , #{subCategory} , #{itemCode} , #{description} , #{lastUpdatedBy} , #{lastUpdatedDate} , #{lastUpdatedTime} )")
	void  saveProcessmaster(Processmaster processmaster);

	@Update ("UPDATE  processmaster SET Description = #{description}, LastUpdatedBy = #{lastUpdatedBy}, LastUpdatedDate = #{lastUpdatedDate}, LastUpdatedTime = #{lastUpdatedTime} WHERE MainCategory = #{mainCategory} AND SubCategory = #{subCategory} AND ItemCode = #{itemCode} ")
	void  updateProcessmaster(@Param("mainCategory") String mainCategory, @Param("subCategory") String subCategory, @Param("itemCode") String itemCode);

	@Delete ("DELETE FROM processmaster WHERE MainCategory = #{mainCategory} AND SubCategory = #{subCategory} AND ItemCode = #{itemCode} ")
	void  deleteProcessmaster(@Param("mainCategory") String mainCategory, @Param("subCategory") String subCategory, @Param("itemCode") String itemCode);

    void updateProcessmaster(Processmaster processmaster);
}
