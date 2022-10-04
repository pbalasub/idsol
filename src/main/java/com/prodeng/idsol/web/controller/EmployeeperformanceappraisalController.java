package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Employeeperformanceappraisal;
import com.prodeng.idsol.dao.mapper.EmployeeperformanceappraisalMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employeeperformanceappraisal")
@Slf4j
public class EmployeeperformanceappraisalController{

	@Autowired
	private EmployeeperformanceappraisalMapper employeeperformanceappraisalMapper;

	@GetMapping("/")
	public List<Employeeperformanceappraisal> getAllEmployeeperformanceappraisal() {
		List<Employeeperformanceappraisal> employeeperformanceappraisals = employeeperformanceappraisalMapper.getAllEmployeeperformanceappraisal();
		return employeeperformanceappraisals;
	}

	@GetMapping("/{ePANo}")
	public Employeeperformanceappraisal getEmployeeperformanceappraisal(@PathVariable(value = "ePANo") String ePANo) {
		Employeeperformanceappraisal employeeperformanceappraisal = employeeperformanceappraisalMapper.getEmployeeperformanceappraisal(ePANo);
		log.debug(employeeperformanceappraisal.toString());
		return employeeperformanceappraisal;
	}

	@PutMapping("/update")
	public void  updateEmployeeperformanceappraisal(@RequestBody Employeeperformanceappraisal employeeperformanceappraisal) {
		employeeperformanceappraisalMapper.updateEmployeeperformanceappraisal(String.valueOf(employeeperformanceappraisal));
		log.debug(employeeperformanceappraisal.toString());
	}

	@PostMapping("/save")
	public void saveEmployeeperformanceappraisal(@RequestBody Employeeperformanceappraisal employeeperformanceappraisal){
		employeeperformanceappraisalMapper.saveEmployeeperformanceappraisal(employeeperformanceappraisal);
		log.debug(employeeperformanceappraisal.toString());
	}

	@DeleteMapping("/delete/{ePANo}")
	public void  deleteEmployeeperformanceappraisal(@PathVariable(value = "ePANo") String ePANo) {
		employeeperformanceappraisalMapper.deleteEmployeeperformanceappraisal(ePANo);
	}


}
