package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Receivinginspectionitem;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface ReceivinginspectionitemMapper{

	@Select ("SELECT * FROM receivinginspectionitem")
	List<Receivinginspectionitem> getAllReceivinginspectionitem();

	@Select ("SELECT * FROM receivinginspectionitem WHERE RIId = #{rIId} AND SerialNo = #{serialNo} ")
	Receivinginspectionitem getReceivinginspectionitem(@Param("rIId") Integer rIId, @Param("serialNo") Integer serialNo);

	@Insert ("INSERT INTO receivinginspectionitem(RIId, SerialNo, DrwgSlNo, Characteristics, SpecialChar, MinSpec, MaxSpec, Job1, Job2, Job3, Job4, Job5)  VALUES (#{rIId} , #{serialNo} , #{drwgSlNo} , #{characteristics} , #{specialChar} , #{minSpec} , #{maxSpec} , #{job1} , #{job2} , #{job3} , #{job4} , #{job5} )")
	void  saveReceivinginspectionitem(Receivinginspectionitem receivinginspectionitem);

	@Update ("UPDATE  receivinginspectionitem SET DrwgSlNo = #{drwgSlNo}, Characteristics = #{characteristics}, SpecialChar = #{specialChar}, MinSpec = #{minSpec}, MaxSpec = #{maxSpec}, Job1 = #{job1}, Job2 = #{job2}, Job3 = #{job3}, Job4 = #{job4}, Job5 = #{job5} WHERE RIId = #{rIId} AND SerialNo = #{serialNo} ")
	void  updateReceivinginspectionitem(@Param("rIId") Integer rIId, @Param("serialNo") Integer serialNo);

	@Delete ("DELETE FROM receivinginspectionitem WHERE RIId = #{rIId} AND SerialNo = #{serialNo} ")
	void  deleteReceivinginspectionitem(@Param("rIId") Integer rIId, @Param("serialNo") Integer serialNo);

    void updateReceivinginspectionitem(Receivinginspectionitem receivinginspectionitem);
}
