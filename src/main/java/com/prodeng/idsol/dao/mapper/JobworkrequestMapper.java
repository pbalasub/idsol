package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Jobworkrequest;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface JobworkrequestMapper{

	@Select ("SELECT * FROM jobworkrequest")
	List<Jobworkrequest> getAllJobworkrequest();

	@Select ("SELECT * FROM jobworkrequest WHERE JWRId = #{jWRId} ")
	Jobworkrequest getJobworkrequest(@Param("jWRId") Integer jWRId);

	@Insert ("INSERT INTO jobworkrequest(JWRId, JWRNo, JWRDate, dept, RejectReason, Comments, Status, Stage, StageOneName, StageOneDate, StageOneTime, StageTwoName, StageTwoDate, StageTwoTime, StageThreeName, StageThreeDate, StageThreeTime, StageFourName, StageFourDate, StageFourTime, StageFiveName, StageFiveDate, StageFiveTime)  VALUES (#{jWRId} , #{jWRNo} , #{jWRDate} , #{dept} , #{rejectReason} , #{comments} , #{status} , #{stage} , #{stageOneName} , #{stageOneDate} , #{stageOneTime} , #{stageTwoName} , #{stageTwoDate} , #{stageTwoTime} , #{stageThreeName} , #{stageThreeDate} , #{stageThreeTime} , #{stageFourName} , #{stageFourDate} , #{stageFourTime} , #{stageFiveName} , #{stageFiveDate} , #{stageFiveTime} )")
	void  saveJobworkrequest(Jobworkrequest jobworkrequest);

	@Update ("UPDATE  jobworkrequest SET JWRNo = #{jWRNo}, JWRDate = #{jWRDate}, dept = #{dept}, RejectReason = #{rejectReason}, Comments = #{comments}, Status = #{status}, Stage = #{stage}, StageOneName = #{stageOneName}, StageOneDate = #{stageOneDate}, StageOneTime = #{stageOneTime}, StageTwoName = #{stageTwoName}, StageTwoDate = #{stageTwoDate}, StageTwoTime = #{stageTwoTime}, StageThreeName = #{stageThreeName}, StageThreeDate = #{stageThreeDate}, StageThreeTime = #{stageThreeTime}, StageFourName = #{stageFourName}, StageFourDate = #{stageFourDate}, StageFourTime = #{stageFourTime}, StageFiveName = #{stageFiveName}, StageFiveDate = #{stageFiveDate}, StageFiveTime = #{stageFiveTime} WHERE JWRId = #{jWRId} ")
	void  updateJobworkrequest(@Param("jWRId") Integer jWRId);

	@Delete ("DELETE FROM jobworkrequest WHERE JWRId = #{jWRId} ")
	void  deleteJobworkrequest(@Param("jWRId") Integer jWRId);

}
