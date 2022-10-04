package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Jobworkrequestitemreceived;
import com.prodeng.idsol.dao.mapper.JobworkrequestitemreceivedMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/jobworkrequestitemreceived")
@Slf4j
public class JobworkrequestitemreceivedController{

	@Autowired
	private JobworkrequestitemreceivedMapper jobworkrequestitemreceivedMapper;

	@GetMapping("/")
	public List<Jobworkrequestitemreceived> getAllJobworkrequestitemreceived() {
		List<Jobworkrequestitemreceived> jobworkrequestitemreceiveds = jobworkrequestitemreceivedMapper.getAllJobworkrequestitemreceived();
		return jobworkrequestitemreceiveds;
	}

	@GetMapping("/{jWRId}/{serialNo}/{itemCodeReceived}")
	public Jobworkrequestitemreceived getJobworkrequestitemreceived(@PathVariable(value = "jWRId") Integer jWRId, @PathVariable(value = "serialNo") Integer serialNo, @PathVariable(value = "itemCodeReceived") String itemCodeReceived) {
		Jobworkrequestitemreceived jobworkrequestitemreceived = jobworkrequestitemreceivedMapper.getJobworkrequestitemreceived(jWRId,serialNo,itemCodeReceived);
		log.debug(jobworkrequestitemreceived.toString());
		return jobworkrequestitemreceived;
	}

	@PutMapping("/update")
	public void  updateJobworkrequestitemreceived(@RequestBody Jobworkrequestitemreceived jobworkrequestitemreceived) {
		jobworkrequestitemreceivedMapper.updateJobworkrequestitemreceived(jobworkrequestitemreceived);
		log.debug(jobworkrequestitemreceived.toString());
	}

	@PostMapping("/save")
	public void saveJobworkrequestitemreceived(@RequestBody Jobworkrequestitemreceived jobworkrequestitemreceived){
		jobworkrequestitemreceivedMapper.saveJobworkrequestitemreceived(jobworkrequestitemreceived);
		log.debug(jobworkrequestitemreceived.toString());
	}

	@DeleteMapping("/delete/{jWRId}/{serialNo}/{itemCodeReceived}")
	public void  deleteJobworkrequestitemreceived(@PathVariable(value = "jWRId") Integer jWRId, @PathVariable(value = "serialNo") Integer serialNo, @PathVariable(value = "itemCodeReceived") String itemCodeReceived) {
		jobworkrequestitemreceivedMapper.deleteJobworkrequestitemreceived(jWRId,serialNo,itemCodeReceived);
	}


}
