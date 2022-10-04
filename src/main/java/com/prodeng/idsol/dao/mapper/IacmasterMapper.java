package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Iacmaster;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface IacmasterMapper{

	@Select ("SELECT * FROM iacmaster")
	List<Iacmaster> getAllIacmaster();

	@Select ("SELECT * FROM iacmaster WHERE IACCode = #{iACCode} ")
	Iacmaster getIacmaster(@Param("iACCode") String iACCode);

	@Insert ("INSERT INTO iacmaster(IACCode, iacdesc, LastUpdatedBy, LastUpdatedDate, LastUpdatedTime)  VALUES (#{iACCode} , #{iacdesc} , #{lastUpdatedBy} , #{lastUpdatedDate} , #{lastUpdatedTime} )")
	void  saveIacmaster(Iacmaster iacmaster);

	@Update ("UPDATE  iacmaster SET iacdesc = #{iacdesc}, LastUpdatedBy = #{lastUpdatedBy}, LastUpdatedDate = #{lastUpdatedDate}, LastUpdatedTime = #{lastUpdatedTime} WHERE IACCode = #{iACCode} ")
	void  updateIacmaster(@Param("iACCode") String iACCode);

	@Delete ("DELETE FROM iacmaster WHERE IACCode = #{iACCode} ")
	void  deleteIacmaster(@Param("iACCode") String iACCode);

}
