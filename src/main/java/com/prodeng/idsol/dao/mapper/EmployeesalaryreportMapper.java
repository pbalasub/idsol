package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Employeesalaryreport;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface EmployeesalaryreportMapper{

	@Select ("SELECT * FROM employeesalaryreport")
	List<Employeesalaryreport> getAllEmployeesalaryreport();

	@Select ("SELECT * FROM employeesalaryreport WHERE EsrNo = #{esrNo} ")
	Employeesalaryreport getEmployeesalaryreport(@Param("esrNo") String esrNo);

	@Insert ("INSERT INTO employeesalaryreport(EsrNo, EsrDate, EmpCode, Basic, Hra, Conveyance, Washing, Allowance1, Allowance2, Allowance3, Allowance4, Allowance5, Allowance6, DaysToBeWorked, NoOfSundays, NoOfHolidays, DaysWorked, OtHours, EleaveDays, CleaveDays, OndutyDays, CoDays, PayBasic, PayHra, PayConveyance, PayWashing, PayAllowance1, PayAllowance2, PayAllowance3, PayAllowance4, PayAllowance5, PayAllowance6, PfAmount, EsiAmount, ProfTax, Deduction1, Deduction2, Deduction3, Deduction4, Deduction5, Deduction6, GrossSalary, GrossDeduction, NetSalary, ClosureStatus, ClosureRemarks, ClosureName, ClosureDate, ClosureTime, RejectReason, Comments, Status, Stage, StageOneName, StageOneDate, StageOneTime, StageTwoName, StageTwoDate, StageTwoTime, StageThreeName, StageThreeDate, StageThreeTime, StageFourName, StageFourDate, StageFourTime)  VALUES (#{esrNo} , #{esrDate} , #{empCode} , #{basic} , #{hra} , #{conveyance} , #{washing} , #{allowance1} , #{allowance2} , #{allowance3} , #{allowance4} , #{allowance5} , #{allowance6} , #{daysToBeWorked} , #{noOfSundays} , #{noOfHolidays} , #{daysWorked} , #{otHours} , #{eleaveDays} , #{cleaveDays} , #{ondutyDays} , #{coDays} , #{payBasic} , #{payHra} , #{payConveyance} , #{payWashing} , #{payAllowance1} , #{payAllowance2} , #{payAllowance3} , #{payAllowance4} , #{payAllowance5} , #{payAllowance6} , #{pfAmount} , #{esiAmount} , #{profTax} , #{deduction1} , #{deduction2} , #{deduction3} , #{deduction4} , #{deduction5} , #{deduction6} , #{grossSalary} , #{grossDeduction} , #{netSalary} , #{closureStatus} , #{closureRemarks} , #{closureName} , #{closureDate} , #{closureTime} , #{rejectReason} , #{comments} , #{status} , #{stage} , #{stageOneName} , #{stageOneDate} , #{stageOneTime} , #{stageTwoName} , #{stageTwoDate} , #{stageTwoTime} , #{stageThreeName} , #{stageThreeDate} , #{stageThreeTime} , #{stageFourName} , #{stageFourDate} , #{stageFourTime} )")
	void  saveEmployeesalaryreport(Employeesalaryreport employeesalaryreport);

	@Update ("UPDATE  employeesalaryreport SET EsrDate = #{esrDate}, EmpCode = #{empCode}, Basic = #{basic}, Hra = #{hra}, Conveyance = #{conveyance}, Washing = #{washing}, Allowance1 = #{allowance1}, Allowance2 = #{allowance2}, Allowance3 = #{allowance3}, Allowance4 = #{allowance4}, Allowance5 = #{allowance5}, Allowance6 = #{allowance6}, DaysToBeWorked = #{daysToBeWorked}, NoOfSundays = #{noOfSundays}, NoOfHolidays = #{noOfHolidays}, DaysWorked = #{daysWorked}, OtHours = #{otHours}, EleaveDays = #{eleaveDays}, CleaveDays = #{cleaveDays}, OndutyDays = #{ondutyDays}, CoDays = #{coDays}, PayBasic = #{payBasic}, PayHra = #{payHra}, PayConveyance = #{payConveyance}, PayWashing = #{payWashing}, PayAllowance1 = #{payAllowance1}, PayAllowance2 = #{payAllowance2}, PayAllowance3 = #{payAllowance3}, PayAllowance4 = #{payAllowance4}, PayAllowance5 = #{payAllowance5}, PayAllowance6 = #{payAllowance6}, PfAmount = #{pfAmount}, EsiAmount = #{esiAmount}, ProfTax = #{profTax}, Deduction1 = #{deduction1}, Deduction2 = #{deduction2}, Deduction3 = #{deduction3}, Deduction4 = #{deduction4}, Deduction5 = #{deduction5}, Deduction6 = #{deduction6}, GrossSalary = #{grossSalary}, GrossDeduction = #{grossDeduction}, NetSalary = #{netSalary}, ClosureStatus = #{closureStatus}, ClosureRemarks = #{closureRemarks}, ClosureName = #{closureName}, ClosureDate = #{closureDate}, ClosureTime = #{closureTime}, RejectReason = #{rejectReason}, Comments = #{comments}, Status = #{status}, Stage = #{stage}, StageOneName = #{stageOneName}, StageOneDate = #{stageOneDate}, StageOneTime = #{stageOneTime}, StageTwoName = #{stageTwoName}, StageTwoDate = #{stageTwoDate}, StageTwoTime = #{stageTwoTime}, StageThreeName = #{stageThreeName}, StageThreeDate = #{stageThreeDate}, StageThreeTime = #{stageThreeTime}, StageFourName = #{stageFourName}, StageFourDate = #{stageFourDate}, StageFourTime = #{stageFourTime} WHERE EsrNo = #{esrNo} ")
	void  updateEmployeesalaryreport(@Param("esrNo") String esrNo);

	@Delete ("DELETE FROM employeesalaryreport WHERE EsrNo = #{esrNo} ")
	void  deleteEmployeesalaryreport(@Param("esrNo") String esrNo);

}
