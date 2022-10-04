package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Stmrnote;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface StmrnoteMapper{

	@Select ("SELECT * FROM stmrnote")
	List<Stmrnote> getAllStmrnote();

	@Select ("SELECT * FROM stmrnote WHERE MRNId = #{mRNId} ")
	Stmrnote getStmrnote(@Param("mRNId") Integer mRNId);

	@Insert ("INSERT INTO stmrnote(MRNId, MRNNo, MRNDate, Dept, Remarks, SectionCode, EmpCode, EmpName, Status, Stage, RejectReason, Comments, StageOneName, StageOneDate, StageOneTime, StageTwoName, StageTwoDate, StageTwoTime, StageThreeName, StageThreeDate, StageThreeTime, ClosureStatus, ClosureRemarks, ClosureName, ClosureDate, ClosureTime)  VALUES (#{mRNId} , #{mRNNo} , #{mRNDate} , #{dept} , #{remarks} , #{sectionCode} , #{empCode} , #{empName} , #{status} , #{stage} , #{rejectReason} , #{comments} , #{stageOneName} , #{stageOneDate} , #{stageOneTime} , #{stageTwoName} , #{stageTwoDate} , #{stageTwoTime} , #{stageThreeName} , #{stageThreeDate} , #{stageThreeTime} , #{closureStatus} , #{closureRemarks} , #{closureName} , #{closureDate} , #{closureTime} )")
	void  saveStmrnote(Stmrnote stmrnote);

	@Update ("UPDATE  stmrnote SET MRNNo = #{mRNNo}, MRNDate = #{mRNDate}, Dept = #{dept}, Remarks = #{remarks}, SectionCode = #{sectionCode}, EmpCode = #{empCode}, EmpName = #{empName}, Status = #{status}, Stage = #{stage}, RejectReason = #{rejectReason}, Comments = #{comments}, StageOneName = #{stageOneName}, StageOneDate = #{stageOneDate}, StageOneTime = #{stageOneTime}, StageTwoName = #{stageTwoName}, StageTwoDate = #{stageTwoDate}, StageTwoTime = #{stageTwoTime}, StageThreeName = #{stageThreeName}, StageThreeDate = #{stageThreeDate}, StageThreeTime = #{stageThreeTime}, ClosureStatus = #{closureStatus}, ClosureRemarks = #{closureRemarks}, ClosureName = #{closureName}, ClosureDate = #{closureDate}, ClosureTime = #{closureTime} WHERE MRNId = #{mRNId} ")
	void  updateStmrnote(@Param("mRNId") Integer mRNId);

	@Delete ("DELETE FROM stmrnote WHERE MRNId = #{mRNId} ")
	void  deleteStmrnote(@Param("mRNId") Integer mRNId);

}
