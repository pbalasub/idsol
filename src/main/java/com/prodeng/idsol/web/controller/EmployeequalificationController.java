package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Employeequalification;
import com.prodeng.idsol.dao.mapper.EmployeequalificationMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employeequalification")
@Slf4j
public class EmployeequalificationController{

	@Autowired
	private EmployeequalificationMapper employeequalificationMapper;

	@GetMapping("/")
	public List<Employeequalification> getAllEmployeequalification() {
		List<Employeequalification> employeequalifications = employeequalificationMapper.getAllEmployeequalification();
		return employeequalifications;
	}

	@GetMapping("/{empCode}/{serialNo}")
	public Employeequalification getEmployeequalification(@PathVariable(value = "empCode") String empCode, @PathVariable(value = "serialNo") Integer serialNo) {
		Employeequalification employeequalification = employeequalificationMapper.getEmployeequalification(empCode,serialNo);
		log.debug(employeequalification.toString());
		return employeequalification;
	}

	@PutMapping("/update")
	public void  updateEmployeequalification(@RequestBody Employeequalification employeequalification) {
		employeequalificationMapper.updateEmployeequalification(employeequalification);
		log.debug(employeequalification.toString());
	}

	@PostMapping("/save")
	public void saveEmployeequalification(@RequestBody Employeequalification employeequalification){
		employeequalificationMapper.saveEmployeequalification(employeequalification);
		log.debug(employeequalification.toString());
	}

	@DeleteMapping("/delete/{empCode}/{serialNo}")
	public void  deleteEmployeequalification(@PathVariable(value = "empCode") String empCode, @PathVariable(value = "serialNo") Integer serialNo) {
		employeequalificationMapper.deleteEmployeequalification(empCode,serialNo);
	}


}
