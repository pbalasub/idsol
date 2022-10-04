package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Jobworkrequestitemsent;
import com.prodeng.idsol.dao.mapper.JobworkrequestitemsentMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/jobworkrequestitemsent")
@Slf4j
public class JobworkrequestitemsentController{

	@Autowired
	private JobworkrequestitemsentMapper jobworkrequestitemsentMapper;

	@GetMapping("/")
	public List<Jobworkrequestitemsent> getAllJobworkrequestitemsent() {
		List<Jobworkrequestitemsent> jobworkrequestitemsents = jobworkrequestitemsentMapper.getAllJobworkrequestitemsent();
		return jobworkrequestitemsents;
	}

	@GetMapping("/{jWRId}/{serialNo}/{itemCodeSent}")
	public Jobworkrequestitemsent getJobworkrequestitemsent(@PathVariable(value = "jWRId") Integer jWRId, @PathVariable(value = "serialNo") Integer serialNo, @PathVariable(value = "itemCodeSent") String itemCodeSent) {
		Jobworkrequestitemsent jobworkrequestitemsent = jobworkrequestitemsentMapper.getJobworkrequestitemsent(jWRId,serialNo,itemCodeSent);
		log.debug(jobworkrequestitemsent.toString());
		return jobworkrequestitemsent;
	}

	@PutMapping("/update")
	public void  updateJobworkrequestitemsent(@RequestBody Jobworkrequestitemsent jobworkrequestitemsent) {
		jobworkrequestitemsentMapper.updateJobworkrequestitemsent(jobworkrequestitemsent);
		log.debug(jobworkrequestitemsent.toString());
	}

	@PostMapping("/save")
	public void saveJobworkrequestitemsent(@RequestBody Jobworkrequestitemsent jobworkrequestitemsent){
		jobworkrequestitemsentMapper.saveJobworkrequestitemsent(jobworkrequestitemsent);
		log.debug(jobworkrequestitemsent.toString());
	}

	@DeleteMapping("/delete/{jWRId}/{serialNo}/{itemCodeSent}")
	public void  deleteJobworkrequestitemsent(@PathVariable(value = "jWRId") Integer jWRId, @PathVariable(value = "serialNo") Integer serialNo, @PathVariable(value = "itemCodeSent") String itemCodeSent) {
		jobworkrequestitemsentMapper.deleteJobworkrequestitemsent(jWRId,serialNo,itemCodeSent);
	}


}
