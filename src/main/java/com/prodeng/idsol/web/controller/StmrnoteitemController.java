package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Stmrnoteitem;
import com.prodeng.idsol.dao.mapper.StmrnoteitemMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/stmrnoteitem")
@Slf4j
public class StmrnoteitemController{

	@Autowired
	private StmrnoteitemMapper stmrnoteitemMapper;

	@GetMapping("/")
	public List<Stmrnoteitem> getAllStmrnoteitem() {
		List<Stmrnoteitem> stmrnoteitems = stmrnoteitemMapper.getAllStmrnoteitem();
		return stmrnoteitems;
	}

	@GetMapping("/{mRNId}/{serialNo}")
	public Stmrnoteitem getStmrnoteitem(@PathVariable(value = "mRNId") Integer mRNId, @PathVariable(value = "serialNo") Integer serialNo) {
		Stmrnoteitem stmrnoteitem = stmrnoteitemMapper.getStmrnoteitem(mRNId,serialNo);
		log.debug(stmrnoteitem.toString());
		return stmrnoteitem;
	}

	@PutMapping("/update")
	public void  updateStmrnoteitem(@RequestBody Stmrnoteitem stmrnoteitem) {
		stmrnoteitemMapper.updateStmrnoteitem(stmrnoteitem);
		log.debug(stmrnoteitem.toString());
	}

	@PostMapping("/save")
	public void saveStmrnoteitem(@RequestBody Stmrnoteitem stmrnoteitem){
		stmrnoteitemMapper.saveStmrnoteitem(stmrnoteitem);
		log.debug(stmrnoteitem.toString());
	}

	@DeleteMapping("/delete/{mRNId}/{serialNo}")
	public void  deleteStmrnoteitem(@PathVariable(value = "mRNId") Integer mRNId, @PathVariable(value = "serialNo") Integer serialNo) {
		stmrnoteitemMapper.deleteStmrnoteitem(mRNId,serialNo);
	}


}
