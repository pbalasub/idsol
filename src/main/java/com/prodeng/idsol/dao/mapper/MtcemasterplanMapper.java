package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Mtcemasterplan;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface MtcemasterplanMapper{

	@Select ("SELECT * FROM mtcemasterplan")
	List<Mtcemasterplan> getAllMtcemasterplan();

	@Select ("SELECT * FROM mtcemasterplan WHERE MPId = #{mPId} ")
	Mtcemasterplan getMtcemasterplan(@Param("mPId") Integer mPId);

	@Insert ("INSERT INTO mtcemasterplan(MPId, MPNo, MPDate, PlanType, PlanFromDate, PlanTillDate, Status, Stage, StageOneName, StageOneDate, StageOneTime, StageTwoName, StageTwoDate, StageTwoTime)  VALUES (#{mPId} , #{mPNo} , #{mPDate} , #{planType} , #{planFromDate} , #{planTillDate} , #{status} , #{stage} , #{stageOneName} , #{stageOneDate} , #{stageOneTime} , #{stageTwoName} , #{stageTwoDate} , #{stageTwoTime} )")
	void  saveMtcemasterplan(Mtcemasterplan mtcemasterplan);

	@Update ("UPDATE  mtcemasterplan SET MPNo = #{mPNo}, MPDate = #{mPDate}, PlanType = #{planType}, PlanFromDate = #{planFromDate}, PlanTillDate = #{planTillDate}, Status = #{status}, Stage = #{stage}, StageOneName = #{stageOneName}, StageOneDate = #{stageOneDate}, StageOneTime = #{stageOneTime}, StageTwoName = #{stageTwoName}, StageTwoDate = #{stageTwoDate}, StageTwoTime = #{stageTwoTime} WHERE MPId = #{mPId} ")
	void  updateMtcemasterplan(@Param("mPId") Integer mPId);

	@Delete ("DELETE FROM mtcemasterplan WHERE MPId = #{mPId} ")
	void  deleteMtcemasterplan(@Param("mPId") Integer mPId);

}
