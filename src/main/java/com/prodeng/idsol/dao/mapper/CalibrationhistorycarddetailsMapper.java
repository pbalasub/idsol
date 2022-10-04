package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Calibrationhistorycarddetails;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface CalibrationhistorycarddetailsMapper{

	@Select ("SELECT * FROM calibrationhistorycarddetails")
	List<Calibrationhistorycarddetails> getAllCalibrationhistorycarddetails();

	@Select ("SELECT * FROM calibrationhistorycarddetails WHERE CHCId = #{cHCId} AND SerialNo = #{serialNo} ")
	Calibrationhistorycarddetails getCalibrationhistorycarddetails(@Param("cHCId") Integer cHCId, @Param("serialNo") Integer serialNo);

	@Insert ("INSERT INTO calibrationhistorycarddetails(CHCId, SerialNo, CalibCondition, DateOfCalibration, CalibratedBy, CertificateRef, ErrorDetails, AccCriteriaLimit, ActionTaken, DueDate, Remarks, ApprovedBy, ActiveFlag)  VALUES (#{cHCId} , #{serialNo} , #{calibCondition} , #{dateOfCalibration} , #{calibratedBy} , #{certificateRef} , #{errorDetails} , #{accCriteriaLimit} , #{actionTaken} , #{dueDate} , #{remarks} , #{approvedBy} , #{activeFlag} )")
	void  saveCalibrationhistorycarddetails(Calibrationhistorycarddetails calibrationhistorycarddetails);

	@Update ("UPDATE  calibrationhistorycarddetails SET CalibCondition = #{calibCondition}, DateOfCalibration = #{dateOfCalibration}, CalibratedBy = #{calibratedBy}, CertificateRef = #{certificateRef}, ErrorDetails = #{errorDetails}, AccCriteriaLimit = #{accCriteriaLimit}, ActionTaken = #{actionTaken}, DueDate = #{dueDate}, Remarks = #{remarks}, ApprovedBy = #{approvedBy}, ActiveFlag = #{activeFlag} WHERE CHCId = #{cHCId} AND SerialNo = #{serialNo} ")
	void  updateCalibrationhistorycarddetails(@Param("cHCId") Integer cHCId, @Param("serialNo") Integer serialNo);

	@Delete ("DELETE FROM calibrationhistorycarddetails WHERE CHCId = #{cHCId} AND SerialNo = #{serialNo} ")
	void  deleteCalibrationhistorycarddetails(@Param("cHCId") Integer cHCId, @Param("serialNo") Integer serialNo);

    void updateCalibrationhistorycarddetails(Calibrationhistorycarddetails calibrationhistorycarddetails);
}
