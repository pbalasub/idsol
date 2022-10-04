package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Employeemanagementmaster;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface EmployeemanagementmasterMapper{

	@Select ("SELECT * FROM employeemanagementmaster")
	List<Employeemanagementmaster> getAllEmployeemanagementmaster();

	@Select ("SELECT * FROM employeemanagementmaster WHERE EmpCode = #{empCode} ")
	Employeemanagementmaster getEmployeemanagementmaster(@Param("empCode") String empCode);

	@Insert ("INSERT INTO employeemanagementmaster(EmpCode, DateOfJoining, DateOfConfirmation, DateOfLeaving, Status, Designation, Grade, Dept, AwardDetails, PreviousExperience, CurrentExperience, PANNo, AccountNo, BankName, BranchName, EPFNo, ESINo, ESIDispensary, Remarks, PhysicalStatus, ReferredBy, EffectiveFrom, EffectiveTill, LastUpdatedBy, LastUpdatedDate, LastUpdatedTime)  VALUES (#{empCode} , #{dateOfJoining} , #{dateOfConfirmation} , #{dateOfLeaving} , #{status} , #{designation} , #{grade} , #{dept} , #{awardDetails} , #{previousExperience} , #{currentExperience} , #{pANNo} , #{accountNo} , #{bankName} , #{branchName} , #{ePFNo} , #{eSINo} , #{eSIDispensary} , #{remarks} , #{physicalStatus} , #{referredBy} , #{effectiveFrom} , #{effectiveTill} , #{lastUpdatedBy} , #{lastUpdatedDate} , #{lastUpdatedTime} )")
	void  saveEmployeemanagementmaster(Employeemanagementmaster employeemanagementmaster);

	@Update ("UPDATE  employeemanagementmaster SET DateOfJoining = #{dateOfJoining}, DateOfConfirmation = #{dateOfConfirmation}, DateOfLeaving = #{dateOfLeaving}, Status = #{status}, Designation = #{designation}, Grade = #{grade}, Dept = #{dept}, AwardDetails = #{awardDetails}, PreviousExperience = #{previousExperience}, CurrentExperience = #{currentExperience}, PANNo = #{pANNo}, AccountNo = #{accountNo}, BankName = #{bankName}, BranchName = #{branchName}, EPFNo = #{ePFNo}, ESINo = #{eSINo}, ESIDispensary = #{eSIDispensary}, Remarks = #{remarks}, PhysicalStatus = #{physicalStatus}, ReferredBy = #{referredBy}, EffectiveFrom = #{effectiveFrom}, EffectiveTill = #{effectiveTill}, LastUpdatedBy = #{lastUpdatedBy}, LastUpdatedDate = #{lastUpdatedDate}, LastUpdatedTime = #{lastUpdatedTime} WHERE EmpCode = #{empCode} ")
	void  updateEmployeemanagementmaster(@Param("empCode") String empCode);

	@Delete ("DELETE FROM employeemanagementmaster WHERE EmpCode = #{empCode} ")
	void  deleteEmployeemanagementmaster(@Param("empCode") String empCode);

}
