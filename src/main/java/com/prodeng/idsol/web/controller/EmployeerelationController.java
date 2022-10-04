package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Employeerelation;
import com.prodeng.idsol.dao.mapper.EmployeerelationMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employeerelation")
@Slf4j
public class EmployeerelationController{

	@Autowired
	private EmployeerelationMapper employeerelationMapper;

	@GetMapping("/")
	public List<Employeerelation> getAllEmployeerelation() {
		List<Employeerelation> employeerelations = employeerelationMapper.getAllEmployeerelation();
		return employeerelations;
	}

	@GetMapping("/{empCode}/{serialNo}")
	public Employeerelation getEmployeerelation(@PathVariable(value = "empCode") String empCode, @PathVariable(value = "serialNo") Integer serialNo) {
		Employeerelation employeerelation = employeerelationMapper.getEmployeerelation(empCode,serialNo);
		log.debug(employeerelation.toString());
		return employeerelation;
	}

	@PutMapping("/update")
	public void  updateEmployeerelation(@RequestBody Employeerelation employeerelation) {
		employeerelationMapper.updateEmployeerelation(employeerelation);
		log.debug(employeerelation.toString());
	}

	@PostMapping("/save")
	public void saveEmployeerelation(@RequestBody Employeerelation employeerelation){
		employeerelationMapper.saveEmployeerelation(employeerelation);
		log.debug(employeerelation.toString());
	}

	@DeleteMapping("/delete/{empCode}/{serialNo}")
	public void  deleteEmployeerelation(@PathVariable(value = "empCode") String empCode, @PathVariable(value = "serialNo") Integer serialNo) {
		employeerelationMapper.deleteEmployeerelation(empCode,serialNo);
	}


}
