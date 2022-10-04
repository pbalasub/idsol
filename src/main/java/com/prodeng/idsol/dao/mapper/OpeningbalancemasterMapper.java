package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Openingbalancemaster;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface OpeningbalancemasterMapper{

	@Select ("SELECT * FROM openingbalancemaster")
	List<Openingbalancemaster> getAllOpeningbalancemaster();

	@Select ("SELECT * FROM openingbalancemaster WHERE Param1 = #{param1} AND Param2 = #{param2} AND Param3 = #{param3} AND Param4 = #{param4} AND Param5 = #{param5} AND Param6 = #{param6} AND IdentityType = #{identityType} AND Month = #{month} AND Year = #{year} ")
	Openingbalancemaster getOpeningbalancemaster(@Param("param1") String param1, @Param("param2") String param2, @Param("param3") String param3, @Param("param4") String param4, @Param("param5") String param5, @Param("param6") String param6, @Param("identityType") String identityType, @Param("month") Integer month, @Param("year") Integer year);

	@Insert ("INSERT INTO openingbalancemaster(Param1, Param2, Param3, Param4, Param5, Param6, IdentityType, Month, Year, OpeningBalance, UpdatedHistory, NameOfLastUpdate, DateOfLastUpdate)  VALUES (#{param1} , #{param2} , #{param3} , #{param4} , #{param5} , #{param6} , #{identityType} , #{month} , #{year} , #{openingBalance} , #{updatedHistory} , #{nameOfLastUpdate} , #{dateOfLastUpdate} )")
	void  saveOpeningbalancemaster(Openingbalancemaster openingbalancemaster);

	@Update ("UPDATE  openingbalancemaster SET OpeningBalance = #{openingBalance}, UpdatedHistory = #{updatedHistory}, NameOfLastUpdate = #{nameOfLastUpdate}, DateOfLastUpdate = #{dateOfLastUpdate} WHERE Param1 = #{param1} AND Param2 = #{param2} AND Param3 = #{param3} AND Param4 = #{param4} AND Param5 = #{param5} AND Param6 = #{param6} AND IdentityType = #{identityType} AND Month = #{month} AND Year = #{year} ")
	void  updateOpeningbalancemaster(@Param("param1") String param1, @Param("param2") String param2, @Param("param3") String param3, @Param("param4") String param4, @Param("param5") String param5, @Param("param6") String param6, @Param("identityType") String identityType, @Param("month") Integer month, @Param("year") Integer year);

	@Delete ("DELETE FROM openingbalancemaster WHERE Param1 = #{param1} AND Param2 = #{param2} AND Param3 = #{param3} AND Param4 = #{param4} AND Param5 = #{param5} AND Param6 = #{param6} AND IdentityType = #{identityType} AND Month = #{month} AND Year = #{year} ")
	void  deleteOpeningbalancemaster(@Param("param1") String param1, @Param("param2") String param2, @Param("param3") String param3, @Param("param4") String param4, @Param("param5") String param5, @Param("param6") String param6, @Param("identityType") String identityType, @Param("month") Integer month, @Param("year") Integer year);

    void updateOpeningbalancemaster(Openingbalancemaster openingbalancemaster);
}
