package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Employeeaddress;
import com.prodeng.idsol.dao.mapper.EmployeeaddressMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employeeaddress")
@Slf4j
public class EmployeeaddressController{

	@Autowired
	private EmployeeaddressMapper employeeaddressMapper;

	@GetMapping("/")
	public List<Employeeaddress> getAllEmployeeaddress() {
		List<Employeeaddress> employeeaddresss = employeeaddressMapper.getAllEmployeeaddress();
		return employeeaddresss;
	}

	@GetMapping("/{empCode}/{serialNo}")
	public Employeeaddress getEmployeeaddress(@PathVariable(value = "empCode") String empCode, @PathVariable(value = "serialNo") Integer serialNo) {
		Employeeaddress employeeaddress = employeeaddressMapper.getEmployeeaddress(empCode,serialNo);
		log.debug(employeeaddress.toString());
		return employeeaddress;
	}

	@PutMapping("/update")
	public void  updateEmployeeaddress(@RequestBody Employeeaddress employeeaddress) {
		employeeaddressMapper.updateEmployeeaddress(employeeaddress);
		log.debug(employeeaddress.toString());
	}

	@PostMapping("/save")
	public void saveEmployeeaddress(@RequestBody Employeeaddress employeeaddress){
		employeeaddressMapper.saveEmployeeaddress(employeeaddress);
		log.debug(employeeaddress.toString());
	}

	@DeleteMapping("/delete/{empCode}/{serialNo}")
	public void  deleteEmployeeaddress(@PathVariable(value = "empCode") String empCode, @PathVariable(value = "serialNo") Integer serialNo) {
		employeeaddressMapper.deleteEmployeeaddress(empCode,serialNo);
	}


}
