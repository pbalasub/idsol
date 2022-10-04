package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Employeeaccidentreport;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface EmployeeaccidentreportMapper{

	@Select ("SELECT * FROM employeeaccidentreport")
	List<Employeeaccidentreport> getAllEmployeeaccidentreport();

	@Select ("SELECT * FROM employeeaccidentreport WHERE EARNo = #{eARNo} ")
	Employeeaccidentreport getEmployeeaccidentreport(@Param("eARNo") String eARNo);

	@Insert ("INSERT INTO employeeaccidentreport(EARNo, EARDate, EmpCode, Shift, WorkStartHour, DateOfAccident, TimeOfAccident, NatureOfAccident, ExtentOfInjury, LocationOfInjury, ContraventionOfRules, HistoryCode, MachineName, MachinePartName, Remarks, WitnessEmpCode1, WitnessEmpCode2, SupervisorEmpCode, HODEmpCode, AnalysisMember1, AnalysisMember2, RootCause, CoreMatter, TeamSuggestion, AdditionalRemarks, LastUpdatedBy, LastUpdatedDate, LastUpdatedTime)  VALUES (#{eARNo} , #{eARDate} , #{empCode} , #{shift} , #{workStartHour} , #{dateOfAccident} , #{timeOfAccident} , #{natureOfAccident} , #{extentOfInjury} , #{locationOfInjury} , #{contraventionOfRules} , #{historyCode} , #{machineName} , #{machinePartName} , #{remarks} , #{witnessEmpCode1} , #{witnessEmpCode2} , #{supervisorEmpCode} , #{hODEmpCode} , #{analysisMember1} , #{analysisMember2} , #{rootCause} , #{coreMatter} , #{teamSuggestion} , #{additionalRemarks} , #{lastUpdatedBy} , #{lastUpdatedDate} , #{lastUpdatedTime} )")
	void  saveEmployeeaccidentreport(Employeeaccidentreport employeeaccidentreport);

	@Update ("UPDATE  employeeaccidentreport SET EARDate = #{eARDate}, EmpCode = #{empCode}, Shift = #{shift}, WorkStartHour = #{workStartHour}, DateOfAccident = #{dateOfAccident}, TimeOfAccident = #{timeOfAccident}, NatureOfAccident = #{natureOfAccident}, ExtentOfInjury = #{extentOfInjury}, LocationOfInjury = #{locationOfInjury}, ContraventionOfRules = #{contraventionOfRules}, HistoryCode = #{historyCode}, MachineName = #{machineName}, MachinePartName = #{machinePartName}, Remarks = #{remarks}, WitnessEmpCode1 = #{witnessEmpCode1}, WitnessEmpCode2 = #{witnessEmpCode2}, SupervisorEmpCode = #{supervisorEmpCode}, HODEmpCode = #{hODEmpCode}, AnalysisMember1 = #{analysisMember1}, AnalysisMember2 = #{analysisMember2}, RootCause = #{rootCause}, CoreMatter = #{coreMatter}, TeamSuggestion = #{teamSuggestion}, AdditionalRemarks = #{additionalRemarks}, LastUpdatedBy = #{lastUpdatedBy}, LastUpdatedDate = #{lastUpdatedDate}, LastUpdatedTime = #{lastUpdatedTime} WHERE EARNo = #{eARNo} ")
	void  updateEmployeeaccidentreport(@Param("eARNo") String eARNo);

	@Delete ("DELETE FROM employeeaccidentreport WHERE EARNo = #{eARNo} ")
	void  deleteEmployeeaccidentreport(@Param("eARNo") String eARNo);

}
