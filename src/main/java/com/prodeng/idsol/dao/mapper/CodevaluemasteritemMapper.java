package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Codevaluemasteritem;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface CodevaluemasteritemMapper{

	@Select ("SELECT * FROM codevaluemasteritem")
	List<Codevaluemasteritem> getAllCodevaluemasteritem();

	@Select ("SELECT * FROM codevaluemasteritem WHERE Identifier = #{identifier} AND Code = #{code} ")
	Codevaluemasteritem getCodevaluemasteritem(@Param("identifier") Integer identifier, @Param("code") String code);

	@Insert ("INSERT INTO codevaluemasteritem(Identifier, Code, Value, OrderSeq)  VALUES (#{identifier} , #{code} , #{value} , #{orderSeq} )")
	void  saveCodevaluemasteritem(Codevaluemasteritem codevaluemasteritem);

	@Update ("UPDATE  codevaluemasteritem SET Value = #{value}, OrderSeq = #{orderSeq} WHERE Identifier = #{identifier} AND Code = #{code} ")
	void  updateCodevaluemasteritem(@Param("identifier") Integer identifier, @Param("code") String code);

	@Delete ("DELETE FROM codevaluemasteritem WHERE Identifier = #{identifier} AND Code = #{code} ")
	void  deleteCodevaluemasteritem(@Param("identifier") Integer identifier, @Param("code") String code);

    void updateCodevaluemasteritem(Codevaluemasteritem codevaluemasteritem);
}
