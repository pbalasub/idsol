package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Processmasteritem;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface ProcessmasteritemMapper{

	@Select ("SELECT * FROM processmasteritem")
	List<Processmasteritem> getAllProcessmasteritem();

	@Select ("SELECT * FROM processmasteritem WHERE MainCategory = #{mainCategory} AND SubCategory = #{subCategory} AND ItemCode = #{itemCode} AND SerialNo = #{serialNo} ")
	Processmasteritem getProcessmasteritem(@Param("mainCategory") String mainCategory, @Param("subCategory") String subCategory, @Param("itemCode") String itemCode, @Param("serialNo") Integer serialNo);

	@Insert ("INSERT INTO processmasteritem(MainCategory, SubCategory, ItemCode, SerialNo, ProcessCode, OrderSeq, Visible)  VALUES (#{mainCategory} , #{subCategory} , #{itemCode} , #{serialNo} , #{processCode} , #{orderSeq} , #{visible} )")
	void  saveProcessmasteritem(Processmasteritem processmasteritem);

	@Update ("UPDATE  processmasteritem SET ProcessCode = #{processCode}, OrderSeq = #{orderSeq}, Visible = #{visible} WHERE MainCategory = #{mainCategory} AND SubCategory = #{subCategory} AND ItemCode = #{itemCode} AND SerialNo = #{serialNo} ")
	void  updateProcessmasteritem(@Param("mainCategory") String mainCategory, @Param("subCategory") String subCategory, @Param("itemCode") String itemCode, @Param("serialNo") Integer serialNo);

	@Delete ("DELETE FROM processmasteritem WHERE MainCategory = #{mainCategory} AND SubCategory = #{subCategory} AND ItemCode = #{itemCode} AND SerialNo = #{serialNo} ")
	void  deleteProcessmasteritem(@Param("mainCategory") String mainCategory, @Param("subCategory") String subCategory, @Param("itemCode") String itemCode, @Param("serialNo") Integer serialNo);

    void updateProcessmasteritem(Processmasteritem processmasteritem);
}
