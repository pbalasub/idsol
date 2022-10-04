package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Stmirequestitem;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface StmirequestitemMapper{

	@Select ("SELECT * FROM stmirequestitem")
	List<Stmirequestitem> getAllStmirequestitem();

	@Select ("SELECT * FROM stmirequestitem WHERE MIRId = #{mIRId} AND SerialNo = #{serialNo} ")
	Stmirequestitem getStmirequestitem(@Param("mIRId") Integer mIRId, @Param("serialNo") Integer serialNo);

	@Insert ("INSERT INTO stmirequestitem(MIRId, SerialNo, ItemCode, MIRQty, AlternateQty, Process, Purpose, HistoryCode, IssQty, TagNo, ReferenceNo)  VALUES (#{mIRId} , #{serialNo} , #{itemCode} , #{mIRQty} , #{alternateQty} , #{process} , #{purpose} , #{historyCode} , #{issQty} , #{tagNo} , #{referenceNo} )")
	void  saveStmirequestitem(Stmirequestitem stmirequestitem);

	@Update ("UPDATE  stmirequestitem SET ItemCode = #{itemCode}, MIRQty = #{mIRQty}, AlternateQty = #{alternateQty}, Process = #{process}, Purpose = #{purpose}, HistoryCode = #{historyCode}, IssQty = #{issQty}, TagNo = #{tagNo}, ReferenceNo = #{referenceNo} WHERE MIRId = #{mIRId} AND SerialNo = #{serialNo} ")
	void  updateStmirequestitem(@Param("mIRId") Integer mIRId, @Param("serialNo") Integer serialNo);

	@Delete ("DELETE FROM stmirequestitem WHERE MIRId = #{mIRId} AND SerialNo = #{serialNo} ")
	void  deleteStmirequestitem(@Param("mIRId") Integer mIRId, @Param("serialNo") Integer serialNo);

    void updateStmirequestitem(Stmirequestitem stmirequestitem);
}
