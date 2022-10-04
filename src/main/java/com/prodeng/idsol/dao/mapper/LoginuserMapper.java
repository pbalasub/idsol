package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Loginuser;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface LoginuserMapper{

	@Select ("SELECT * FROM loginuser")
	List<Loginuser> getAllLoginuser();

	@Select ("SELECT * FROM loginuser WHERE UserId = #{userId} ")
	Loginuser getLoginuser(@Param("userId") String userId);

	@Insert ("INSERT INTO loginuser(UserId, Password, Dept, UserName, EmpCode, EmpName, SuperUser, LoggedIn, LoggedInTime, LastUpdatedBy, LastUpdatedDate, LastUpdatedTime, SectionCode)  VALUES (#{userId} , #{password} , #{dept} , #{userName} , #{empCode} , #{empName} , #{superUser} , #{loggedIn} , #{loggedInTime} , #{lastUpdatedBy} , #{lastUpdatedDate} , #{lastUpdatedTime} , #{sectionCode} )")
	void  saveLoginuser(Loginuser loginuser);

	@Update ("UPDATE  loginuser SET Password = #{password}, Dept = #{dept}, UserName = #{userName}, EmpCode = #{empCode}, EmpName = #{empName}, SuperUser = #{superUser}, LoggedIn = #{loggedIn}, LoggedInTime = #{loggedInTime}, LastUpdatedBy = #{lastUpdatedBy}, LastUpdatedDate = #{lastUpdatedDate}, LastUpdatedTime = #{lastUpdatedTime}, SectionCode = #{sectionCode} WHERE UserId = #{userId} ")
	void  updateLoginuser(@Param("userId") String userId);

	@Delete ("DELETE FROM loginuser WHERE UserId = #{userId} ")
	void  deleteLoginuser(@Param("userId") String userId);

}
