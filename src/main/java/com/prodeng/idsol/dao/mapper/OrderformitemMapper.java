package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Orderformitem;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface OrderformitemMapper{

	@Select ("SELECT * FROM orderformitem")
	List<Orderformitem> getAllOrderformitem();

	@Select ("SELECT * FROM orderformitem WHERE OFId = #{oFId} AND SerialNo = #{serialNo} ")
	Orderformitem getOrderformitem(@Param("oFId") Integer oFId, @Param("serialNo") Integer serialNo);

	@Insert ("INSERT INTO orderformitem(OFId, SerialNo, ItemCode, OFQtyInNos, OFWeight, DeliveryDate, SpecialChar1, SpecialChar2, SpecialChar3, SpecialChar4, SpecialChar5, AccQtyInNos, AccWeight, AccDeliveryDate, Reason)  VALUES (#{oFId} , #{serialNo} , #{itemCode} , #{oFQtyInNos} , #{oFWeight} , #{deliveryDate} , #{specialChar1} , #{specialChar2} , #{specialChar3} , #{specialChar4} , #{specialChar5} , #{accQtyInNos} , #{accWeight} , #{accDeliveryDate} , #{reason} )")
	void  saveOrderformitem(Orderformitem orderformitem);

	@Update ("UPDATE  orderformitem SET ItemCode = #{itemCode}, OFQtyInNos = #{oFQtyInNos}, OFWeight = #{oFWeight}, DeliveryDate = #{deliveryDate}, SpecialChar1 = #{specialChar1}, SpecialChar2 = #{specialChar2}, SpecialChar3 = #{specialChar3}, SpecialChar4 = #{specialChar4}, SpecialChar5 = #{specialChar5}, AccQtyInNos = #{accQtyInNos}, AccWeight = #{accWeight}, AccDeliveryDate = #{accDeliveryDate}, Reason = #{reason} WHERE OFId = #{oFId} AND SerialNo = #{serialNo} ")
	void  updateOrderformitem(@Param("oFId") Integer oFId, @Param("serialNo") Integer serialNo);

	@Delete ("DELETE FROM orderformitem WHERE OFId = #{oFId} AND SerialNo = #{serialNo} ")
	void  deleteOrderformitem(@Param("oFId") Integer oFId, @Param("serialNo") Integer serialNo);

    void updateOrderformitem(Orderformitem orderformitem);
}
