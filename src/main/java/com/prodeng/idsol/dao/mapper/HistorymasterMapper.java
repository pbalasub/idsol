package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Historymaster;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface HistorymasterMapper{

	@Select ("SELECT * FROM historymaster")
	List<Historymaster> getAllHistorymaster();

	@Select ("SELECT * FROM historymaster WHERE HistoryCode = #{historyCode} ")
	Historymaster getHistorymaster(@Param("historyCode") String historyCode);

	@Insert ("INSERT INTO historymaster(HistoryCode, ItemCode, Type, OrderNo, SupplierName, ManufactureYear, Make, Model, Capacity, SerialNo, Remarks, LastUpdatedBy, LastUpdatedDate, LastUpdatedTime, OrderType, ToolLifePlanned, ToolLifeAchieved, Status, ValidFrom, ValidTill, SpecialRemarks, SectionCode)  VALUES (#{historyCode} , #{itemCode} , #{type} , #{orderNo} , #{supplierName} , #{manufactureYear} , #{make} , #{model} , #{capacity} , #{serialNo} , #{remarks} , #{lastUpdatedBy} , #{lastUpdatedDate} , #{lastUpdatedTime} , #{orderType} , #{toolLifePlanned} , #{toolLifeAchieved} , #{status} , #{validFrom} , #{validTill} , #{specialRemarks} , #{sectionCode} )")
	void  saveHistorymaster(Historymaster historymaster);

	@Update ("UPDATE  historymaster SET ItemCode = #{itemCode}, Type = #{type}, OrderNo = #{orderNo}, SupplierName = #{supplierName}, ManufactureYear = #{manufactureYear}, Make = #{make}, Model = #{model}, Capacity = #{capacity}, SerialNo = #{serialNo}, Remarks = #{remarks}, LastUpdatedBy = #{lastUpdatedBy}, LastUpdatedDate = #{lastUpdatedDate}, LastUpdatedTime = #{lastUpdatedTime}, OrderType = #{orderType}, ToolLifePlanned = #{toolLifePlanned}, ToolLifeAchieved = #{toolLifeAchieved}, Status = #{status}, ValidFrom = #{validFrom}, ValidTill = #{validTill}, SpecialRemarks = #{specialRemarks}, SectionCode = #{sectionCode} WHERE HistoryCode = #{historyCode} ")
	void  updateHistorymaster(@Param("historyCode") String historyCode);

	@Delete ("DELETE FROM historymaster WHERE HistoryCode = #{historyCode} ")
	void  deleteHistorymaster(@Param("historyCode") String historyCode);

}
