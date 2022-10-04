package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Employeetrainingplandetails;
import com.prodeng.idsol.dao.mapper.EmployeetrainingplandetailsMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employeetrainingplandetails")
@Slf4j
public class EmployeetrainingplandetailsController{

	@Autowired
	private EmployeetrainingplandetailsMapper employeetrainingplandetailsMapper;

	@GetMapping("/")
	public List<Employeetrainingplandetails> getAllEmployeetrainingplandetails() {
		List<Employeetrainingplandetails> employeetrainingplandetailss = employeetrainingplandetailsMapper.getAllEmployeetrainingplandetails();
		return employeetrainingplandetailss;
	}

	@GetMapping("/{eTPId}/{serialNo}")
	public Employeetrainingplandetails getEmployeetrainingplandetails(@PathVariable(value = "eTPId") Integer eTPId, @PathVariable(value = "serialNo") Integer serialNo) {
		Employeetrainingplandetails employeetrainingplandetails = employeetrainingplandetailsMapper.getEmployeetrainingplandetails(eTPId,serialNo);
		log.debug(employeetrainingplandetails.toString());
		return employeetrainingplandetails;
	}

	@PutMapping("/update")
	public void  updateEmployeetrainingplandetails(@RequestBody Employeetrainingplandetails employeetrainingplandetails) {
		employeetrainingplandetailsMapper.updateEmployeetrainingplandetails(employeetrainingplandetails);
		log.debug(employeetrainingplandetails.toString());
	}

	@PostMapping("/save")
	public void saveEmployeetrainingplandetails(@RequestBody Employeetrainingplandetails employeetrainingplandetails){
		employeetrainingplandetailsMapper.saveEmployeetrainingplandetails(employeetrainingplandetails);
		log.debug(employeetrainingplandetails.toString());
	}

	@DeleteMapping("/delete/{eTPId}/{serialNo}")
	public void  deleteEmployeetrainingplandetails(@PathVariable(value = "eTPId") Integer eTPId, @PathVariable(value = "serialNo") Integer serialNo) {
		employeetrainingplandetailsMapper.deleteEmployeetrainingplandetails(eTPId,serialNo);
	}


}
