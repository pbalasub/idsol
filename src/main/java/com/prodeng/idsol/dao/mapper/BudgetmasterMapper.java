package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Budgetmaster;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface BudgetmasterMapper{

	@Select ("SELECT * FROM budgetmaster")
	List<Budgetmaster> getAllBudgetmaster();

	@Select ("SELECT * FROM budgetmaster WHERE SectionCode = #{sectionCode} AND Month = #{month} AND Year = #{year} ")
	Budgetmaster getBudgetmaster(@Param("sectionCode") String sectionCode, @Param("month") Integer month, @Param("year") Integer year);

	@Insert ("INSERT INTO budgetmaster(SectionCode, SectionName, Month, Year, phase1, phase2, phase3, phase4, alttotal, po, jwo, rwo, swo, others, contotal, UpdatedHistory, NameOfLastUpdate, DateOfLastUpdate)  VALUES (#{sectionCode} , #{sectionName} , #{month} , #{year} , #{phase1} , #{phase2} , #{phase3} , #{phase4} , #{alttotal} , #{po} , #{jwo} , #{rwo} , #{swo} , #{others} , #{contotal} , #{updatedHistory} , #{nameOfLastUpdate} , #{dateOfLastUpdate} )")
	void  saveBudgetmaster(Budgetmaster budgetmaster);

	@Update ("UPDATE  budgetmaster SET SectionName = #{sectionName}, phase1 = #{phase1}, phase2 = #{phase2}, phase3 = #{phase3}, phase4 = #{phase4}, alttotal = #{alttotal}, po = #{po}, jwo = #{jwo}, rwo = #{rwo}, swo = #{swo}, others = #{others}, contotal = #{contotal}, UpdatedHistory = #{updatedHistory}, NameOfLastUpdate = #{nameOfLastUpdate}, DateOfLastUpdate = #{dateOfLastUpdate} WHERE SectionCode = #{sectionCode} AND Month = #{month} AND Year = #{year} ")
	void  updateBudgetmaster(@Param("sectionCode") String sectionCode, @Param("month") Integer month, @Param("year") Integer year);

	@Delete ("DELETE FROM budgetmaster WHERE SectionCode = #{sectionCode} AND Month = #{month} AND Year = #{year} ")
	void  deleteBudgetmaster(@Param("sectionCode") String sectionCode, @Param("month") Integer month, @Param("year") Integer year);

    void updateBudgetmaster(Budgetmaster budgetmaster);
}
