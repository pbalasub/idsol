package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Repairworkorder;
import com.prodeng.idsol.dao.mapper.RepairworkorderMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/repairworkorder")
@Slf4j
public class RepairworkorderController{

	@Autowired
	private RepairworkorderMapper repairworkorderMapper;

	@GetMapping("/")
	public List<Repairworkorder> getAllRepairworkorder() {
		List<Repairworkorder> repairworkorders = repairworkorderMapper.getAllRepairworkorder();
		return repairworkorders;
	}

	@GetMapping("/{rWOId}")
	public Repairworkorder getRepairworkorder(@PathVariable(value = "rWOId") Integer rWOId) {
		Repairworkorder repairworkorder = repairworkorderMapper.getRepairworkorder(rWOId);
		log.debug(repairworkorder.toString());
		return repairworkorder;
	}

	@PutMapping("/update")
	public void  updateRepairworkorder(@RequestBody Repairworkorder repairworkorder) {
		repairworkorderMapper.updateRepairworkorder(repairworkorder.getRWOId());
		log.debug(repairworkorder.toString());
	}

	@PostMapping("/save")
	public void saveRepairworkorder(@RequestBody Repairworkorder repairworkorder){
		repairworkorderMapper.saveRepairworkorder(repairworkorder);
		log.debug(repairworkorder.toString());
	}

	@DeleteMapping("/delete/{rWOId}")
	public void  deleteRepairworkorder(@PathVariable(value = "rWOId") Integer rWOId) {
		repairworkorderMapper.deleteRepairworkorder(rWOId);
	}


}
