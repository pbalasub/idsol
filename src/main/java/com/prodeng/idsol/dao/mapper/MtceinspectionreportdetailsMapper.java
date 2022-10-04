package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Mtceinspectionreportdetails;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface MtceinspectionreportdetailsMapper{

	@Select ("SELECT * FROM mtceinspectionreportdetails")
	List<Mtceinspectionreportdetails> getAllMtceinspectionreportdetails();

	@Select ("SELECT * FROM mtceinspectionreportdetails WHERE IRId = #{iRId} AND SerialNo = #{serialNo} ")
	Mtceinspectionreportdetails getMtceinspectionreportdetails(@Param("iRId") Integer iRId, @Param("serialNo") Integer serialNo);

	@Insert ("INSERT INTO mtceinspectionreportdetails(IRId, SerialNo, Characteristics, SpecialChar, EvalTech, WorkDoneDetails, SparesReplaced, Observation)  VALUES (#{iRId} , #{serialNo} , #{characteristics} , #{specialChar} , #{evalTech} , #{workDoneDetails} , #{sparesReplaced} , #{observation} )")
	void  saveMtceinspectionreportdetails(Mtceinspectionreportdetails mtceinspectionreportdetails);

	@Update ("UPDATE  mtceinspectionreportdetails SET Characteristics = #{characteristics}, SpecialChar = #{specialChar}, EvalTech = #{evalTech}, WorkDoneDetails = #{workDoneDetails}, SparesReplaced = #{sparesReplaced}, Observation = #{observation} WHERE IRId = #{iRId} AND SerialNo = #{serialNo} ")
	void  updateMtceinspectionreportdetails(@Param("iRId") Integer iRId, @Param("serialNo") Integer serialNo);

	@Delete ("DELETE FROM mtceinspectionreportdetails WHERE IRId = #{iRId} AND SerialNo = #{serialNo} ")
	void  deleteMtceinspectionreportdetails(@Param("iRId") Integer iRId, @Param("serialNo") Integer serialNo);

    void updateMtceinspectionreportdetails(Mtceinspectionreportdetails mtceinspectionreportdetails);
}
