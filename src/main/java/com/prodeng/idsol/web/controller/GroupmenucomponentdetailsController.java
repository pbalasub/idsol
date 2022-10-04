package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Groupmenucomponentdetails;
import com.prodeng.idsol.dao.mapper.GroupmenucomponentdetailsMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/groupmenucomponentdetails")
@Slf4j
public class GroupmenucomponentdetailsController{

	@Autowired
	private GroupmenucomponentdetailsMapper groupmenucomponentdetailsMapper;

	@GetMapping("/")
	public List<Groupmenucomponentdetails> getAllGroupmenucomponentdetails() {
		List<Groupmenucomponentdetails> groupmenucomponentdetailss = groupmenucomponentdetailsMapper.getAllGroupmenucomponentdetails();
		return groupmenucomponentdetailss;
	}

	@GetMapping("/{groupCode}/{serialNo}")
	public Groupmenucomponentdetails getGroupmenucomponentdetails(@PathVariable(value = "groupCode") String groupCode, @PathVariable(value = "serialNo") Integer serialNo) {
		Groupmenucomponentdetails groupmenucomponentdetails = groupmenucomponentdetailsMapper.getGroupmenucomponentdetails(groupCode,serialNo);
		log.debug(groupmenucomponentdetails.toString());
		return groupmenucomponentdetails;
	}

	@PutMapping("/update")
	public void  updateGroupmenucomponentdetails(@RequestBody Groupmenucomponentdetails groupmenucomponentdetails) {
		groupmenucomponentdetailsMapper.updateGroupmenucomponentdetails(groupmenucomponentdetails);
		log.debug(groupmenucomponentdetails.toString());
	}

	@PostMapping("/save")
	public void saveGroupmenucomponentdetails(@RequestBody Groupmenucomponentdetails groupmenucomponentdetails){
		groupmenucomponentdetailsMapper.saveGroupmenucomponentdetails(groupmenucomponentdetails);
		log.debug(groupmenucomponentdetails.toString());
	}

	@DeleteMapping("/delete/{groupCode}/{serialNo}")
	public void  deleteGroupmenucomponentdetails(@PathVariable(value = "groupCode") String groupCode, @PathVariable(value = "serialNo") Integer serialNo) {
		groupmenucomponentdetailsMapper.deleteGroupmenucomponentdetails(groupCode,serialNo);
	}


}
