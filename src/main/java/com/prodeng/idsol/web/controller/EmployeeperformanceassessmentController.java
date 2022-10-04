package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Employeeperformanceassessment;
import com.prodeng.idsol.dao.mapper.EmployeeperformanceassessmentMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employeeperformanceassessment")
@Slf4j
public class EmployeeperformanceassessmentController{

	@Autowired
	private EmployeeperformanceassessmentMapper employeeperformanceassessmentMapper;

	@GetMapping("/")
	public List<Employeeperformanceassessment> getAllEmployeeperformanceassessment() {
		List<Employeeperformanceassessment> employeeperformanceassessments = employeeperformanceassessmentMapper.getAllEmployeeperformanceassessment();
		return employeeperformanceassessments;
	}

	@GetMapping("/{ePANo}/{serialNo}")
	public Employeeperformanceassessment getEmployeeperformanceassessment(@PathVariable(value = "ePANo") String ePANo, @PathVariable(value = "serialNo") Integer serialNo) {
		Employeeperformanceassessment employeeperformanceassessment = employeeperformanceassessmentMapper.getEmployeeperformanceassessment(ePANo,serialNo);
		log.debug(employeeperformanceassessment.toString());
		return employeeperformanceassessment;
	}

	@PutMapping("/update")
	public void  updateEmployeeperformanceassessment(@RequestBody Employeeperformanceassessment employeeperformanceassessment) {
		employeeperformanceassessmentMapper.updateEmployeeperformanceassessment(employeeperformanceassessment);
		log.debug(employeeperformanceassessment.toString());
	}

	@PostMapping("/save")
	public void saveEmployeeperformanceassessment(@RequestBody Employeeperformanceassessment employeeperformanceassessment){
		employeeperformanceassessmentMapper.saveEmployeeperformanceassessment(employeeperformanceassessment);
		log.debug(employeeperformanceassessment.toString());
	}

	@DeleteMapping("/delete/{ePANo}/{serialNo}")
	public void  deleteEmployeeperformanceassessment(@PathVariable(value = "ePANo") String ePANo, @PathVariable(value = "serialNo") Integer serialNo) {
		employeeperformanceassessmentMapper.deleteEmployeeperformanceassessment(ePANo,serialNo);
	}


}
