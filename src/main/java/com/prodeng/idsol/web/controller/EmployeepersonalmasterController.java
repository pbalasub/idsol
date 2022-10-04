package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Employeepersonalmaster;
import com.prodeng.idsol.dao.mapper.EmployeepersonalmasterMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employeepersonalmaster")
@Slf4j
public class EmployeepersonalmasterController{

	@Autowired
	private EmployeepersonalmasterMapper employeepersonalmasterMapper;

	@GetMapping("/")
	public List<Employeepersonalmaster> getAllEmployeepersonalmaster() {
		List<Employeepersonalmaster> employeepersonalmasters = employeepersonalmasterMapper.getAllEmployeepersonalmaster();
		return employeepersonalmasters;
	}

	@GetMapping("/{empCode}")
	public Employeepersonalmaster getEmployeepersonalmaster(@PathVariable(value = "empCode") String empCode) {
		Employeepersonalmaster employeepersonalmaster = employeepersonalmasterMapper.getEmployeepersonalmaster(empCode);
		log.debug(employeepersonalmaster.toString());
		return employeepersonalmaster;
	}

	@PutMapping("/update")
	public void  updateEmployeepersonalmaster(@RequestBody Employeepersonalmaster employeepersonalmaster) {
		employeepersonalmasterMapper.updateEmployeepersonalmaster(String.valueOf(employeepersonalmaster));
		log.debug(employeepersonalmaster.toString());
	}

	@PostMapping("/save")
	public void saveEmployeepersonalmaster(@RequestBody Employeepersonalmaster employeepersonalmaster){
		employeepersonalmasterMapper.saveEmployeepersonalmaster(employeepersonalmaster);
		log.debug(employeepersonalmaster.toString());
	}

	@DeleteMapping("/delete/{empCode}")
	public void  deleteEmployeepersonalmaster(@PathVariable(value = "empCode") String empCode) {
		employeepersonalmasterMapper.deleteEmployeepersonalmaster(empCode);
	}


}
