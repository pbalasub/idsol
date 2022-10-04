package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Jobworkorderitem;
import com.prodeng.idsol.dao.mapper.JobworkorderitemMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/jobworkorderitem")
@Slf4j
public class JobworkorderitemController{

	@Autowired
	private JobworkorderitemMapper jobworkorderitemMapper;

	@GetMapping("/")
	public List<Jobworkorderitem> getAllJobworkorderitem() {
		List<Jobworkorderitem> jobworkorderitems = jobworkorderitemMapper.getAllJobworkorderitem();
		return jobworkorderitems;
	}

	@GetMapping("/{jWOId}/{serialNo}")
	public Jobworkorderitem getJobworkorderitem(@PathVariable(value = "jWOId") Integer jWOId, @PathVariable(value = "serialNo") Integer serialNo) {
		Jobworkorderitem jobworkorderitem = jobworkorderitemMapper.getJobworkorderitem(jWOId,serialNo);
		log.debug(jobworkorderitem.toString());
		return jobworkorderitem;
	}

	@PutMapping("/update")
	public void  updateJobworkorderitem(@RequestBody Jobworkorderitem jobworkorderitem) {
		jobworkorderitemMapper.updateJobworkorderitem(jobworkorderitem);
		log.debug(jobworkorderitem.toString());
	}

	@PostMapping("/save")
	public void saveJobworkorderitem(@RequestBody Jobworkorderitem jobworkorderitem){
		jobworkorderitemMapper.saveJobworkorderitem(jobworkorderitem);
		log.debug(jobworkorderitem.toString());
	}

	@DeleteMapping("/delete/{jWOId}/{serialNo}")
	public void  deleteJobworkorderitem(@PathVariable(value = "jWOId") Integer jWOId, @PathVariable(value = "serialNo") Integer serialNo) {
		jobworkorderitemMapper.deleteJobworkorderitem(jWOId,serialNo);
	}


}
