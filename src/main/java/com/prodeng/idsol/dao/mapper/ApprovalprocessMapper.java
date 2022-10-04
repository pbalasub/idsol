package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Approvalprocess;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface ApprovalprocessMapper{

	@Select ("SELECT * FROM approvalprocess")
	List<Approvalprocess> getAllApprovalprocess();

	@Select ("SELECT * FROM approvalprocess WHERE ProcessStageRole = #{processStageRole} AND ProcessType = #{processType} ")
	Approvalprocess getApprovalprocess(@Param("processStageRole") String processStageRole, @Param("processType") String processType);

	@Insert ("INSERT INTO approvalprocess(ProcessStageRole, ProcessType, NextStageRole, PreviousStageRole, OrderSeq, LastUpdatedBy, LastUpdatedDate, LastUpdatedTime)  VALUES (#{processStageRole} , #{processType} , #{nextStageRole} , #{previousStageRole} , #{orderSeq} , #{lastUpdatedBy} , #{lastUpdatedDate} , #{lastUpdatedTime} )")
	void  saveApprovalprocess(Approvalprocess approvalprocess);

	@Update ("UPDATE  approvalprocess SET NextStageRole = #{nextStageRole}, PreviousStageRole = #{previousStageRole}, OrderSeq = #{orderSeq}, LastUpdatedBy = #{lastUpdatedBy}, LastUpdatedDate = #{lastUpdatedDate}, LastUpdatedTime = #{lastUpdatedTime} WHERE ProcessStageRole = #{processStageRole} AND ProcessType = #{processType} ")
	void  updateApprovalprocess(@Param("processStageRole") String processStageRole, @Param("processType") String processType);

	@Delete ("DELETE FROM approvalprocess WHERE ProcessStageRole = #{processStageRole} AND ProcessType = #{processType} ")
	void  deleteApprovalprocess(@Param("processStageRole") String processStageRole, @Param("processType") String processType);

	void updateApprovalprocess(Approvalprocess approvalprocess);
}
