package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Jobworkorderitemsent;
import com.prodeng.idsol.dao.mapper.JobworkorderitemsentMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/jobworkorderitemsent")
@Slf4j
public class JobworkorderitemsentController{

	@Autowired
	private JobworkorderitemsentMapper jobworkorderitemsentMapper;

	@GetMapping("/")
	public List<Jobworkorderitemsent> getAllJobworkorderitemsent() {
		List<Jobworkorderitemsent> jobworkorderitemsents = jobworkorderitemsentMapper.getAllJobworkorderitemsent();
		return jobworkorderitemsents;
	}

	@GetMapping("/{jWOId}/{serialNo}/{itemCodeSent}")
	public Jobworkorderitemsent getJobworkorderitemsent(@PathVariable(value = "jWOId") Integer jWOId, @PathVariable(value = "serialNo") Integer serialNo, @PathVariable(value = "itemCodeSent") String itemCodeSent) {
		Jobworkorderitemsent jobworkorderitemsent = jobworkorderitemsentMapper.getJobworkorderitemsent(jWOId,serialNo,itemCodeSent);
		log.debug(jobworkorderitemsent.toString());
		return jobworkorderitemsent;
	}

	@PutMapping("/update")
	public void  updateJobworkorderitemsent(@RequestBody Jobworkorderitemsent jobworkorderitemsent) {
		jobworkorderitemsentMapper.updateJobworkorderitemsent(jobworkorderitemsent);
		log.debug(jobworkorderitemsent.toString());
	}

	@PostMapping("/save")
	public void saveJobworkorderitemsent(@RequestBody Jobworkorderitemsent jobworkorderitemsent){
		jobworkorderitemsentMapper.saveJobworkorderitemsent(jobworkorderitemsent);
		log.debug(jobworkorderitemsent.toString());
	}

	@DeleteMapping("/delete/{jWOId}/{serialNo}/{itemCodeSent}")
	public void  deleteJobworkorderitemsent(@PathVariable(value = "jWOId") Integer jWOId, @PathVariable(value = "serialNo") Integer serialNo, @PathVariable(value = "itemCodeSent") String itemCodeSent) {
		jobworkorderitemsentMapper.deleteJobworkorderitemsent(jWOId,serialNo,itemCodeSent);
	}


}
