package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Employeeperformanceappraisal;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface EmployeeperformanceappraisalMapper{

	@Select ("SELECT * FROM employeeperformanceappraisal")
	List<Employeeperformanceappraisal> getAllEmployeeperformanceappraisal();

	@Select ("SELECT * FROM employeeperformanceappraisal WHERE EPANo = #{ePANo} ")
	Employeeperformanceappraisal getEmployeeperformanceappraisal(@Param("ePANo") String ePANo);

	@Insert ("INSERT INTO employeeperformanceappraisal(EPANo, EPADate, AppraisalType, EmpCode, AppraiserCode, PeriodFrom, PeriodTill, OverAllRatingValue, OverAllGrade, Suggestion, AwardDetail, ContinousImprovement, Result, ExtendedPeriod, ResultReason, EffectiveDate, ToBeDesignated, ProposedSalary, Remarks, RejectReason, Comments, Status, Stage, StageOneName, StageOneDate, StageOneTime, StageTwoName, StageTwoDate, StageTwoTime, StageThreeName, StageThreeDate, StageThreeTime, StageFourName, StageFourDate, StageFourTime)  VALUES (#{ePANo} , #{ePADate} , #{appraisalType} , #{empCode} , #{appraiserCode} , #{periodFrom} , #{periodTill} , #{overAllRatingValue} , #{overAllGrade} , #{suggestion} , #{awardDetail} , #{continousImprovement} , #{result} , #{extendedPeriod} , #{resultReason} , #{effectiveDate} , #{toBeDesignated} , #{proposedSalary} , #{remarks} , #{rejectReason} , #{comments} , #{status} , #{stage} , #{stageOneName} , #{stageOneDate} , #{stageOneTime} , #{stageTwoName} , #{stageTwoDate} , #{stageTwoTime} , #{stageThreeName} , #{stageThreeDate} , #{stageThreeTime} , #{stageFourName} , #{stageFourDate} , #{stageFourTime} )")
	void  saveEmployeeperformanceappraisal(Employeeperformanceappraisal employeeperformanceappraisal);

	@Update ("UPDATE  employeeperformanceappraisal SET EPADate = #{ePADate}, AppraisalType = #{appraisalType}, EmpCode = #{empCode}, AppraiserCode = #{appraiserCode}, PeriodFrom = #{periodFrom}, PeriodTill = #{periodTill}, OverAllRatingValue = #{overAllRatingValue}, OverAllGrade = #{overAllGrade}, Suggestion = #{suggestion}, AwardDetail = #{awardDetail}, ContinousImprovement = #{continousImprovement}, Result = #{result}, ExtendedPeriod = #{extendedPeriod}, ResultReason = #{resultReason}, EffectiveDate = #{effectiveDate}, ToBeDesignated = #{toBeDesignated}, ProposedSalary = #{proposedSalary}, Remarks = #{remarks}, RejectReason = #{rejectReason}, Comments = #{comments}, Status = #{status}, Stage = #{stage}, StageOneName = #{stageOneName}, StageOneDate = #{stageOneDate}, StageOneTime = #{stageOneTime}, StageTwoName = #{stageTwoName}, StageTwoDate = #{stageTwoDate}, StageTwoTime = #{stageTwoTime}, StageThreeName = #{stageThreeName}, StageThreeDate = #{stageThreeDate}, StageThreeTime = #{stageThreeTime}, StageFourName = #{stageFourName}, StageFourDate = #{stageFourDate}, StageFourTime = #{stageFourTime} WHERE EPANo = #{ePANo} ")
	void  updateEmployeeperformanceappraisal(@Param("ePANo") String ePANo);

	@Delete ("DELETE FROM employeeperformanceappraisal WHERE EPANo = #{ePANo} ")
	void  deleteEmployeeperformanceappraisal(@Param("ePANo") String ePANo);

}
