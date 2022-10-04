package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Employeetrainingplan;
import com.prodeng.idsol.dao.mapper.EmployeetrainingplanMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employeetrainingplan")
@Slf4j
public class EmployeetrainingplanController{

	@Autowired
	private EmployeetrainingplanMapper employeetrainingplanMapper;

	@GetMapping("/")
	public List<Employeetrainingplan> getAllEmployeetrainingplan() {
		List<Employeetrainingplan> employeetrainingplans = employeetrainingplanMapper.getAllEmployeetrainingplan();
		return employeetrainingplans;
	}

	@GetMapping("/{eTPId}")
	public Employeetrainingplan getEmployeetrainingplan(@PathVariable(value = "eTPId") Integer eTPId) {
		Employeetrainingplan employeetrainingplan = employeetrainingplanMapper.getEmployeetrainingplan(eTPId);
		log.debug(employeetrainingplan.toString());
		return employeetrainingplan;
	}

	@PutMapping("/update")
	public void  updateEmployeetrainingplan(@RequestBody Employeetrainingplan employeetrainingplan) {
		employeetrainingplanMapper.updateEmployeetrainingplan(employeetrainingplan.getETPId());
		log.debug(employeetrainingplan.toString());
	}

	@PostMapping("/save")
	public void saveEmployeetrainingplan(@RequestBody Employeetrainingplan employeetrainingplan){
		employeetrainingplanMapper.saveEmployeetrainingplan(employeetrainingplan);
		log.debug(employeetrainingplan.toString());
	}

	@DeleteMapping("/delete/{eTPId}")
	public void  deleteEmployeetrainingplan(@PathVariable(value = "eTPId") Integer eTPId) {
		employeetrainingplanMapper.deleteEmployeetrainingplan(eTPId);
	}


}
