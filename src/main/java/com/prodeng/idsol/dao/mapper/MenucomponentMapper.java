package com.prodeng.idsol.dao.mapper;

import com.prodeng.idsol.dao.entity.Menucomponent;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface MenucomponentMapper{

	@Select ("SELECT * FROM menucomponent")
	List<Menucomponent> getAllMenucomponent();

	@Select ("SELECT * FROM menucomponent WHERE ComponentId = #{componentId} ")
	Menucomponent getMenucomponent(@Param("componentId") Integer componentId);

	@Insert ("INSERT INTO menucomponent(ComponentId, ParentId, LinkType, LinkName, LinkURL, OrderSeq, LastUpdatedBy, LastUpdatedDate, LastUpdatedTime)  VALUES (#{componentId} , #{parentId} , #{linkType} , #{linkName} , #{linkURL} , #{orderSeq} , #{lastUpdatedBy} , #{lastUpdatedDate} , #{lastUpdatedTime} )")
	void  saveMenucomponent(Menucomponent menucomponent);

	@Update ("UPDATE  menucomponent SET ParentId = #{parentId}, LinkType = #{linkType}, LinkName = #{linkName}, LinkURL = #{linkURL}, OrderSeq = #{orderSeq}, LastUpdatedBy = #{lastUpdatedBy}, LastUpdatedDate = #{lastUpdatedDate}, LastUpdatedTime = #{lastUpdatedTime} WHERE ComponentId = #{componentId} ")
	void  updateMenucomponent(@Param("componentId") Menucomponent componentId);

	@Delete ("DELETE FROM menucomponent WHERE ComponentId = #{componentId} ")
	void  deleteMenucomponent(@Param("componentId") Integer componentId);

}
