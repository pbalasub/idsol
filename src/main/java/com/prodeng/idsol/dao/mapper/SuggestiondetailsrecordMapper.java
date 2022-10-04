package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Suggestiondetailsrecord;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface SuggestiondetailsrecordMapper{

	@Select ("SELECT * FROM suggestiondetailsrecord")
	List<Suggestiondetailsrecord> getAllSuggestiondetailsrecord();

	@Select ("SELECT * FROM suggestiondetailsrecord WHERE SuggestionNo = #{suggestionNo} ")
	Suggestiondetailsrecord getSuggestiondetailsrecord(@Param("suggestionNo") String suggestionNo);

	@Insert ("INSERT INTO suggestiondetailsrecord(SuggestionNo, CreationDate, Type, ProviderEmpCode, ProviderName, ProviderDept, DateOfSuggestion, CoreSuggestion, Remarks, SuggestionAccepted, MementoGiven, TeamRemarks, AwardDetail, PrizeAmount, DateOfImplementation, ImplementationRemarks, RejectReason, Comments, Status, Stage, StageOneName, StageOneDate, StageOneTime, StageTwoName, StageTwoDate, StageTwoTime, StageThreeName, StageThreeDate, StageThreeTime, StageFourName, StageFourDate, StageFourTime)  VALUES (#{suggestionNo} , #{creationDate} , #{type} , #{providerEmpCode} , #{providerName} , #{providerDept} , #{dateOfSuggestion} , #{coreSuggestion} , #{remarks} , #{suggestionAccepted} , #{mementoGiven} , #{teamRemarks} , #{awardDetail} , #{prizeAmount} , #{dateOfImplementation} , #{implementationRemarks} , #{rejectReason} , #{comments} , #{status} , #{stage} , #{stageOneName} , #{stageOneDate} , #{stageOneTime} , #{stageTwoName} , #{stageTwoDate} , #{stageTwoTime} , #{stageThreeName} , #{stageThreeDate} , #{stageThreeTime} , #{stageFourName} , #{stageFourDate} , #{stageFourTime} )")
	void  saveSuggestiondetailsrecord(Suggestiondetailsrecord suggestiondetailsrecord);

	@Update ("UPDATE  suggestiondetailsrecord SET CreationDate = #{creationDate}, Type = #{type}, ProviderEmpCode = #{providerEmpCode}, ProviderName = #{providerName}, ProviderDept = #{providerDept}, DateOfSuggestion = #{dateOfSuggestion}, CoreSuggestion = #{coreSuggestion}, Remarks = #{remarks}, SuggestionAccepted = #{suggestionAccepted}, MementoGiven = #{mementoGiven}, TeamRemarks = #{teamRemarks}, AwardDetail = #{awardDetail}, PrizeAmount = #{prizeAmount}, DateOfImplementation = #{dateOfImplementation}, ImplementationRemarks = #{implementationRemarks}, RejectReason = #{rejectReason}, Comments = #{comments}, Status = #{status}, Stage = #{stage}, StageOneName = #{stageOneName}, StageOneDate = #{stageOneDate}, StageOneTime = #{stageOneTime}, StageTwoName = #{stageTwoName}, StageTwoDate = #{stageTwoDate}, StageTwoTime = #{stageTwoTime}, StageThreeName = #{stageThreeName}, StageThreeDate = #{stageThreeDate}, StageThreeTime = #{stageThreeTime}, StageFourName = #{stageFourName}, StageFourDate = #{stageFourDate}, StageFourTime = #{stageFourTime} WHERE SuggestionNo = #{suggestionNo} ")
	void  updateSuggestiondetailsrecord(@Param("suggestionNo") String suggestionNo);

	@Delete ("DELETE FROM suggestiondetailsrecord WHERE SuggestionNo = #{suggestionNo} ")
	void  deleteSuggestiondetailsrecord(@Param("suggestionNo") String suggestionNo);

}
