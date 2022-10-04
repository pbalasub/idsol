package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Stmrnoteitem;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface StmrnoteitemMapper{

	@Select ("SELECT * FROM stmrnoteitem")
	List<Stmrnoteitem> getAllStmrnoteitem();

	@Select ("SELECT * FROM stmrnoteitem WHERE MRNId = #{mRNId} AND SerialNo = #{serialNo} ")
	Stmrnoteitem getStmrnoteitem(@Param("mRNId") Integer mRNId, @Param("serialNo") Integer serialNo);

	@Insert ("INSERT INTO stmrnoteitem(MRNId, SerialNo, ItemCode, Process, ReferenceNo, MRNQty, AlternateQty, RecQty, Reason, Result, ItemRemarks, HistoryCode, RINo, RejQty, RejReason, ConcAccQty, ConcAccReason)  VALUES (#{mRNId} , #{serialNo} , #{itemCode} , #{process} , #{referenceNo} , #{mRNQty} , #{alternateQty} , #{recQty} , #{reason} , #{result} , #{itemRemarks} , #{historyCode} , #{rINo} , #{rejQty} , #{rejReason} , #{concAccQty} , #{concAccReason} )")
	void  saveStmrnoteitem(Stmrnoteitem stmrnoteitem);

	@Update ("UPDATE  stmrnoteitem SET ItemCode = #{itemCode}, Process = #{process}, ReferenceNo = #{referenceNo}, MRNQty = #{mRNQty}, AlternateQty = #{alternateQty}, RecQty = #{recQty}, Reason = #{reason}, Result = #{result}, ItemRemarks = #{itemRemarks}, HistoryCode = #{historyCode}, RINo = #{rINo}, RejQty = #{rejQty}, RejReason = #{rejReason}, ConcAccQty = #{concAccQty}, ConcAccReason = #{concAccReason} WHERE MRNId = #{mRNId} AND SerialNo = #{serialNo} ")
	void  updateStmrnoteitem(@Param("mRNId") Integer mRNId, @Param("serialNo") Integer serialNo);

	@Delete ("DELETE FROM stmrnoteitem WHERE MRNId = #{mRNId} AND SerialNo = #{serialNo} ")
	void  deleteStmrnoteitem(@Param("mRNId") Integer mRNId, @Param("serialNo") Integer serialNo);

    void updateStmrnoteitem(Stmrnoteitem stmrnoteitem);
}
