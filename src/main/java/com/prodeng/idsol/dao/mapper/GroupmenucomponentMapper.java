package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Groupmenucomponent;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface GroupmenucomponentMapper{

	@Select ("SELECT * FROM groupmenucomponent")
	List<Groupmenucomponent> getAllGroupmenucomponent();

	@Select ("SELECT * FROM groupmenucomponent WHERE GroupCode = #{groupCode} ")
	Groupmenucomponent getGroupmenucomponent(@Param("groupCode") String groupCode);

	@Insert ("INSERT INTO groupmenucomponent(GroupCode, Remarks, LastUpdatedBy, LastUpdatedDate, LastUpdatedTime)  VALUES (#{groupCode} , #{remarks} , #{lastUpdatedBy} , #{lastUpdatedDate} , #{lastUpdatedTime} )")
	void  saveGroupmenucomponent(Groupmenucomponent groupmenucomponent);

	@Update ("UPDATE  groupmenucomponent SET Remarks = #{remarks}, LastUpdatedBy = #{lastUpdatedBy}, LastUpdatedDate = #{lastUpdatedDate}, LastUpdatedTime = #{lastUpdatedTime} WHERE GroupCode = #{groupCode} ")
	void  updateGroupmenucomponent(@Param("groupCode") String groupCode);

	@Delete ("DELETE FROM groupmenucomponent WHERE GroupCode = #{groupCode} ")
	void  deleteGroupmenucomponent(@Param("groupCode") String groupCode);

}
