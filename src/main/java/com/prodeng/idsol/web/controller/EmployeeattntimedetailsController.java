package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Employeeattntimedetails;
import com.prodeng.idsol.dao.mapper.EmployeeattntimedetailsMapper;

import java.util.Date;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employeeattntimedetails")
@Slf4j
public class EmployeeattntimedetailsController{

	@Autowired
	private EmployeeattntimedetailsMapper employeeattntimedetailsMapper;

	@GetMapping("/")
	public List<Employeeattntimedetails> getAllEmployeeattntimedetails() {
		List<Employeeattntimedetails> employeeattntimedetailss = employeeattntimedetailsMapper.getAllEmployeeattntimedetails();
		return employeeattntimedetailss;
	}

	@GetMapping("/{empCode}/{attnDate}/{attnTime}")
	public Employeeattntimedetails getEmployeeattntimedetails(@PathVariable(value = "empCode") String empCode, @PathVariable(value = "attnDate") Date attnDate, @PathVariable(value = "attnTime") String attnTime) {
		Employeeattntimedetails employeeattntimedetails = employeeattntimedetailsMapper.getEmployeeattntimedetails(empCode,attnDate,attnTime);
		log.debug(employeeattntimedetails.toString());
		return employeeattntimedetails;
	}

	@PutMapping("/update")
	public void  updateEmployeeattntimedetails(@RequestBody Employeeattntimedetails employeeattntimedetails) {
		employeeattntimedetailsMapper.updateEmployeeattntimedetails(employeeattntimedetails);
		log.debug(employeeattntimedetails.toString());
	}

	@PostMapping("/save")
	public void saveEmployeeattntimedetails(@RequestBody Employeeattntimedetails employeeattntimedetails){
		employeeattntimedetailsMapper.saveEmployeeattntimedetails(employeeattntimedetails);
		log.debug(employeeattntimedetails.toString());
	}

	@DeleteMapping("/delete/{empCode}/{attnDate}/{attnTime}")
	public void  deleteEmployeeattntimedetails(@PathVariable(value = "empCode") String empCode, @PathVariable(value = "attnDate") Date attnDate, @PathVariable(value = "attnTime") String attnTime) {
		employeeattntimedetailsMapper.deleteEmployeeattntimedetails(empCode,attnDate,attnTime);
	}


}
