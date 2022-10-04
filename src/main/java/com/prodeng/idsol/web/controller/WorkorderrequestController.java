package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Workorderrequest;
import com.prodeng.idsol.dao.mapper.WorkorderrequestMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/workorderrequest")
@Slf4j
public class WorkorderrequestController{

	@Autowired
	private WorkorderrequestMapper workorderrequestMapper;

	@GetMapping("/")
	public List<Workorderrequest> getAllWorkorderrequest() {
		List<Workorderrequest> workorderrequests = workorderrequestMapper.getAllWorkorderrequest();
		return workorderrequests;
	}

	@GetMapping("/{wOId}")
	public Workorderrequest getWorkorderrequest(@PathVariable(value = "wOId") Integer wOId) {
		Workorderrequest workorderrequest = workorderrequestMapper.getWorkorderrequest(wOId);
		log.debug(workorderrequest.toString());
		return workorderrequest;
	}

	@PutMapping("/update")
	public void  updateWorkorderrequest(@RequestBody Workorderrequest workorderrequest) {
		workorderrequestMapper.updateWorkorderrequest(workorderrequest.getWOId());
		log.debug(workorderrequest.toString());
	}

	@PostMapping("/save")
	public void saveWorkorderrequest(@RequestBody Workorderrequest workorderrequest){
		workorderrequestMapper.saveWorkorderrequest(workorderrequest);
		log.debug(workorderrequest.toString());
	}

	@DeleteMapping("/delete/{wOId}")
	public void  deleteWorkorderrequest(@PathVariable(value = "wOId") Integer wOId) {
		workorderrequestMapper.deleteWorkorderrequest(wOId);
	}


}
