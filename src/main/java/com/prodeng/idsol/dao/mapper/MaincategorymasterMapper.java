package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Maincategorymaster;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface MaincategorymasterMapper{

	@Select ("SELECT * FROM maincategorymaster")
	List<Maincategorymaster> getAllMaincategorymaster();

	@Select ("SELECT * FROM maincategorymaster WHERE MainCategory = #{mainCategory} ")
	Maincategorymaster getMaincategorymaster(@Param("mainCategory") String mainCategory);

	@Insert ("INSERT INTO maincategorymaster(MainCategory, LastUpdatedBy, LastUpdatedDate, LastUpdatedTime)  VALUES (#{mainCategory} , #{lastUpdatedBy} , #{lastUpdatedDate} , #{lastUpdatedTime} )")
	void  saveMaincategorymaster(Maincategorymaster maincategorymaster);

	@Update ("UPDATE  maincategorymaster SET LastUpdatedBy = #{lastUpdatedBy}, LastUpdatedDate = #{lastUpdatedDate}, LastUpdatedTime = #{lastUpdatedTime} WHERE MainCategory = #{mainCategory} ")
	void  updateMaincategorymaster(@Param("mainCategory") String mainCategory);

	@Delete ("DELETE FROM maincategorymaster WHERE MainCategory = #{mainCategory} ")
	void  deleteMaincategorymaster(@Param("mainCategory") String mainCategory);

}
