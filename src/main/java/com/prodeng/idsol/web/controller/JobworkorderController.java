package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Jobworkorder;
import com.prodeng.idsol.dao.mapper.JobworkorderMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/jobworkorder")
@Slf4j
public class JobworkorderController{

	@Autowired
	private JobworkorderMapper jobworkorderMapper;

	@GetMapping("/")
	public List<Jobworkorder> getAllJobworkorder() {
		List<Jobworkorder> jobworkorders = jobworkorderMapper.getAllJobworkorder();
		return jobworkorders;
	}

	@GetMapping("/{jWOId}")
	public Jobworkorder getJobworkorder(@PathVariable(value = "jWOId") Integer jWOId) {
		Jobworkorder jobworkorder = jobworkorderMapper.getJobworkorder(jWOId);
		log.debug(jobworkorder.toString());
		return jobworkorder;
	}

	@PutMapping("/update")
	public void  updateJobworkorder(@RequestBody Jobworkorder jobworkorder) {
		jobworkorderMapper.updateJobworkorder(jobworkorder.getJWOId());
		log.debug(jobworkorder.toString());
	}

	@PostMapping("/save")
	public void saveJobworkorder(@RequestBody Jobworkorder jobworkorder){
		jobworkorderMapper.saveJobworkorder(jobworkorder);
		log.debug(jobworkorder.toString());
	}

	@DeleteMapping("/delete/{jWOId}")
	public void  deleteJobworkorder(@PathVariable(value = "jWOId") Integer jWOId) {
		jobworkorderMapper.deleteJobworkorder(jWOId);
	}


}
