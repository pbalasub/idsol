package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Orderitem;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface OrderitemMapper{

	@Select ("SELECT * FROM orderitem")
	List<Orderitem> getAllOrderitem();

	@Select ("SELECT * FROM orderitem WHERE OFNo = #{oFNo} AND ItemCode = #{itemCode} AND SpecialChar1 = #{specialChar1} AND SpecialChar2 = #{specialChar2} AND SpecialChar3 = #{specialChar3} AND SpecialChar4 = #{specialChar4} AND SpecialChar5 = #{specialChar5} ")
	Orderitem getOrderitem(@Param("oFNo") String oFNo, @Param("itemCode") String itemCode, @Param("specialChar1") String specialChar1, @Param("specialChar2") String specialChar2, @Param("specialChar3") String specialChar3, @Param("specialChar4") String specialChar4, @Param("specialChar5") String specialChar5);

	@Insert ("INSERT INTO orderitem(OFNo, ItemCode, SpecialChar1, SpecialChar2, SpecialChar3, SpecialChar4, SpecialChar5, AccQtyInNos, AccWeight, PlannedWOGenQty, PlannedWOGenWeight, WOGenQty, WOGenWeight, ClosureStatus, OFAccDeliveryDate)  VALUES (#{oFNo} , #{itemCode} , #{specialChar1} , #{specialChar2} , #{specialChar3} , #{specialChar4} , #{specialChar5} , #{accQtyInNos} , #{accWeight} , #{plannedWOGenQty} , #{plannedWOGenWeight} , #{wOGenQty} , #{wOGenWeight} , #{closureStatus} , #{oFAccDeliveryDate} )")
	void  saveOrderitem(Orderitem orderitem);

	@Update ("UPDATE  orderitem SET AccQtyInNos = #{accQtyInNos}, AccWeight = #{accWeight}, PlannedWOGenQty = #{plannedWOGenQty}, PlannedWOGenWeight = #{plannedWOGenWeight}, WOGenQty = #{wOGenQty}, WOGenWeight = #{wOGenWeight}, ClosureStatus = #{closureStatus}, OFAccDeliveryDate = #{oFAccDeliveryDate} WHERE OFNo = #{oFNo} AND ItemCode = #{itemCode} AND SpecialChar1 = #{specialChar1} AND SpecialChar2 = #{specialChar2} AND SpecialChar3 = #{specialChar3} AND SpecialChar4 = #{specialChar4} AND SpecialChar5 = #{specialChar5} ")
	void  updateOrderitem(@Param("oFNo") String oFNo, @Param("itemCode") String itemCode, @Param("specialChar1") String specialChar1, @Param("specialChar2") String specialChar2, @Param("specialChar3") String specialChar3, @Param("specialChar4") String specialChar4, @Param("specialChar5") String specialChar5);

	@Delete ("DELETE FROM orderitem WHERE OFNo = #{oFNo} AND ItemCode = #{itemCode} AND SpecialChar1 = #{specialChar1} AND SpecialChar2 = #{specialChar2} AND SpecialChar3 = #{specialChar3} AND SpecialChar4 = #{specialChar4} AND SpecialChar5 = #{specialChar5} ")
	void  deleteOrderitem(@Param("oFNo") String oFNo, @Param("itemCode") String itemCode, @Param("specialChar1") String specialChar1, @Param("specialChar2") String specialChar2, @Param("specialChar3") String specialChar3, @Param("specialChar4") String specialChar4, @Param("specialChar5") String specialChar5);

    void updateOrderitem(Orderitem orderitem);
}
