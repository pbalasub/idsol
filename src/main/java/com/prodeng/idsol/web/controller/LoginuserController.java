package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Loginuser;
import com.prodeng.idsol.dao.mapper.LoginuserMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/loginuser")
@Slf4j
public class LoginuserController{

	@Autowired
	private LoginuserMapper loginuserMapper;

	@GetMapping("/")
	public List<Loginuser> getAllLoginuser() {
		List<Loginuser> loginusers = loginuserMapper.getAllLoginuser();
		return loginusers;
	}

	@GetMapping("/{userId}")
	public Loginuser getLoginuser(@PathVariable(value = "userId") String userId) {
		Loginuser loginuser = loginuserMapper.getLoginuser(userId);
		log.debug(loginuser.toString());
		return loginuser;
	}

	@PutMapping("/update")
	public void  updateLoginuser(@RequestBody Loginuser loginuser) {
		loginuserMapper.updateLoginuser(String.valueOf(loginuser));
		log.debug(loginuser.toString());
	}

	@PostMapping("/save")
	public void saveLoginuser(@RequestBody Loginuser loginuser){
		loginuserMapper.saveLoginuser(loginuser);
		log.debug(loginuser.toString());
	}

	@DeleteMapping("/delete/{userId}")
	public void  deleteLoginuser(@PathVariable(value = "userId") String userId) {
		loginuserMapper.deleteLoginuser(userId);
	}


}
