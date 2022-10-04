package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Employeeaccidentreport;
import com.prodeng.idsol.dao.mapper.EmployeeaccidentreportMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employeeaccidentreport")
@Slf4j
public class EmployeeaccidentreportController{

	@Autowired
	private EmployeeaccidentreportMapper employeeaccidentreportMapper;

	@GetMapping("/")
	public List<Employeeaccidentreport> getAllEmployeeaccidentreport() {
		List<Employeeaccidentreport> employeeaccidentreports = employeeaccidentreportMapper.getAllEmployeeaccidentreport();
		return employeeaccidentreports;
	}

	@GetMapping("/{eARNo}")
	public Employeeaccidentreport getEmployeeaccidentreport(@PathVariable(value = "eARNo") String eARNo) {
		Employeeaccidentreport employeeaccidentreport = employeeaccidentreportMapper.getEmployeeaccidentreport(eARNo);
		log.debug(employeeaccidentreport.toString());
		return employeeaccidentreport;
	}

	@PutMapping("/update")
	public void  updateEmployeeaccidentreport(@RequestBody Employeeaccidentreport employeeaccidentreport) {
		employeeaccidentreportMapper.updateEmployeeaccidentreport(String.valueOf(employeeaccidentreport));
		log.debug(employeeaccidentreport.toString());
	}

	@PostMapping("/save")
	public void saveEmployeeaccidentreport(@RequestBody Employeeaccidentreport employeeaccidentreport){
		employeeaccidentreportMapper.saveEmployeeaccidentreport(employeeaccidentreport);
		log.debug(employeeaccidentreport.toString());
	}

	@DeleteMapping("/delete/{eARNo}")
	public void  deleteEmployeeaccidentreport(@PathVariable(value = "eARNo") String eARNo) {
		employeeaccidentreportMapper.deleteEmployeeaccidentreport(eARNo);
	}


}
