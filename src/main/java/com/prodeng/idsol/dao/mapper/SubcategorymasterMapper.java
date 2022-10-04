package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Subcategorymaster;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface SubcategorymasterMapper{

	@Select ("SELECT * FROM subcategorymaster")
	List<Subcategorymaster> getAllSubcategorymaster();

	@Select ("SELECT * FROM subcategorymaster WHERE MainCategory = #{mainCategory} AND SubCategory = #{subCategory} ")
	Subcategorymaster getSubcategorymaster(@Param("mainCategory") String mainCategory, @Param("subCategory") String subCategory);

	@Insert ("INSERT INTO subcategorymaster(MainCategory, SubCategory, ItemPrefix, LastUpdatedBy, LastUpdatedDate, LastUpdatedTime)  VALUES (#{mainCategory} , #{subCategory} , #{itemPrefix} , #{lastUpdatedBy} , #{lastUpdatedDate} , #{lastUpdatedTime} )")
	void  saveSubcategorymaster(Subcategorymaster subcategorymaster);

	@Update ("UPDATE  subcategorymaster SET ItemPrefix = #{itemPrefix}, LastUpdatedBy = #{lastUpdatedBy}, LastUpdatedDate = #{lastUpdatedDate}, LastUpdatedTime = #{lastUpdatedTime} WHERE MainCategory = #{mainCategory} AND SubCategory = #{subCategory} ")
	void  updateSubcategorymaster(@Param("mainCategory") String mainCategory, @Param("subCategory") String subCategory);

	@Delete ("DELETE FROM subcategorymaster WHERE MainCategory = #{mainCategory} AND SubCategory = #{subCategory} ")
	void  deleteSubcategorymaster(@Param("mainCategory") String mainCategory, @Param("subCategory") String subCategory);

    void updateSubcategorymaster(Subcategorymaster subcategorymaster);
}
