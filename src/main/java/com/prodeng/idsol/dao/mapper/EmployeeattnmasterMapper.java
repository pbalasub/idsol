package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Employeeattnmaster;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

public interface EmployeeattnmasterMapper{

	@Select ("SELECT * FROM employeeattnmaster")
	List<Employeeattnmaster> getAllEmployeeattnmaster();

	@Select ("SELECT * FROM employeeattnmaster WHERE EmpCode = #{empCode} AND AttnDate = #{attnDate} ")
	Employeeattnmaster getEmployeeattnmaster(@Param("empCode") String empCode, @Param("attnDate") Date attnDate);

	@Insert ("INSERT INTO employeeattnmaster(EmpId, EmpCode, AttnDate, CurrentDate, TimeIn, TimeOut, WorkHour, WorkMinutes, OtHour, OtMinutes, WorkDay, ClosureStatus, ClosureRemarks, ClosureName, ClosureDate, ClosureTime, RejectReason, Comments, Status, Stage, StageOneName, StageOneDate, StageOneTime, StageTwoName, StageTwoDate, StageTwoTime, StageThreeName, StageThreeDate, StageThreeTime, StageFourName, StageFourDate, StageFourTime)  VALUES (#{empId} , #{empCode} , #{attnDate} , #{currentDate} , #{timeIn} , #{timeOut} , #{workHour} , #{workMinutes} , #{otHour} , #{otMinutes} , #{workDay} , #{closureStatus} , #{closureRemarks} , #{closureName} , #{closureDate} , #{closureTime} , #{rejectReason} , #{comments} , #{status} , #{stage} , #{stageOneName} , #{stageOneDate} , #{stageOneTime} , #{stageTwoName} , #{stageTwoDate} , #{stageTwoTime} , #{stageThreeName} , #{stageThreeDate} , #{stageThreeTime} , #{stageFourName} , #{stageFourDate} , #{stageFourTime} )")
	void  saveEmployeeattnmaster(Employeeattnmaster employeeattnmaster);

	@Update ("UPDATE  employeeattnmaster SET EmpId = #{empId}, CurrentDate = #{currentDate}, TimeIn = #{timeIn}, TimeOut = #{timeOut}, WorkHour = #{workHour}, WorkMinutes = #{workMinutes}, OtHour = #{otHour}, OtMinutes = #{otMinutes}, WorkDay = #{workDay}, ClosureStatus = #{closureStatus}, ClosureRemarks = #{closureRemarks}, ClosureName = #{closureName}, ClosureDate = #{closureDate}, ClosureTime = #{closureTime}, RejectReason = #{rejectReason}, Comments = #{comments}, Status = #{status}, Stage = #{stage}, StageOneName = #{stageOneName}, StageOneDate = #{stageOneDate}, StageOneTime = #{stageOneTime}, StageTwoName = #{stageTwoName}, StageTwoDate = #{stageTwoDate}, StageTwoTime = #{stageTwoTime}, StageThreeName = #{stageThreeName}, StageThreeDate = #{stageThreeDate}, StageThreeTime = #{stageThreeTime}, StageFourName = #{stageFourName}, StageFourDate = #{stageFourDate}, StageFourTime = #{stageFourTime} WHERE EmpCode = #{empCode} AND AttnDate = #{attnDate} ")
	void  updateEmployeeattnmaster(@Param("empCode") String empCode, @Param("attnDate") Date attnDate);

	@Delete ("DELETE FROM employeeattnmaster WHERE EmpCode = #{empCode} AND AttnDate = #{attnDate} ")
	void  deleteEmployeeattnmaster(@Param("empCode") String empCode, @Param("attnDate") Date attnDate);

	void updateEmployeeattnmaster(Employeeattnmaster employeeattnmaster);
}
