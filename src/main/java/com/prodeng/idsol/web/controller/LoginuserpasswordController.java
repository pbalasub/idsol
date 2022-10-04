package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Loginuserpassword;
import com.prodeng.idsol.dao.mapper.LoginuserpasswordMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/loginuserpassword")
@Slf4j
public class LoginuserpasswordController{

	@Autowired
	private LoginuserpasswordMapper loginuserpasswordMapper;

	@GetMapping("/")
	public List<Loginuserpassword> getAllLoginuserpassword() {
		List<Loginuserpassword> loginuserpasswords = loginuserpasswordMapper.getAllLoginuserpassword();
		return loginuserpasswords;
	}

	@GetMapping("/{userId}")
	public Loginuserpassword getLoginuserpassword(@PathVariable(value = "userId") String userId) {
		Loginuserpassword loginuserpassword = loginuserpasswordMapper.getLoginuserpassword(userId);
		log.debug(loginuserpassword.toString());
		return loginuserpassword;
	}

	@PutMapping("/update")
	public void  updateLoginuserpassword(@RequestBody Loginuserpassword loginuserpassword) {
		loginuserpasswordMapper.updateLoginuserpassword(String.valueOf(loginuserpassword));
		log.debug(loginuserpassword.toString());
	}

	@PostMapping("/save")
	public void saveLoginuserpassword(@RequestBody Loginuserpassword loginuserpassword){
		loginuserpasswordMapper.saveLoginuserpassword(loginuserpassword);
		log.debug(loginuserpassword.toString());
	}

	@DeleteMapping("/delete/{userId}")
	public void  deleteLoginuserpassword(@PathVariable(value = "userId") String userId) {
		loginuserpasswordMapper.deleteLoginuserpassword(userId);
	}


}
