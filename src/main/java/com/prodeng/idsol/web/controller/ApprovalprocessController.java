package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Approvalprocess;
import com.prodeng.idsol.dao.mapper.ApprovalprocessMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/approvalprocess")
@Slf4j
public class ApprovalprocessController{

	@Autowired
	private ApprovalprocessMapper approvalprocessMapper;

	@GetMapping("/")
	public List<Approvalprocess> getAllApprovalprocess() {
		List<Approvalprocess> approvalprocesss = approvalprocessMapper.getAllApprovalprocess();
		return approvalprocesss;
	}

	@GetMapping("/{processStageRole}/{processType}")
	public Approvalprocess getApprovalprocess(@PathVariable(value = "processStageRole") String processStageRole, @PathVariable(value = "processType") String processType) {
		Approvalprocess approvalprocess = approvalprocessMapper.getApprovalprocess(processStageRole,processType);
		log.debug(approvalprocess.toString());
		return approvalprocess;
	}

	@PutMapping("/update")
	public void  updateApprovalprocess(@RequestBody Approvalprocess approvalprocess) {
		approvalprocessMapper.updateApprovalprocess(approvalprocess);
		log.debug(approvalprocess.toString());
	}

	@PostMapping("/save")
	public void saveApprovalprocess(@RequestBody Approvalprocess approvalprocess){
		approvalprocessMapper.saveApprovalprocess(approvalprocess);
		log.debug(approvalprocess.toString());
	}

	@DeleteMapping("/delete/{processStageRole}/{processType}")
	public void  deleteApprovalprocess(@PathVariable(value = "processStageRole") String processStageRole, @PathVariable(value = "processType") String processType) {
		approvalprocessMapper.deleteApprovalprocess(processStageRole,processType);
	}


}
