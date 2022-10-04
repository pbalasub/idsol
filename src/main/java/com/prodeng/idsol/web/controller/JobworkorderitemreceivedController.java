package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Jobworkorderitemreceived;
import com.prodeng.idsol.dao.mapper.JobworkorderitemreceivedMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/jobworkorderitemreceived")
@Slf4j
public class JobworkorderitemreceivedController{

	@Autowired
	private JobworkorderitemreceivedMapper jobworkorderitemreceivedMapper;

	@GetMapping("/")
	public List<Jobworkorderitemreceived> getAllJobworkorderitemreceived() {
		List<Jobworkorderitemreceived> jobworkorderitemreceiveds = jobworkorderitemreceivedMapper.getAllJobworkorderitemreceived();
		return jobworkorderitemreceiveds;
	}

	@GetMapping("/{jWOId}/{serialNo}/{itemCodeReceived}")
	public Jobworkorderitemreceived getJobworkorderitemreceived(@PathVariable(value = "jWOId") Integer jWOId, @PathVariable(value = "serialNo") Integer serialNo, @PathVariable(value = "itemCodeReceived") String itemCodeReceived) {
		Jobworkorderitemreceived jobworkorderitemreceived = jobworkorderitemreceivedMapper.getJobworkorderitemreceived(jWOId,serialNo,itemCodeReceived);
		log.debug(jobworkorderitemreceived.toString());
		return jobworkorderitemreceived;
	}

	@PutMapping("/update")
	public void  updateJobworkorderitemreceived(@RequestBody Jobworkorderitemreceived jobworkorderitemreceived) {
		jobworkorderitemreceivedMapper.updateJobworkorderitemreceived(jobworkorderitemreceived);
		log.debug(jobworkorderitemreceived.toString());
	}

	@PostMapping("/save")
	public void saveJobworkorderitemreceived(@RequestBody Jobworkorderitemreceived jobworkorderitemreceived){
		jobworkorderitemreceivedMapper.saveJobworkorderitemreceived(jobworkorderitemreceived);
		log.debug(jobworkorderitemreceived.toString());
	}

	@DeleteMapping("/delete/{jWOId}/{serialNo}/{itemCodeReceived}")
	public void  deleteJobworkorderitemreceived(@PathVariable(value = "jWOId") Integer jWOId, @PathVariable(value = "serialNo") Integer serialNo, @PathVariable(value = "itemCodeReceived") String itemCodeReceived) {
		jobworkorderitemreceivedMapper.deleteJobworkorderitemreceived(jWOId,serialNo,itemCodeReceived);
	}


}
