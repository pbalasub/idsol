package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Repairworkrequest;
import com.prodeng.idsol.dao.mapper.RepairworkrequestMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/repairworkrequest")
@Slf4j
public class RepairworkrequestController{

	@Autowired
	private RepairworkrequestMapper repairworkrequestMapper;

	@GetMapping("/")
	public List<Repairworkrequest> getAllRepairworkrequest() {
		List<Repairworkrequest> repairworkrequests = repairworkrequestMapper.getAllRepairworkrequest();
		return repairworkrequests;
	}

	@GetMapping("/{rWRId}")
	public Repairworkrequest getRepairworkrequest(@PathVariable(value = "rWRId") Integer rWRId) {
		Repairworkrequest repairworkrequest = repairworkrequestMapper.getRepairworkrequest(rWRId);
		log.debug(repairworkrequest.toString());
		return repairworkrequest;
	}

	@PutMapping("/update")
	public void  updateRepairworkrequest(@RequestBody Repairworkrequest repairworkrequest) {
		repairworkrequestMapper.updateRepairworkrequest(repairworkrequest.getRWRId());
		log.debug(repairworkrequest.toString());
	}

	@PostMapping("/save")
	public void saveRepairworkrequest(@RequestBody Repairworkrequest repairworkrequest){
		repairworkrequestMapper.saveRepairworkrequest(repairworkrequest);
		log.debug(repairworkrequest.toString());
	}

	@DeleteMapping("/delete/{rWRId}")
	public void  deleteRepairworkrequest(@PathVariable(value = "rWRId") Integer rWRId) {
		repairworkrequestMapper.deleteRepairworkrequest(rWRId);
	}


}
