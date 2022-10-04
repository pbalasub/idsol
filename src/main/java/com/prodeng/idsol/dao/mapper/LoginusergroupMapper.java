package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Loginusergroup;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface LoginusergroupMapper{

	@Select ("SELECT * FROM loginusergroup")
	List<Loginusergroup> getAllLoginusergroup();

	@Select ("SELECT * FROM loginusergroup WHERE UserId = #{userId} ")
	Loginusergroup getLoginusergroup(@Param("userId") String userId);

	@Insert ("INSERT INTO loginusergroup(UserId, GroupCode, LastUpdatedBy, LastUpdatedDate, LastUpdatedTime)  VALUES (#{userId} , #{groupCode} , #{lastUpdatedBy} , #{lastUpdatedDate} , #{lastUpdatedTime} )")
	void  saveLoginusergroup(Loginusergroup loginusergroup);

	@Update ("UPDATE  loginusergroup SET GroupCode = #{groupCode}, LastUpdatedBy = #{lastUpdatedBy}, LastUpdatedDate = #{lastUpdatedDate}, LastUpdatedTime = #{lastUpdatedTime} WHERE UserId = #{userId} ")
	void  updateLoginusergroup(@Param("userId") String userId);

	@Delete ("DELETE FROM loginusergroup WHERE UserId = #{userId} ")
	void  deleteLoginusergroup(@Param("userId") String userId);

}
