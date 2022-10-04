package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Leaveondutyform;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface LeaveondutyformMapper{

	@Select ("SELECT * FROM leaveondutyform")
	List<Leaveondutyform> getAllLeaveondutyform();

	@Select ("SELECT * FROM leaveondutyform WHERE LofNo = #{lofNo} ")
	Leaveondutyform getLeaveondutyform(@Param("lofNo") String lofNo);

	@Insert ("INSERT INTO leaveondutyform(LofNo, LofDate, EmpCode, EmpName, ElFromDate, ElToDate, ClFromDate, ClToDate, MlFromDate, MlToDate, EsilFromDate, EsilToDate, OlFromDate, OlToDate, ElDays, ClDays, MlDays, EsilDays, OlDays, LtReason, LtRemarks, OdFromDate, OdToDate, OdDays, OdReason, OdRemarks, CoFromDate, CoToDate, CoDays, CoReason, CoRemarks, RejectReason, Comments, Status, Stage, StageOneName, StageOneDate, StageOneTime, StageTwoName, StageTwoDate, StageTwoTime)  VALUES (#{lofNo} , #{lofDate} , #{empCode} , #{empName} , #{elFromDate} , #{elToDate} , #{clFromDate} , #{clToDate} , #{mlFromDate} , #{mlToDate} , #{esilFromDate} , #{esilToDate} , #{olFromDate} , #{olToDate} , #{elDays} , #{clDays} , #{mlDays} , #{esilDays} , #{olDays} , #{ltReason} , #{ltRemarks} , #{odFromDate} , #{odToDate} , #{odDays} , #{odReason} , #{odRemarks} , #{coFromDate} , #{coToDate} , #{coDays} , #{coReason} , #{coRemarks} , #{rejectReason} , #{comments} , #{status} , #{stage} , #{stageOneName} , #{stageOneDate} , #{stageOneTime} , #{stageTwoName} , #{stageTwoDate} , #{stageTwoTime} )")
	void  saveLeaveondutyform(Leaveondutyform leaveondutyform);

	@Update ("UPDATE  leaveondutyform SET LofDate = #{lofDate}, EmpCode = #{empCode}, EmpName = #{empName}, ElFromDate = #{elFromDate}, ElToDate = #{elToDate}, ClFromDate = #{clFromDate}, ClToDate = #{clToDate}, MlFromDate = #{mlFromDate}, MlToDate = #{mlToDate}, EsilFromDate = #{esilFromDate}, EsilToDate = #{esilToDate}, OlFromDate = #{olFromDate}, OlToDate = #{olToDate}, ElDays = #{elDays}, ClDays = #{clDays}, MlDays = #{mlDays}, EsilDays = #{esilDays}, OlDays = #{olDays}, LtReason = #{ltReason}, LtRemarks = #{ltRemarks}, OdFromDate = #{odFromDate}, OdToDate = #{odToDate}, OdDays = #{odDays}, OdReason = #{odReason}, OdRemarks = #{odRemarks}, CoFromDate = #{coFromDate}, CoToDate = #{coToDate}, CoDays = #{coDays}, CoReason = #{coReason}, CoRemarks = #{coRemarks}, RejectReason = #{rejectReason}, Comments = #{comments}, Status = #{status}, Stage = #{stage}, StageOneName = #{stageOneName}, StageOneDate = #{stageOneDate}, StageOneTime = #{stageOneTime}, StageTwoName = #{stageTwoName}, StageTwoDate = #{stageTwoDate}, StageTwoTime = #{stageTwoTime} WHERE LofNo = #{lofNo} ")
	void  updateLeaveondutyform(@Param("lofNo") String lofNo);

	@Delete ("DELETE FROM leaveondutyform WHERE LofNo = #{lofNo} ")
	void  deleteLeaveondutyform(@Param("lofNo") String lofNo);

}
