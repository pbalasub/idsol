package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Loginuserpassword;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface LoginuserpasswordMapper{

	@Select ("SELECT * FROM loginuserpassword")
	List<Loginuserpassword> getAllLoginuserpassword();

	@Select ("SELECT * FROM loginuserpassword WHERE UserId = #{userId} ")
	Loginuserpassword getLoginuserpassword(@Param("userId") String userId);

	@Insert ("INSERT INTO loginuserpassword(UserId, Password, LastUpdatedBy, LastUpdatedDate, LastUpdatedTime)  VALUES (#{userId} , #{password} , #{lastUpdatedBy} , #{lastUpdatedDate} , #{lastUpdatedTime} )")
	void  saveLoginuserpassword(Loginuserpassword loginuserpassword);

	@Update ("UPDATE  loginuserpassword SET Password = #{password}, LastUpdatedBy = #{lastUpdatedBy}, LastUpdatedDate = #{lastUpdatedDate}, LastUpdatedTime = #{lastUpdatedTime} WHERE UserId = #{userId} ")
	void  updateLoginuserpassword(@Param("userId") String userId);

	@Delete ("DELETE FROM loginuserpassword WHERE UserId = #{userId} ")
	void  deleteLoginuserpassword(@Param("userId") String userId);

}
