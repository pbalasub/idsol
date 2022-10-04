package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Stmrnote;
import com.prodeng.idsol.dao.mapper.StmrnoteMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/stmrnote")
@Slf4j
public class StmrnoteController{

	@Autowired
	private StmrnoteMapper stmrnoteMapper;

	@GetMapping("/")
	public List<Stmrnote> getAllStmrnote() {
		List<Stmrnote> stmrnotes = stmrnoteMapper.getAllStmrnote();
		return stmrnotes;
	}

	@GetMapping("/{mRNId}")
	public Stmrnote getStmrnote(@PathVariable(value = "mRNId") Integer mRNId) {
		Stmrnote stmrnote = stmrnoteMapper.getStmrnote(mRNId);
		log.debug(stmrnote.toString());
		return stmrnote;
	}

	@PutMapping("/update")
	public void  updateStmrnote(@RequestBody Stmrnote stmrnote) {
		stmrnoteMapper.updateStmrnote(stmrnote.getMRNId());
		log.debug(stmrnote.toString());
	}

	@PostMapping("/save")
	public void saveStmrnote(@RequestBody Stmrnote stmrnote){
		stmrnoteMapper.saveStmrnote(stmrnote);
		log.debug(stmrnote.toString());
	}

	@DeleteMapping("/delete/{mRNId}")
	public void  deleteStmrnote(@PathVariable(value = "mRNId") Integer mRNId) {
		stmrnoteMapper.deleteStmrnote(mRNId);
	}


}
