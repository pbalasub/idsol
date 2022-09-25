package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Logingroup;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface LogingroupMapper{

	@Select ("SELECT * FROM logingroup")
	List<Logingroup> getAllLogingroup();

	@Select ("SELECT * FROM logingroup WHERE GroupCode = #{groupCode} ")
	Logingroup getLogingroup(@Param("groupCode") String groupCode);

	@Insert ("INSERT INTO logingroup(GroupCode, GroupName, LastUpdatedBy, LastUpdatedDate, LastUpdatedTime)  VALUES (#{groupCode} , #{groupName} , #{lastUpdatedBy} , #{lastUpdatedDate} , #{lastUpdatedTime} )")
	Logingroup saveLogingroup(Logingroup logingroup);

	@Update ("UPDATE  logingroup SET GroupName = #{groupName}, LastUpdatedBy = #{lastUpdatedBy}, LastUpdatedDate = #{lastUpdatedDate}, LastUpdatedTime = #{lastUpdatedTime} WHERE GroupCode = #{groupCode} ")
	Logingroup updateLogingroup(@Param("groupCode") String groupCode);

	@Delete ("DELETE * FROM logingroup WHERE GroupCode = #{groupCode} ")
	Logingroup deleteLogingroup(@Param("groupCode") String groupCode);

}
