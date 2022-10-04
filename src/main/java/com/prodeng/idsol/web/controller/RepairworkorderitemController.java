package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Repairworkorderitem;
import com.prodeng.idsol.dao.mapper.RepairworkorderitemMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/repairworkorderitem")
@Slf4j
public class RepairworkorderitemController{

	@Autowired
	private RepairworkorderitemMapper repairworkorderitemMapper;

	@GetMapping("/")
	public List<Repairworkorderitem> getAllRepairworkorderitem() {
		List<Repairworkorderitem> repairworkorderitems = repairworkorderitemMapper.getAllRepairworkorderitem();
		return repairworkorderitems;
	}

	@GetMapping("/{rWOId}/{serialNo}")
	public Repairworkorderitem getRepairworkorderitem(@PathVariable(value = "rWOId") Integer rWOId, @PathVariable(value = "serialNo") Integer serialNo) {
		Repairworkorderitem repairworkorderitem = repairworkorderitemMapper.getRepairworkorderitem(rWOId,serialNo);
		log.debug(repairworkorderitem.toString());
		return repairworkorderitem;
	}

	@PutMapping("/update")
	public void  updateRepairworkorderitem(@RequestBody Repairworkorderitem repairworkorderitem) {
		repairworkorderitemMapper.updateRepairworkorderitem(repairworkorderitem);
		log.debug(repairworkorderitem.toString());
	}

	@PostMapping("/save")
	public void saveRepairworkorderitem(@RequestBody Repairworkorderitem repairworkorderitem){
		repairworkorderitemMapper.saveRepairworkorderitem(repairworkorderitem);
		log.debug(repairworkorderitem.toString());
	}

	@DeleteMapping("/delete/{rWOId}/{serialNo}")
	public void  deleteRepairworkorderitem(@PathVariable(value = "rWOId") Integer rWOId, @PathVariable(value = "serialNo") Integer serialNo) {
		repairworkorderitemMapper.deleteRepairworkorderitem(rWOId,serialNo);
	}


}
