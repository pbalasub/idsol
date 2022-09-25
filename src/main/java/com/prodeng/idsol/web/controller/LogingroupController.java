package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Logingroup;
import com.prodeng.idsol.dao.mapper.LogingroupMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/logingroup")
@Slf4j
public class LogingroupController{

	@Autowired
	private LogingroupMapper logingroupMapper;

	@GetMapping("/")
	public List<Logingroup> getAlllogingroup() {
		List<Logingroup> logingroups = logingroupMapper.getAllLogingroup();
		return logingroups;
	}

	@PostMapping("/save")
	public void saveLogingroup(@RequestBody Logingroup logingroup){
		logingroupMapper.saveLogingroup(logingroup);
		log.debug(logingroup.toString());
	}

}
