package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Workorderitem;
import com.prodeng.idsol.dao.mapper.WorkorderitemMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/workorderitem")
@Slf4j
public class WorkorderitemController{

	@Autowired
	private WorkorderitemMapper workorderitemMapper;

	@GetMapping("/")
	public List<Workorderitem> getAllWorkorderitem() {
		List<Workorderitem> workorderitems = workorderitemMapper.getAllWorkorderitem();
		return workorderitems;
	}

	@GetMapping("/{wOId}/{serialNo}")
	public Workorderitem getWorkorderitem(@PathVariable(value = "wOId") Integer wOId, @PathVariable(value = "serialNo") Integer serialNo) {
		Workorderitem workorderitem = workorderitemMapper.getWorkorderitem(wOId,serialNo);
		log.debug(workorderitem.toString());
		return workorderitem;
	}

	@PutMapping("/update")
	public void  updateWorkorderitem(@RequestBody Workorderitem workorderitem) {
		workorderitemMapper.updateWorkorderitem(workorderitem);
		log.debug(workorderitem.toString());
	}

	@PostMapping("/save")
	public void saveWorkorderitem(@RequestBody Workorderitem workorderitem){
		workorderitemMapper.saveWorkorderitem(workorderitem);
		log.debug(workorderitem.toString());
	}

	@DeleteMapping("/delete/{wOId}/{serialNo}")
	public void  deleteWorkorderitem(@PathVariable(value = "wOId") Integer wOId, @PathVariable(value = "serialNo") Integer serialNo) {
		workorderitemMapper.deleteWorkorderitem(wOId,serialNo);
	}


}
