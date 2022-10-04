package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Itemmastercostotherheads;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface ItemmastercostotherheadsMapper{

	@Select ("SELECT * FROM itemmastercostotherheads")
	List<Itemmastercostotherheads> getAllItemmastercostotherheads();

	@Select ("SELECT * FROM itemmastercostotherheads WHERE MainCategory = #{mainCategory} AND SubCategory = #{subCategory} AND ItemCode = #{itemCode} AND AccHeadCode = #{accHeadCode} ")
	Itemmastercostotherheads getItemmastercostotherheads(@Param("mainCategory") String mainCategory, @Param("subCategory") String subCategory, @Param("itemCode") String itemCode, @Param("accHeadCode") String accHeadCode);

	@Insert ("INSERT INTO itemmastercostotherheads(MainCategory, SubCategory, ItemCode, AccHeadCode, JobCost)  VALUES (#{mainCategory} , #{subCategory} , #{itemCode} , #{accHeadCode} , #{jobCost} )")
	void  saveItemmastercostotherheads(Itemmastercostotherheads itemmastercostotherheads);

	@Update ("UPDATE  itemmastercostotherheads SET JobCost = #{jobCost} WHERE MainCategory = #{mainCategory} AND SubCategory = #{subCategory} AND ItemCode = #{itemCode} AND AccHeadCode = #{accHeadCode} ")
	void  updateItemmastercostotherheads(@Param("mainCategory") String mainCategory, @Param("subCategory") String subCategory, @Param("itemCode") String itemCode, @Param("accHeadCode") String accHeadCode);

	@Delete ("DELETE FROM itemmastercostotherheads WHERE MainCategory = #{mainCategory} AND SubCategory = #{subCategory} AND ItemCode = #{itemCode} AND AccHeadCode = #{accHeadCode} ")
	void  deleteItemmastercostotherheads(@Param("mainCategory") String mainCategory, @Param("subCategory") String subCategory, @Param("itemCode") String itemCode, @Param("accHeadCode") String accHeadCode);

    void updateItemmastercostotherheads(Itemmastercostotherheads itemmastercostotherheads);
}
