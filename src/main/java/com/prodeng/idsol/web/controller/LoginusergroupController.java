package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Loginusergroup;
import com.prodeng.idsol.dao.mapper.LoginusergroupMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/loginusergroup")
@Slf4j
public class LoginusergroupController{

	@Autowired
	private LoginusergroupMapper loginusergroupMapper;

	@GetMapping("/")
	public List<Loginusergroup> getAllLoginusergroup() {
		List<Loginusergroup> loginusergroups = loginusergroupMapper.getAllLoginusergroup();
		return loginusergroups;
	}

	@GetMapping("/{userId}")
	public Loginusergroup getLoginusergroup(@PathVariable(value = "userId") String userId) {
		Loginusergroup loginusergroup = loginusergroupMapper.getLoginusergroup(userId);
		log.debug(loginusergroup.toString());
		return loginusergroup;
	}

	@PutMapping("/update")
	public void  updateLoginusergroup(@RequestBody Loginusergroup loginusergroup) {
		loginusergroupMapper.updateLoginusergroup(String.valueOf(loginusergroup));
		log.debug(loginusergroup.toString());
	}

	@PostMapping("/save")
	public void saveLoginusergroup(@RequestBody Loginusergroup loginusergroup){
		loginusergroupMapper.saveLoginusergroup(loginusergroup);
		log.debug(loginusergroup.toString());
	}

	@DeleteMapping("/delete/{userId}")
	public void  deleteLoginusergroup(@PathVariable(value = "userId") String userId) {
		loginusergroupMapper.deleteLoginusergroup(userId);
	}


}
