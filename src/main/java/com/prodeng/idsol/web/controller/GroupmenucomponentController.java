package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Groupmenucomponent;
import com.prodeng.idsol.dao.mapper.GroupmenucomponentMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/groupmenucomponent")
@Slf4j
public class GroupmenucomponentController{

	@Autowired
	private GroupmenucomponentMapper groupmenucomponentMapper;

	@GetMapping("/")
	public List<Groupmenucomponent> getAllGroupmenucomponent() {
		List<Groupmenucomponent> groupmenucomponents = groupmenucomponentMapper.getAllGroupmenucomponent();
		return groupmenucomponents;
	}

	@GetMapping("/{groupCode}")
	public Groupmenucomponent getGroupmenucomponent(@PathVariable(value = "groupCode") String groupCode) {
		Groupmenucomponent groupmenucomponent = groupmenucomponentMapper.getGroupmenucomponent(groupCode);
		log.debug(groupmenucomponent.toString());
		return groupmenucomponent;
	}

	@PutMapping("/update")
	public void  updateGroupmenucomponent(@RequestBody Groupmenucomponent groupmenucomponent) {
		groupmenucomponentMapper.updateGroupmenucomponent(String.valueOf(groupmenucomponent));
		log.debug(groupmenucomponent.toString());
	}

	@PostMapping("/save")
	public void saveGroupmenucomponent(@RequestBody Groupmenucomponent groupmenucomponent){
		groupmenucomponentMapper.saveGroupmenucomponent(groupmenucomponent);
		log.debug(groupmenucomponent.toString());
	}

	@DeleteMapping("/delete/{groupCode}")
	public void  deleteGroupmenucomponent(@PathVariable(value = "groupCode") String groupCode) {
		groupmenucomponentMapper.deleteGroupmenucomponent(groupCode);
	}


}
