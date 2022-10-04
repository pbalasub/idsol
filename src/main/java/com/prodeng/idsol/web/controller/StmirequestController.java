package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Stmirequest;
import com.prodeng.idsol.dao.mapper.StmirequestMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/stmirequest")
@Slf4j
public class StmirequestController{

	@Autowired
	private StmirequestMapper stmirequestMapper;

	@GetMapping("/")
	public List<Stmirequest> getAllStmirequest() {
		List<Stmirequest> stmirequests = stmirequestMapper.getAllStmirequest();
		return stmirequests;
	}

	@GetMapping("/{mIRId}")
	public Stmirequest getStmirequest(@PathVariable(value = "mIRId") Integer mIRId) {
		Stmirequest stmirequest = stmirequestMapper.getStmirequest(mIRId);
		log.debug(stmirequest.toString());
		return stmirequest;
	}

	@PutMapping("/update")
	public void  updateStmirequest(@RequestBody Stmirequest stmirequest) {
		stmirequestMapper.updateStmirequest(stmirequest.getMIRId());
		log.debug(stmirequest.toString());
	}

	@PostMapping("/save")
	public void saveStmirequest(@RequestBody Stmirequest stmirequest){
		stmirequestMapper.saveStmirequest(stmirequest);
		log.debug(stmirequest.toString());
	}

	@DeleteMapping("/delete/{mIRId}")
	public void  deleteStmirequest(@PathVariable(value = "mIRId") Integer mIRId) {
		stmirequestMapper.deleteStmirequest(mIRId);
	}


}
