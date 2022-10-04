package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Employeetrainingrecord;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface EmployeetrainingrecordMapper{

	@Select ("SELECT * FROM employeetrainingrecord")
	List<Employeetrainingrecord> getAllEmployeetrainingrecord();

	@Select ("SELECT * FROM employeetrainingrecord WHERE ETRId = #{eTRId} ")
	Employeetrainingrecord getEmployeetrainingrecord(@Param("eTRId") Integer eTRId);

	@Insert ("INSERT INTO employeetrainingrecord(ETRId, ETRNo, ETRDate, ETPNo, TrainingName, EmpCode, DocumentNo, RevisionNo, UnderIssueNo, SpecialOperation, PlaceOfTraining, AreaOfTraining, FacultyName, PeriodFrom, PeriodTill, Remarks, EmpEvalNeeded, EmpEvalPeriod, EmpEvalMethod, EmpEvalResult, ReviewRequired, ReviewPeriod, DateOfEvaluation, EmpEvalRemarks, LastUpdatedBy, LastUpdatedDate, LastUpdatedTime)  VALUES (#{eTRId} , #{eTRNo} , #{eTRDate} , #{eTPNo} , #{trainingName} , #{empCode} , #{documentNo} , #{revisionNo} , #{underIssueNo} , #{specialOperation} , #{placeOfTraining} , #{areaOfTraining} , #{facultyName} , #{periodFrom} , #{periodTill} , #{remarks} , #{empEvalNeeded} , #{empEvalPeriod} , #{empEvalMethod} , #{empEvalResult} , #{reviewRequired} , #{reviewPeriod} , #{dateOfEvaluation} , #{empEvalRemarks} , #{lastUpdatedBy} , #{lastUpdatedDate} , #{lastUpdatedTime} )")
	void  saveEmployeetrainingrecord(Employeetrainingrecord employeetrainingrecord);

	@Update ("UPDATE  employeetrainingrecord SET ETRNo = #{eTRNo}, ETRDate = #{eTRDate}, ETPNo = #{eTPNo}, TrainingName = #{trainingName}, EmpCode = #{empCode}, DocumentNo = #{documentNo}, RevisionNo = #{revisionNo}, UnderIssueNo = #{underIssueNo}, SpecialOperation = #{specialOperation}, PlaceOfTraining = #{placeOfTraining}, AreaOfTraining = #{areaOfTraining}, FacultyName = #{facultyName}, PeriodFrom = #{periodFrom}, PeriodTill = #{periodTill}, Remarks = #{remarks}, EmpEvalNeeded = #{empEvalNeeded}, EmpEvalPeriod = #{empEvalPeriod}, EmpEvalMethod = #{empEvalMethod}, EmpEvalResult = #{empEvalResult}, ReviewRequired = #{reviewRequired}, ReviewPeriod = #{reviewPeriod}, DateOfEvaluation = #{dateOfEvaluation}, EmpEvalRemarks = #{empEvalRemarks}, LastUpdatedBy = #{lastUpdatedBy}, LastUpdatedDate = #{lastUpdatedDate}, LastUpdatedTime = #{lastUpdatedTime} WHERE ETRId = #{eTRId} ")
	void  updateEmployeetrainingrecord(@Param("eTRId") Integer eTRId);

	@Delete ("DELETE FROM employeetrainingrecord WHERE ETRId = #{eTRId} ")
	void  deleteEmployeetrainingrecord(@Param("eTRId") Integer eTRId);

}
