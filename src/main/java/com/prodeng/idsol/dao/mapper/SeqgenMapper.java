package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Seqgen;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface SeqgenMapper{

	@Select ("SELECT * FROM seqgen")
	List<Seqgen> getAllSeqgen();

	@Select ("SELECT * FROM seqgen WHERE Prefix = #{prefix} AND SeqType = #{seqType} ")
	Seqgen getSeqgen(@Param("prefix") String prefix, @Param("seqType") String seqType);

	@Insert ("INSERT INTO seqgen(Prefix, SeqType, InitCounter, NextNum, IncrementBy)  VALUES (#{prefix} , #{seqType} , #{initCounter} , #{nextNum} , #{incrementBy} )")
	void  saveSeqgen(Seqgen seqgen);

	@Update ("UPDATE  seqgen SET InitCounter = #{initCounter}, NextNum = #{nextNum}, IncrementBy = #{incrementBy} WHERE Prefix = #{prefix} AND SeqType = #{seqType} ")
	void  updateSeqgen(@Param("prefix") String prefix, @Param("seqType") String seqType);

	@Delete ("DELETE FROM seqgen WHERE Prefix = #{prefix} AND SeqType = #{seqType} ")
	void  deleteSeqgen(@Param("prefix") String prefix, @Param("seqType") String seqType);

    void updateSeqgen(Seqgen seqgen);
}
