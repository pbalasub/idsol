package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Employeesalarymaster;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface EmployeesalarymasterMapper{

	@Select ("SELECT * FROM employeesalarymaster")
	List<Employeesalarymaster> getAllEmployeesalarymaster();

	@Select ("SELECT * FROM employeesalarymaster WHERE EsmNo = #{esmNo} ")
	Employeesalarymaster getEmployeesalarymaster(@Param("esmNo") String esmNo);

	@Insert ("INSERT INTO employeesalarymaster(EsmNo, EsmDate, EmpCode, Basic, Hra, Conveyance, Washing, Allowance1, Allowance2, Allowance3, Allowance4, Allowance5, Allowance6, SalaryEffectiveFrom, SalaryEffectiveTo, SalaryStatus, ClosureStatus, ClosureRemarks, ClosureName, ClosureDate, ClosureTime, RejectReason, Comments, Status, Stage, StageOneName, StageOneDate, StageOneTime, StageTwoName, StageTwoDate, StageTwoTime, StageThreeName, StageThreeDate, StageThreeTime, StageFourName, StageFourDate, StageFourTime)  VALUES (#{esmNo} , #{esmDate} , #{empCode} , #{basic} , #{hra} , #{conveyance} , #{washing} , #{allowance1} , #{allowance2} , #{allowance3} , #{allowance4} , #{allowance5} , #{allowance6} , #{salaryEffectiveFrom} , #{salaryEffectiveTo} , #{salaryStatus} , #{closureStatus} , #{closureRemarks} , #{closureName} , #{closureDate} , #{closureTime} , #{rejectReason} , #{comments} , #{status} , #{stage} , #{stageOneName} , #{stageOneDate} , #{stageOneTime} , #{stageTwoName} , #{stageTwoDate} , #{stageTwoTime} , #{stageThreeName} , #{stageThreeDate} , #{stageThreeTime} , #{stageFourName} , #{stageFourDate} , #{stageFourTime} )")
	void  saveEmployeesalarymaster(Employeesalarymaster employeesalarymaster);

	@Update ("UPDATE  employeesalarymaster SET EsmDate = #{esmDate}, EmpCode = #{empCode}, Basic = #{basic}, Hra = #{hra}, Conveyance = #{conveyance}, Washing = #{washing}, Allowance1 = #{allowance1}, Allowance2 = #{allowance2}, Allowance3 = #{allowance3}, Allowance4 = #{allowance4}, Allowance5 = #{allowance5}, Allowance6 = #{allowance6}, SalaryEffectiveFrom = #{salaryEffectiveFrom}, SalaryEffectiveTo = #{salaryEffectiveTo}, SalaryStatus = #{salaryStatus}, ClosureStatus = #{closureStatus}, ClosureRemarks = #{closureRemarks}, ClosureName = #{closureName}, ClosureDate = #{closureDate}, ClosureTime = #{closureTime}, RejectReason = #{rejectReason}, Comments = #{comments}, Status = #{status}, Stage = #{stage}, StageOneName = #{stageOneName}, StageOneDate = #{stageOneDate}, StageOneTime = #{stageOneTime}, StageTwoName = #{stageTwoName}, StageTwoDate = #{stageTwoDate}, StageTwoTime = #{stageTwoTime}, StageThreeName = #{stageThreeName}, StageThreeDate = #{stageThreeDate}, StageThreeTime = #{stageThreeTime}, StageFourName = #{stageFourName}, StageFourDate = #{stageFourDate}, StageFourTime = #{stageFourTime} WHERE EsmNo = #{esmNo} ")
	void  updateEmployeesalarymaster(@Param("esmNo") String esmNo);

	@Delete ("DELETE FROM employeesalarymaster WHERE EsmNo = #{esmNo} ")
	void  deleteEmployeesalarymaster(@Param("esmNo") String esmNo);

}
