package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Employeesalarymaster;
import com.prodeng.idsol.dao.mapper.EmployeesalarymasterMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employeesalarymaster")
@Slf4j
public class EmployeesalarymasterController{

	@Autowired
	private EmployeesalarymasterMapper employeesalarymasterMapper;

	@GetMapping("/")
	public List<Employeesalarymaster> getAllEmployeesalarymaster() {
		List<Employeesalarymaster> employeesalarymasters = employeesalarymasterMapper.getAllEmployeesalarymaster();
		return employeesalarymasters;
	}

	@GetMapping("/{esmNo}")
	public Employeesalarymaster getEmployeesalarymaster(@PathVariable(value = "esmNo") String esmNo) {
		Employeesalarymaster employeesalarymaster = employeesalarymasterMapper.getEmployeesalarymaster(esmNo);
		log.debug(employeesalarymaster.toString());
		return employeesalarymaster;
	}

	@PutMapping("/update")
	public void  updateEmployeesalarymaster(@RequestBody Employeesalarymaster employeesalarymaster) {
		employeesalarymasterMapper.updateEmployeesalarymaster(String.valueOf(employeesalarymaster));
		log.debug(employeesalarymaster.toString());
	}

	@PostMapping("/save")
	public void saveEmployeesalarymaster(@RequestBody Employeesalarymaster employeesalarymaster){
		employeesalarymasterMapper.saveEmployeesalarymaster(employeesalarymaster);
		log.debug(employeesalarymaster.toString());
	}

	@DeleteMapping("/delete/{esmNo}")
	public void  deleteEmployeesalarymaster(@PathVariable(value = "esmNo") String esmNo) {
		employeesalarymasterMapper.deleteEmployeesalarymaster(esmNo);
	}


}
