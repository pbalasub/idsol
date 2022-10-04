package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Employeemanagementmaster;
import com.prodeng.idsol.dao.mapper.EmployeemanagementmasterMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employeemanagementmaster")
@Slf4j
public class EmployeemanagementmasterController{

	@Autowired
	private EmployeemanagementmasterMapper employeemanagementmasterMapper;

	@GetMapping("/")
	public List<Employeemanagementmaster> getAllEmployeemanagementmaster() {
		List<Employeemanagementmaster> employeemanagementmasters = employeemanagementmasterMapper.getAllEmployeemanagementmaster();
		return employeemanagementmasters;
	}

	@GetMapping("/{empCode}")
	public Employeemanagementmaster getEmployeemanagementmaster(@PathVariable(value = "empCode") String empCode) {
		Employeemanagementmaster employeemanagementmaster = employeemanagementmasterMapper.getEmployeemanagementmaster(empCode);
		log.debug(employeemanagementmaster.toString());
		return employeemanagementmaster;
	}

	@PutMapping("/update")
	public void  updateEmployeemanagementmaster(@RequestBody Employeemanagementmaster employeemanagementmaster) {
		employeemanagementmasterMapper.updateEmployeemanagementmaster(String.valueOf(employeemanagementmaster));
		log.debug(employeemanagementmaster.toString());
	}

	@PostMapping("/save")
	public void saveEmployeemanagementmaster(@RequestBody Employeemanagementmaster employeemanagementmaster){
		employeemanagementmasterMapper.saveEmployeemanagementmaster(employeemanagementmaster);
		log.debug(employeemanagementmaster.toString());
	}

	@DeleteMapping("/delete/{empCode}")
	public void  deleteEmployeemanagementmaster(@PathVariable(value = "empCode") String empCode) {
		employeemanagementmasterMapper.deleteEmployeemanagementmaster(empCode);
	}


}
