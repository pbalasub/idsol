package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Logingroup;
import com.prodeng.idsol.dao.mapper.LogingroupMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/logingroup")
@Slf4j
public class LogingroupController{

	@Autowired
	private LogingroupMapper logingroupMapper;

	@GetMapping("/")
	public List<Logingroup> getAllLogingroup() {
		List<Logingroup> logingroups = logingroupMapper.getAllLogingroup();
		return logingroups;
	}

	@GetMapping("/{groupCode}")
	public Logingroup getLogingroup(@PathVariable(value = "groupCode") String groupCode) {
		Logingroup logingroup = logingroupMapper.getLogingroup(groupCode);
		log.debug(logingroup.toString());
		return logingroup;
	}

	@PutMapping("/update")
	public void  updateLogingroup(@RequestBody Logingroup logingroup) {
		logingroupMapper.updateLogingroup(String.valueOf(logingroup));
		log.debug(logingroup.toString());
	}

	@PostMapping("/save")
	public void saveLogingroup(@RequestBody Logingroup logingroup){
		logingroupMapper.saveLogingroup(logingroup);
		log.debug(logingroup.toString());
	}

	@DeleteMapping("/delete/{groupCode}")
	public void  deleteLogingroup(@PathVariable(value = "groupCode") String groupCode) {
		logingroupMapper.deleteLogingroup(groupCode);
	}


}
