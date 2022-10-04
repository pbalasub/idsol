package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Finalinspectionreportitem;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface FinalinspectionreportitemMapper{

	@Select ("SELECT * FROM finalinspectionreportitem")
	List<Finalinspectionreportitem> getAllFinalinspectionreportitem();

	@Select ("SELECT * FROM finalinspectionreportitem WHERE FIRId = #{fIRId} AND SerialNo = #{serialNo} ")
	Finalinspectionreportitem getFinalinspectionreportitem(@Param("fIRId") Integer fIRId, @Param("serialNo") Integer serialNo);

	@Insert ("INSERT INTO finalinspectionreportitem(FIRId, SerialNo, DrwgSlNo, Characteristics, SpecialChar, EvalTech, MinSpec, MaxSpec, ObservedMinSpec, ObservedMaxSpec, Remarks, Job1, Job2, Job3, Job4, Job5)  VALUES (#{fIRId} , #{serialNo} , #{drwgSlNo} , #{characteristics} , #{specialChar} , #{evalTech} , #{minSpec} , #{maxSpec} , #{observedMinSpec} , #{observedMaxSpec} , #{remarks} , #{job1} , #{job2} , #{job3} , #{job4} , #{job5} )")
	void  saveFinalinspectionreportitem(Finalinspectionreportitem finalinspectionreportitem);

	@Update ("UPDATE  finalinspectionreportitem SET DrwgSlNo = #{drwgSlNo}, Characteristics = #{characteristics}, SpecialChar = #{specialChar}, EvalTech = #{evalTech}, MinSpec = #{minSpec}, MaxSpec = #{maxSpec}, ObservedMinSpec = #{observedMinSpec}, ObservedMaxSpec = #{observedMaxSpec}, Remarks = #{remarks}, Job1 = #{job1}, Job2 = #{job2}, Job3 = #{job3}, Job4 = #{job4}, Job5 = #{job5} WHERE FIRId = #{fIRId} AND SerialNo = #{serialNo} ")
	void  updateFinalinspectionreportitem(@Param("fIRId") Integer fIRId, @Param("serialNo") Integer serialNo);

	@Delete ("DELETE FROM finalinspectionreportitem WHERE FIRId = #{fIRId} AND SerialNo = #{serialNo} ")
	void  deleteFinalinspectionreportitem(@Param("fIRId") Integer fIRId, @Param("serialNo") Integer serialNo);

    void updateFinalinspectionreportitem(Finalinspectionreportitem finalinspectionreportitem);
}
