package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Itemmastercostprocess;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface ItemmastercostprocessMapper{

	@Select ("SELECT * FROM itemmastercostprocess")
	List<Itemmastercostprocess> getAllItemmastercostprocess();

	@Select ("SELECT * FROM itemmastercostprocess WHERE MainCategory = #{mainCategory} AND SubCategory = #{subCategory} AND ItemCode = #{itemCode} AND SuppCode = #{suppCode} AND ProcessFrom = #{processFrom} AND ProcessTo = #{processTo} ")
	Itemmastercostprocess getItemmastercostprocess(@Param("mainCategory") String mainCategory, @Param("subCategory") String subCategory, @Param("itemCode") String itemCode, @Param("suppCode") String suppCode, @Param("processFrom") String processFrom, @Param("processTo") String processTo);

	@Insert ("INSERT INTO itemmastercostprocess(MainCategory, SubCategory, ItemCode, SuppCode, ProcessFrom, ProcessTo, ProcessWeight, YieldProcessWeight, JobCost, Location, Identity, RMItemCode)  VALUES (#{mainCategory} , #{subCategory} , #{itemCode} , #{suppCode} , #{processFrom} , #{processTo} , #{processWeight} , #{yieldProcessWeight} , #{jobCost} , #{location} , #{identity} , #{rMItemCode} )")
	void  saveItemmastercostprocess(Itemmastercostprocess itemmastercostprocess);

	@Update ("UPDATE  itemmastercostprocess SET ProcessWeight = #{processWeight}, YieldProcessWeight = #{yieldProcessWeight}, JobCost = #{jobCost}, Location = #{location}, Identity = #{identity}, RMItemCode = #{rMItemCode} WHERE MainCategory = #{mainCategory} AND SubCategory = #{subCategory} AND ItemCode = #{itemCode} AND SuppCode = #{suppCode} AND ProcessFrom = #{processFrom} AND ProcessTo = #{processTo} ")
	void  updateItemmastercostprocess(@Param("mainCategory") String mainCategory, @Param("subCategory") String subCategory, @Param("itemCode") String itemCode, @Param("suppCode") String suppCode, @Param("processFrom") String processFrom, @Param("processTo") String processTo);

	@Delete ("DELETE FROM itemmastercostprocess WHERE MainCategory = #{mainCategory} AND SubCategory = #{subCategory} AND ItemCode = #{itemCode} AND SuppCode = #{suppCode} AND ProcessFrom = #{processFrom} AND ProcessTo = #{processTo} ")
	void  deleteItemmastercostprocess(@Param("mainCategory") String mainCategory, @Param("subCategory") String subCategory, @Param("itemCode") String itemCode, @Param("suppCode") String suppCode, @Param("processFrom") String processFrom, @Param("processTo") String processTo);

    void updateItemmastercostprocess(Itemmastercostprocess itemmastercostprocess);
}
