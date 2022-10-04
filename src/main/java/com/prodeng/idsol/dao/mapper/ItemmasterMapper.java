package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Itemmaster;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface ItemmasterMapper{

	@Select ("SELECT * FROM itemmaster")
	List<Itemmaster> getAllItemmaster();

	@Select ("SELECT * FROM itemmaster WHERE ItemCode = #{itemCode} ")
	Itemmaster getItemmaster(@Param("itemCode") String itemCode);

	@Insert ("INSERT INTO itemmaster(ItemCode, ItemDescription, MainCategory, SubCategory, UOM, Specification, DrawingNo, IACCode, Location, IsVendorRatingItem, IsStockListItem, IsSelfLifeItem, ReOrderLevel, ReOrderQty, MaxQty, MinQty, ReviewPeriod, OpenBalance, CustItemCode, Length, Weight, LastUpdatedBy, LastUpdatedDate, LastUpdatedTime, AccountHead, RMRefItemCode, ProcessMinWeight, ProcessMaxWeight, ProcessAverageWeight, ToolLifePlanned, ReOrderProcessCode, OpenBalanceDate, CustomerCode, HsnCode, Others)  VALUES (#{itemCode} , #{itemDescription} , #{mainCategory} , #{subCategory} , #{uOM} , #{specification} , #{drawingNo} , #{iACCode} , #{location} , #{isVendorRatingItem} , #{isStockListItem} , #{isSelfLifeItem} , #{reOrderLevel} , #{reOrderQty} , #{maxQty} , #{minQty} , #{reviewPeriod} , #{openBalance} , #{custItemCode} , #{length} , #{weight} , #{lastUpdatedBy} , #{lastUpdatedDate} , #{lastUpdatedTime} , #{accountHead} , #{rMRefItemCode} , #{processMinWeight} , #{processMaxWeight} , #{processAverageWeight} , #{toolLifePlanned} , #{reOrderProcessCode} , #{openBalanceDate} , #{customerCode} , #{hsnCode} , #{others} )")
	void  saveItemmaster(Itemmaster itemmaster);

	@Update ("UPDATE  itemmaster SET ItemDescription = #{itemDescription}, MainCategory = #{mainCategory}, SubCategory = #{subCategory}, UOM = #{uOM}, Specification = #{specification}, DrawingNo = #{drawingNo}, IACCode = #{iACCode}, Location = #{location}, IsVendorRatingItem = #{isVendorRatingItem}, IsStockListItem = #{isStockListItem}, IsSelfLifeItem = #{isSelfLifeItem}, ReOrderLevel = #{reOrderLevel}, ReOrderQty = #{reOrderQty}, MaxQty = #{maxQty}, MinQty = #{minQty}, ReviewPeriod = #{reviewPeriod}, OpenBalance = #{openBalance}, CustItemCode = #{custItemCode}, Length = #{length}, Weight = #{weight}, LastUpdatedBy = #{lastUpdatedBy}, LastUpdatedDate = #{lastUpdatedDate}, LastUpdatedTime = #{lastUpdatedTime}, AccountHead = #{accountHead}, RMRefItemCode = #{rMRefItemCode}, ProcessMinWeight = #{processMinWeight}, ProcessMaxWeight = #{processMaxWeight}, ProcessAverageWeight = #{processAverageWeight}, ToolLifePlanned = #{toolLifePlanned}, ReOrderProcessCode = #{reOrderProcessCode}, OpenBalanceDate = #{openBalanceDate}, CustomerCode = #{customerCode}, HsnCode = #{hsnCode}, Others = #{others} WHERE ItemCode = #{itemCode} ")
	void  updateItemmaster(@Param("itemCode") String itemCode);

	@Delete ("DELETE FROM itemmaster WHERE ItemCode = #{itemCode} ")
	void  deleteItemmaster(@Param("itemCode") String itemCode);

}
