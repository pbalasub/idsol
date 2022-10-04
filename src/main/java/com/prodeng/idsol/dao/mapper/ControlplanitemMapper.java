package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Controlplanitem;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface ControlplanitemMapper{

	@Select ("SELECT * FROM controlplanitem")
	List<Controlplanitem> getAllControlplanitem();

	@Select ("SELECT * FROM controlplanitem WHERE CPId = #{cPId} AND SerialNo = #{serialNo} ")
	Controlplanitem getControlplanitem(@Param("cPId") Integer cPId, @Param("serialNo") Integer serialNo);

	@Insert ("INSERT INTO controlplanitem(CPId, SerialNo, DrwgSlNo, Characteristics, SpecialChar, MinSpec, MaxSpec, EvalTech, Device, Frequency, ControlMethod, ReactionPlan, ProcessDetail, Uom)  VALUES (#{cPId} , #{serialNo} , #{drwgSlNo} , #{characteristics} , #{specialChar} , #{minSpec} , #{maxSpec} , #{evalTech} , #{device} , #{frequency} , #{controlMethod} , #{reactionPlan} , #{processDetail} , #{uom} )")
	void  saveControlplanitem(Controlplanitem controlplanitem);

	@Update ("UPDATE  controlplanitem SET DrwgSlNo = #{drwgSlNo}, Characteristics = #{characteristics}, SpecialChar = #{specialChar}, MinSpec = #{minSpec}, MaxSpec = #{maxSpec}, EvalTech = #{evalTech}, Device = #{device}, Frequency = #{frequency}, ControlMethod = #{controlMethod}, ReactionPlan = #{reactionPlan}, ProcessDetail = #{processDetail}, Uom = #{uom} WHERE CPId = #{cPId} AND SerialNo = #{serialNo} ")
	void  updateControlplanitem(@Param("cPId") Integer cPId, @Param("serialNo") Integer serialNo);

	@Delete ("DELETE FROM controlplanitem WHERE CPId = #{cPId} AND SerialNo = #{serialNo} ")
	void  deleteControlplanitem(@Param("cPId") Integer cPId, @Param("serialNo") Integer serialNo);

    void updateControlplanitem(Controlplanitem controlplanitem);
}
