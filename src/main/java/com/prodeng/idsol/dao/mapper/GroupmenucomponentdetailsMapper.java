package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Groupmenucomponentdetails;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface GroupmenucomponentdetailsMapper{

	@Select ("SELECT * FROM groupmenucomponentdetails")
	List<Groupmenucomponentdetails> getAllGroupmenucomponentdetails();

	@Select ("SELECT * FROM groupmenucomponentdetails WHERE GroupCode = #{groupCode} AND SerialNo = #{serialNo} ")
	Groupmenucomponentdetails getGroupmenucomponentdetails(@Param("groupCode") String groupCode, @Param("serialNo") Integer serialNo);

	@Insert ("INSERT INTO groupmenucomponentdetails(GroupCode, SerialNo, ComponentId)  VALUES (#{groupCode} , #{serialNo} , #{componentId} )")
	void  saveGroupmenucomponentdetails(Groupmenucomponentdetails groupmenucomponentdetails);

	@Update ("UPDATE  groupmenucomponentdetails SET ComponentId = #{componentId} WHERE GroupCode = #{groupCode} AND SerialNo = #{serialNo} ")
	void  updateGroupmenucomponentdetails(@Param("groupCode") String groupCode, @Param("serialNo") Integer serialNo);

	@Delete ("DELETE FROM groupmenucomponentdetails WHERE GroupCode = #{groupCode} AND SerialNo = #{serialNo} ")
	void  deleteGroupmenucomponentdetails(@Param("groupCode") String groupCode, @Param("serialNo") Integer serialNo);

    void updateGroupmenucomponentdetails(Groupmenucomponentdetails groupmenucomponentdetails);
}
