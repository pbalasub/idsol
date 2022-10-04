package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Jobworkrequest;
import com.prodeng.idsol.dao.mapper.JobworkrequestMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/jobworkrequest")
@Slf4j
public class JobworkrequestController{

	@Autowired
	private JobworkrequestMapper jobworkrequestMapper;

	@GetMapping("/")
	public List<Jobworkrequest> getAllJobworkrequest() {
		List<Jobworkrequest> jobworkrequests = jobworkrequestMapper.getAllJobworkrequest();
		return jobworkrequests;
	}

	@GetMapping("/{jWRId}")
	public Jobworkrequest getJobworkrequest(@PathVariable(value = "jWRId") Integer jWRId) {
		Jobworkrequest jobworkrequest = jobworkrequestMapper.getJobworkrequest(jWRId);
		log.debug(jobworkrequest.toString());
		return jobworkrequest;
	}

	@PutMapping("/update")
	public void  updateJobworkrequest(@RequestBody Jobworkrequest jobworkrequest) {
		jobworkrequestMapper.updateJobworkrequest(jobworkrequest.getJWRId());
		log.debug(jobworkrequest.toString());
	}

	@PostMapping("/save")
	public void saveJobworkrequest(@RequestBody Jobworkrequest jobworkrequest){
		jobworkrequestMapper.saveJobworkrequest(jobworkrequest);
		log.debug(jobworkrequest.toString());
	}

	@DeleteMapping("/delete/{jWRId}")
	public void  deleteJobworkrequest(@PathVariable(value = "jWRId") Integer jWRId) {
		jobworkrequestMapper.deleteJobworkrequest(jWRId);
	}


}
