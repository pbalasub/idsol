package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Manpowerrequisition;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface ManpowerrequisitionMapper{

	@Select ("SELECT * FROM manpowerrequisition")
	List<Manpowerrequisition> getAllManpowerrequisition();

	@Select ("SELECT * FROM manpowerrequisition WHERE MPRNo = #{mPRNo} ")
	Manpowerrequisition getManpowerrequisition(@Param("mPRNo") String mPRNo);

	@Insert ("INSERT INTO manpowerrequisition(MPRNo, MPRDate, Designation, NoOfRequirement, ProposedSalary, Grade, Dept, PositionReportTo, JobDescription, Qualification, Experience, Budgetted, Gender, MinimumAge, MaximumAge, ReplacementFor, Reason, AdditionalInformation, RequiredLatestBy, PositionFillBy, EligibleEmployee1, EligibleEmployee2, ApprovalStatus, RejectReason, Comments, Status, Stage, StageOneName, StageOneDate, StageOneTime, StageTwoName, StageTwoDate, StageTwoTime, StageThreeName, StageThreeDate, StageThreeTime, StageFourName, StageFourDate, StageFourTime)  VALUES (#{mPRNo} , #{mPRDate} , #{designation} , #{noOfRequirement} , #{proposedSalary} , #{grade} , #{dept} , #{positionReportTo} , #{jobDescription} , #{qualification} , #{experience} , #{budgetted} , #{gender} , #{minimumAge} , #{maximumAge} , #{replacementFor} , #{reason} , #{additionalInformation} , #{requiredLatestBy} , #{positionFillBy} , #{eligibleEmployee1} , #{eligibleEmployee2} , #{approvalStatus} , #{rejectReason} , #{comments} , #{status} , #{stage} , #{stageOneName} , #{stageOneDate} , #{stageOneTime} , #{stageTwoName} , #{stageTwoDate} , #{stageTwoTime} , #{stageThreeName} , #{stageThreeDate} , #{stageThreeTime} , #{stageFourName} , #{stageFourDate} , #{stageFourTime} )")
	void  saveManpowerrequisition(Manpowerrequisition manpowerrequisition);

	@Update ("UPDATE  manpowerrequisition SET MPRDate = #{mPRDate}, Designation = #{designation}, NoOfRequirement = #{noOfRequirement}, ProposedSalary = #{proposedSalary}, Grade = #{grade}, Dept = #{dept}, PositionReportTo = #{positionReportTo}, JobDescription = #{jobDescription}, Qualification = #{qualification}, Experience = #{experience}, Budgetted = #{budgetted}, Gender = #{gender}, MinimumAge = #{minimumAge}, MaximumAge = #{maximumAge}, ReplacementFor = #{replacementFor}, Reason = #{reason}, AdditionalInformation = #{additionalInformation}, RequiredLatestBy = #{requiredLatestBy}, PositionFillBy = #{positionFillBy}, EligibleEmployee1 = #{eligibleEmployee1}, EligibleEmployee2 = #{eligibleEmployee2}, ApprovalStatus = #{approvalStatus}, RejectReason = #{rejectReason}, Comments = #{comments}, Status = #{status}, Stage = #{stage}, StageOneName = #{stageOneName}, StageOneDate = #{stageOneDate}, StageOneTime = #{stageOneTime}, StageTwoName = #{stageTwoName}, StageTwoDate = #{stageTwoDate}, StageTwoTime = #{stageTwoTime}, StageThreeName = #{stageThreeName}, StageThreeDate = #{stageThreeDate}, StageThreeTime = #{stageThreeTime}, StageFourName = #{stageFourName}, StageFourDate = #{stageFourDate}, StageFourTime = #{stageFourTime} WHERE MPRNo = #{mPRNo} ")
	void  updateManpowerrequisition(@Param("mPRNo") String mPRNo);

	@Delete ("DELETE FROM manpowerrequisition WHERE MPRNo = #{mPRNo} ")
	void  deleteManpowerrequisition(@Param("mPRNo") String mPRNo);

}
