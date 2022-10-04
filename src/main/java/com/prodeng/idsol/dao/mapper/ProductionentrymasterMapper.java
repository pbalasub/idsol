package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Productionentrymaster;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface ProductionentrymasterMapper{

	@Select ("SELECT * FROM productionentrymaster")
	List<Productionentrymaster> getAllProductionentrymaster();

	@Select ("SELECT * FROM productionentrymaster WHERE ProdNo = #{prodNo} ")
	Productionentrymaster getProductionentrymaster(@Param("prodNo") String prodNo);

	@Insert ("INSERT INTO productionentrymaster(ProdNo, WorkOrderNo, ItemCode, ProcessFrom, ProcessTo, ProdHrs, AccQty, RejQty, NcQty, LastUpdatedBy, LastUpdatedDate, LastUpdatedTime, Flag)  VALUES (#{prodNo} , #{workOrderNo} , #{itemCode} , #{processFrom} , #{processTo} , #{prodHrs} , #{accQty} , #{rejQty} , #{ncQty} , #{lastUpdatedBy} , #{lastUpdatedDate} , #{lastUpdatedTime} , #{flag} )")
	void  saveProductionentrymaster(Productionentrymaster productionentrymaster);

	@Update ("UPDATE  productionentrymaster SET WorkOrderNo = #{workOrderNo}, ItemCode = #{itemCode}, ProcessFrom = #{processFrom}, ProcessTo = #{processTo}, ProdHrs = #{prodHrs}, AccQty = #{accQty}, RejQty = #{rejQty}, NcQty = #{ncQty}, LastUpdatedBy = #{lastUpdatedBy}, LastUpdatedDate = #{lastUpdatedDate}, LastUpdatedTime = #{lastUpdatedTime}, Flag = #{flag} WHERE ProdNo = #{prodNo} ")
	void  updateProductionentrymaster(@Param("prodNo") String prodNo);

	@Delete ("DELETE FROM productionentrymaster WHERE ProdNo = #{prodNo} ")
	void  deleteProductionentrymaster(@Param("prodNo") String prodNo);

}
