package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Cashvoucherdetails;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface CashvoucherdetailsMapper{

	@Select ("SELECT * FROM cashvoucherdetails")
	List<Cashvoucherdetails> getAllCashvoucherdetails();

	@Select ("SELECT * FROM cashvoucherdetails WHERE CVId = #{cVId} AND SerialNo = #{serialNo} ")
	Cashvoucherdetails getCashvoucherdetails(@Param("cVId") Integer cVId, @Param("serialNo") Integer serialNo);

	@Insert ("INSERT INTO cashvoucherdetails(CVId, SerialNo, HeadCode, Particulars, TranType, TranAmount)  VALUES (#{cVId} , #{serialNo} , #{headCode} , #{particulars} , #{tranType} , #{tranAmount} )")
	void  saveCashvoucherdetails(Cashvoucherdetails cashvoucherdetails);

	@Update ("UPDATE  cashvoucherdetails SET HeadCode = #{headCode}, Particulars = #{particulars}, TranType = #{tranType}, TranAmount = #{tranAmount} WHERE CVId = #{cVId} AND SerialNo = #{serialNo} ")
	void  updateCashvoucherdetails(@Param("cVId") Integer cVId, @Param("serialNo") Integer serialNo);

	@Delete ("DELETE FROM cashvoucherdetails WHERE CVId = #{cVId} AND SerialNo = #{serialNo} ")
	void  deleteCashvoucherdetails(@Param("cVId") Integer cVId, @Param("serialNo") Integer serialNo);

    void updateCashvoucherdetails(Cashvoucherdetails cashvoucherdetails);
}
