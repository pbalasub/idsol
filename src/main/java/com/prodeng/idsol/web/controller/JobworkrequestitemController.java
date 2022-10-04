package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Jobworkrequestitem;
import com.prodeng.idsol.dao.mapper.JobworkrequestitemMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/jobworkrequestitem")
@Slf4j
public class JobworkrequestitemController{

	@Autowired
	private JobworkrequestitemMapper jobworkrequestitemMapper;

	@GetMapping("/")
	public List<Jobworkrequestitem> getAllJobworkrequestitem() {
		List<Jobworkrequestitem> jobworkrequestitems = jobworkrequestitemMapper.getAllJobworkrequestitem();
		return jobworkrequestitems;
	}

	@GetMapping("/{jWRId}/{serialNo}")
	public Jobworkrequestitem getJobworkrequestitem(@PathVariable(value = "jWRId") Integer jWRId, @PathVariable(value = "serialNo") Integer serialNo) {
		Jobworkrequestitem jobworkrequestitem = jobworkrequestitemMapper.getJobworkrequestitem(jWRId,serialNo);
		log.debug(jobworkrequestitem.toString());
		return jobworkrequestitem;
	}

	@PutMapping("/update")
	public void  updateJobworkrequestitem(@RequestBody Jobworkrequestitem jobworkrequestitem) {
		jobworkrequestitemMapper.updateJobworkrequestitem(jobworkrequestitem);
		log.debug(jobworkrequestitem.toString());
	}

	@PostMapping("/save")
	public void saveJobworkrequestitem(@RequestBody Jobworkrequestitem jobworkrequestitem){
		jobworkrequestitemMapper.saveJobworkrequestitem(jobworkrequestitem);
		log.debug(jobworkrequestitem.toString());
	}

	@DeleteMapping("/delete/{jWRId}/{serialNo}")
	public void  deleteJobworkrequestitem(@PathVariable(value = "jWRId") Integer jWRId, @PathVariable(value = "serialNo") Integer serialNo) {
		jobworkrequestitemMapper.deleteJobworkrequestitem(jWRId,serialNo);
	}


}
