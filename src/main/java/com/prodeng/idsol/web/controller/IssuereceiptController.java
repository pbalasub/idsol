package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Issuereceipt;
import com.prodeng.idsol.dao.mapper.IssuereceiptMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/issuereceipt")
@Slf4j
public class IssuereceiptController{

	@Autowired
	private IssuereceiptMapper issuereceiptMapper;

	@GetMapping("/")
	public List<Issuereceipt> getAllIssuereceipt() {
		List<Issuereceipt> issuereceipts = issuereceiptMapper.getAllIssuereceipt();
		return issuereceipts;
	}

	@GetMapping("/{iRId}")
	public Issuereceipt getIssuereceipt(@PathVariable(value = "iRId") Integer iRId) {
		Issuereceipt issuereceipt = issuereceiptMapper.getIssuereceipt(iRId);
		log.debug(issuereceipt.toString());
		return issuereceipt;
	}

	@PutMapping("/update")
	public void  updateIssuereceipt(@RequestBody Issuereceipt issuereceipt) {
		issuereceiptMapper.updateIssuereceipt(issuereceipt.getIRId());
		log.debug(issuereceipt.toString());
	}

	@PostMapping("/save")
	public void saveIssuereceipt(@RequestBody Issuereceipt issuereceipt){
		issuereceiptMapper.saveIssuereceipt(issuereceipt);
		log.debug(issuereceipt.toString());
	}

	@DeleteMapping("/delete/{iRId}")
	public void  deleteIssuereceipt(@PathVariable(value = "iRId") Integer iRId) {
		issuereceiptMapper.deleteIssuereceipt(iRId);
	}


}
