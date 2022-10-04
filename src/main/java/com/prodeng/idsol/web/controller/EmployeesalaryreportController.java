package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Employeesalaryreport;
import com.prodeng.idsol.dao.mapper.EmployeesalaryreportMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employeesalaryreport")
@Slf4j
public class EmployeesalaryreportController{

	@Autowired
	private EmployeesalaryreportMapper employeesalaryreportMapper;

	@GetMapping("/")
	public List<Employeesalaryreport> getAllEmployeesalaryreport() {
		List<Employeesalaryreport> employeesalaryreports = employeesalaryreportMapper.getAllEmployeesalaryreport();
		return employeesalaryreports;
	}

	@GetMapping("/{esrNo}")
	public Employeesalaryreport getEmployeesalaryreport(@PathVariable(value = "esrNo") String esrNo) {
		Employeesalaryreport employeesalaryreport = employeesalaryreportMapper.getEmployeesalaryreport(esrNo);
		log.debug(employeesalaryreport.toString());
		return employeesalaryreport;
	}

	@PutMapping("/update")
	public void  updateEmployeesalaryreport(@RequestBody Employeesalaryreport employeesalaryreport) {
		employeesalaryreportMapper.updateEmployeesalaryreport(String.valueOf(employeesalaryreport));
		log.debug(employeesalaryreport.toString());
	}

	@PostMapping("/save")
	public void saveEmployeesalaryreport(@RequestBody Employeesalaryreport employeesalaryreport){
		employeesalaryreportMapper.saveEmployeesalaryreport(employeesalaryreport);
		log.debug(employeesalaryreport.toString());
	}

	@DeleteMapping("/delete/{esrNo}")
	public void  deleteEmployeesalaryreport(@PathVariable(value = "esrNo") String esrNo) {
		employeesalaryreportMapper.deleteEmployeesalaryreport(esrNo);
	}


}
