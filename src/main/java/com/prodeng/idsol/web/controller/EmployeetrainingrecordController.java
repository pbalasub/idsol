package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Employeetrainingrecord;
import com.prodeng.idsol.dao.mapper.EmployeetrainingrecordMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employeetrainingrecord")
@Slf4j
public class EmployeetrainingrecordController{

	@Autowired
	private EmployeetrainingrecordMapper employeetrainingrecordMapper;

	@GetMapping("/")
	public List<Employeetrainingrecord> getAllEmployeetrainingrecord() {
		List<Employeetrainingrecord> employeetrainingrecords = employeetrainingrecordMapper.getAllEmployeetrainingrecord();
		return employeetrainingrecords;
	}

	@GetMapping("/{eTRId}")
	public Employeetrainingrecord getEmployeetrainingrecord(@PathVariable(value = "eTRId") Integer eTRId) {
		Employeetrainingrecord employeetrainingrecord = employeetrainingrecordMapper.getEmployeetrainingrecord(eTRId);
		log.debug(employeetrainingrecord.toString());
		return employeetrainingrecord;
	}

	@PutMapping("/update")
	public void  updateEmployeetrainingrecord(@RequestBody Employeetrainingrecord employeetrainingrecord) {
		employeetrainingrecordMapper.updateEmployeetrainingrecord(employeetrainingrecord.getETRId());
		log.debug(employeetrainingrecord.toString());
	}

	@PostMapping("/save")
	public void saveEmployeetrainingrecord(@RequestBody Employeetrainingrecord employeetrainingrecord){
		employeetrainingrecordMapper.saveEmployeetrainingrecord(employeetrainingrecord);
		log.debug(employeetrainingrecord.toString());
	}

	@DeleteMapping("/delete/{eTRId}")
	public void  deleteEmployeetrainingrecord(@PathVariable(value = "eTRId") Integer eTRId) {
		employeetrainingrecordMapper.deleteEmployeetrainingrecord(eTRId);
	}


}
