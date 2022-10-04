package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Employeeattnmaster;
import com.prodeng.idsol.dao.mapper.EmployeeattnmasterMapper;

import java.util.Date;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employeeattnmaster")
@Slf4j
public class EmployeeattnmasterController{

	@Autowired
	private EmployeeattnmasterMapper employeeattnmasterMapper;

	@GetMapping("/")
	public List<Employeeattnmaster> getAllEmployeeattnmaster() {
		List<Employeeattnmaster> employeeattnmasters = employeeattnmasterMapper.getAllEmployeeattnmaster();
		return employeeattnmasters;
	}

	@GetMapping("/{empCode}/{attnDate}")
	public Employeeattnmaster getEmployeeattnmaster(@PathVariable(value = "empCode") String empCode, @PathVariable(value = "attnDate") Date attnDate) {
		Employeeattnmaster employeeattnmaster = employeeattnmasterMapper.getEmployeeattnmaster(empCode,attnDate);
		log.debug(employeeattnmaster.toString());
		return employeeattnmaster;
	}

	@PutMapping("/update")
	public void  updateEmployeeattnmaster(@RequestBody Employeeattnmaster employeeattnmaster) {
		employeeattnmasterMapper.updateEmployeeattnmaster(employeeattnmaster);
		log.debug(employeeattnmaster.toString());
	}

	@PostMapping("/save")
	public void saveEmployeeattnmaster(@RequestBody Employeeattnmaster employeeattnmaster){
		employeeattnmasterMapper.saveEmployeeattnmaster(employeeattnmaster);
		log.debug(employeeattnmaster.toString());
	}

	@DeleteMapping("/delete/{empCode}/{attnDate}")
	public void  deleteEmployeeattnmaster(@PathVariable(value = "empCode") String empCode, @PathVariable(value = "attnDate") Date attnDate) {
		employeeattnmasterMapper.deleteEmployeeattnmaster(empCode,attnDate);
	}


}
