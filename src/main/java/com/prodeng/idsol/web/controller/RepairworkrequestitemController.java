package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Repairworkrequestitem;
import com.prodeng.idsol.dao.mapper.RepairworkrequestitemMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/repairworkrequestitem")
@Slf4j
public class RepairworkrequestitemController{

	@Autowired
	private RepairworkrequestitemMapper repairworkrequestitemMapper;

	@GetMapping("/")
	public List<Repairworkrequestitem> getAllRepairworkrequestitem() {
		List<Repairworkrequestitem> repairworkrequestitems = repairworkrequestitemMapper.getAllRepairworkrequestitem();
		return repairworkrequestitems;
	}

	@GetMapping("/{rWRId}/{serialNo}")
	public Repairworkrequestitem getRepairworkrequestitem(@PathVariable(value = "rWRId") Integer rWRId, @PathVariable(value = "serialNo") Integer serialNo) {
		Repairworkrequestitem repairworkrequestitem = repairworkrequestitemMapper.getRepairworkrequestitem(rWRId,serialNo);
		log.debug(repairworkrequestitem.toString());
		return repairworkrequestitem;
	}

	@PutMapping("/update")
	public void  updateRepairworkrequestitem(@RequestBody Repairworkrequestitem repairworkrequestitem) {
		repairworkrequestitemMapper.updateRepairworkrequestitem(repairworkrequestitem);
		log.debug(repairworkrequestitem.toString());
	}

	@PostMapping("/save")
	public void saveRepairworkrequestitem(@RequestBody Repairworkrequestitem repairworkrequestitem){
		repairworkrequestitemMapper.saveRepairworkrequestitem(repairworkrequestitem);
		log.debug(repairworkrequestitem.toString());
	}

	@DeleteMapping("/delete/{rWRId}/{serialNo}")
	public void  deleteRepairworkrequestitem(@PathVariable(value = "rWRId") Integer rWRId, @PathVariable(value = "serialNo") Integer serialNo) {
		repairworkrequestitemMapper.deleteRepairworkrequestitem(rWRId,serialNo);
	}


}
