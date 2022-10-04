package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Stmirequest;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface StmirequestMapper{

	@Select ("SELECT * FROM stmirequest")
	List<Stmirequest> getAllStmirequest();

	@Select ("SELECT * FROM stmirequest WHERE MIRId = #{mIRId} ")
	Stmirequest getStmirequest(@Param("mIRId") Integer mIRId);

	@Insert ("INSERT INTO stmirequest(MIRId, MIRNo, MIRDate, Dept, SectionCode, EmpCode, EmpName, Status, Stage, RejectReason, Comments, StageOneName, StageOneDate, StageOneTime, StageTwoName, StageTwoDate, StageTwoTime, StageThreeName, StageThreeDate, StageThreeTime, StageFourName, StageFourDate, StageFourTime, ClosureStatus, ClosureRemarks, ClosureName, ClosureDate, ClosureTime)  VALUES (#{mIRId} , #{mIRNo} , #{mIRDate} , #{dept} , #{sectionCode} , #{empCode} , #{empName} , #{status} , #{stage} , #{rejectReason} , #{comments} , #{stageOneName} , #{stageOneDate} , #{stageOneTime} , #{stageTwoName} , #{stageTwoDate} , #{stageTwoTime} , #{stageThreeName} , #{stageThreeDate} , #{stageThreeTime} , #{stageFourName} , #{stageFourDate} , #{stageFourTime} , #{closureStatus} , #{closureRemarks} , #{closureName} , #{closureDate} , #{closureTime} )")
	void  saveStmirequest(Stmirequest stmirequest);

	@Update ("UPDATE  stmirequest SET MIRNo = #{mIRNo}, MIRDate = #{mIRDate}, Dept = #{dept}, SectionCode = #{sectionCode}, EmpCode = #{empCode}, EmpName = #{empName}, Status = #{status}, Stage = #{stage}, RejectReason = #{rejectReason}, Comments = #{comments}, StageOneName = #{stageOneName}, StageOneDate = #{stageOneDate}, StageOneTime = #{stageOneTime}, StageTwoName = #{stageTwoName}, StageTwoDate = #{stageTwoDate}, StageTwoTime = #{stageTwoTime}, StageThreeName = #{stageThreeName}, StageThreeDate = #{stageThreeDate}, StageThreeTime = #{stageThreeTime}, StageFourName = #{stageFourName}, StageFourDate = #{stageFourDate}, StageFourTime = #{stageFourTime}, ClosureStatus = #{closureStatus}, ClosureRemarks = #{closureRemarks}, ClosureName = #{closureName}, ClosureDate = #{closureDate}, ClosureTime = #{closureTime} WHERE MIRId = #{mIRId} ")
	void  updateStmirequest(@Param("mIRId") Integer mIRId);

	@Delete ("DELETE FROM stmirequest WHERE MIRId = #{mIRId} ")
	void  deleteStmirequest(@Param("mIRId") Integer mIRId);

}
