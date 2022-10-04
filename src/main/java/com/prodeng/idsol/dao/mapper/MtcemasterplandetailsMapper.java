package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Mtcemasterplandetails;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface MtcemasterplandetailsMapper{

	@Select ("SELECT * FROM mtcemasterplandetails")
	List<Mtcemasterplandetails> getAllMtcemasterplandetails();

	@Select ("SELECT * FROM mtcemasterplandetails WHERE MPId = #{mPId} AND SerialNo = #{serialNo} ")
	Mtcemasterplandetails getMtcemasterplandetails(@Param("mPId") Integer mPId, @Param("serialNo") Integer serialNo);

	@Insert ("INSERT INTO mtcemasterplandetails(MPId, SerialNo, HistoryCode, Daily, Weekly, MonthlyStartDate, MonthlyDaysReqd, QuarterlyStartDate, QuarterlyDaysReqd, HalfYearlyStartDate, HalfYearlyDaysReqd, AnnuallyStartDate, AnnuallyDaysReqd)  VALUES (#{mPId} , #{serialNo} , #{historyCode} , #{daily} , #{weekly} , #{monthlyStartDate} , #{monthlyDaysReqd} , #{quarterlyStartDate} , #{quarterlyDaysReqd} , #{halfYearlyStartDate} , #{halfYearlyDaysReqd} , #{annuallyStartDate} , #{annuallyDaysReqd} )")
	void  saveMtcemasterplandetails(Mtcemasterplandetails mtcemasterplandetails);

	@Update ("UPDATE  mtcemasterplandetails SET HistoryCode = #{historyCode}, Daily = #{daily}, Weekly = #{weekly}, MonthlyStartDate = #{monthlyStartDate}, MonthlyDaysReqd = #{monthlyDaysReqd}, QuarterlyStartDate = #{quarterlyStartDate}, QuarterlyDaysReqd = #{quarterlyDaysReqd}, HalfYearlyStartDate = #{halfYearlyStartDate}, HalfYearlyDaysReqd = #{halfYearlyDaysReqd}, AnnuallyStartDate = #{annuallyStartDate}, AnnuallyDaysReqd = #{annuallyDaysReqd} WHERE MPId = #{mPId} AND SerialNo = #{serialNo} ")
	void  updateMtcemasterplandetails(@Param("mPId") Integer mPId, @Param("serialNo") Integer serialNo);

	@Delete ("DELETE FROM mtcemasterplandetails WHERE MPId = #{mPId} AND SerialNo = #{serialNo} ")
	void  deleteMtcemasterplandetails(@Param("mPId") Integer mPId, @Param("serialNo") Integer serialNo);

    void updateMtcemasterplandetails(Mtcemasterplandetails mtcemasterplandetails);
}
