package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Employeetrainingeffectiveness;
import com.prodeng.idsol.dao.mapper.EmployeetrainingeffectivenessMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employeetrainingeffectiveness")
@Slf4j
public class EmployeetrainingeffectivenessController{

	@Autowired
	private EmployeetrainingeffectivenessMapper employeetrainingeffectivenessMapper;

	@GetMapping("/")
	public List<Employeetrainingeffectiveness> getAllEmployeetrainingeffectiveness() {
		List<Employeetrainingeffectiveness> employeetrainingeffectivenesss = employeetrainingeffectivenessMapper.getAllEmployeetrainingeffectiveness();
		return employeetrainingeffectivenesss;
	}

	@GetMapping("/{eTRId}/{serialNo}")
	public Employeetrainingeffectiveness getEmployeetrainingeffectiveness(@PathVariable(value = "eTRId") Integer eTRId, @PathVariable(value = "serialNo") Integer serialNo) {
		Employeetrainingeffectiveness employeetrainingeffectiveness = employeetrainingeffectivenessMapper.getEmployeetrainingeffectiveness(eTRId,serialNo);
		log.debug(employeetrainingeffectiveness.toString());
		return employeetrainingeffectiveness;
	}

	@PutMapping("/update")
	public void  updateEmployeetrainingeffectiveness(@RequestBody Employeetrainingeffectiveness employeetrainingeffectiveness) {
		employeetrainingeffectivenessMapper.updateEmployeetrainingeffectiveness(employeetrainingeffectiveness);
		log.debug(employeetrainingeffectiveness.toString());
	}

	@PostMapping("/save")
	public void saveEmployeetrainingeffectiveness(@RequestBody Employeetrainingeffectiveness employeetrainingeffectiveness){
		employeetrainingeffectivenessMapper.saveEmployeetrainingeffectiveness(employeetrainingeffectiveness);
		log.debug(employeetrainingeffectiveness.toString());
	}

	@DeleteMapping("/delete/{eTRId}/{serialNo}")
	public void  deleteEmployeetrainingeffectiveness(@PathVariable(value = "eTRId") Integer eTRId, @PathVariable(value = "serialNo") Integer serialNo) {
		employeetrainingeffectivenessMapper.deleteEmployeetrainingeffectiveness(eTRId,serialNo);
	}


}
