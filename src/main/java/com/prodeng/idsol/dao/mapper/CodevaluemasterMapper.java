package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Codevaluemaster;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface CodevaluemasterMapper{

	@Select ("SELECT * FROM codevaluemaster")
	List<Codevaluemaster> getAllCodevaluemaster();

	@Select ("SELECT * FROM codevaluemaster WHERE Identifier = #{identifier} ")
	Codevaluemaster getCodevaluemaster(@Param("identifier") Integer identifier);

	@Insert ("INSERT INTO codevaluemaster(Identifier, Type, Description, IsAlterable, LastUpdatedBy, LastUpdatedDate, LastUpdatedTime)  VALUES (#{identifier} , #{type} , #{description} , #{isAlterable} , #{lastUpdatedBy} , #{lastUpdatedDate} , #{lastUpdatedTime} )")
	void  saveCodevaluemaster(Codevaluemaster codevaluemaster);

	@Update ("UPDATE  codevaluemaster SET Type = #{type}, Description = #{description}, IsAlterable = #{isAlterable}, LastUpdatedBy = #{lastUpdatedBy}, LastUpdatedDate = #{lastUpdatedDate}, LastUpdatedTime = #{lastUpdatedTime} WHERE Identifier = #{identifier} ")
	void  updateCodevaluemaster(@Param("identifier") Integer identifier);

	@Delete ("DELETE FROM codevaluemaster WHERE Identifier = #{identifier} ")
	void  deleteCodevaluemaster(@Param("identifier") Integer identifier);

}
