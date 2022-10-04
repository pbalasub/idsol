package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Stmirequestitem;
import com.prodeng.idsol.dao.mapper.StmirequestitemMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/stmirequestitem")
@Slf4j
public class StmirequestitemController{

	@Autowired
	private StmirequestitemMapper stmirequestitemMapper;

	@GetMapping("/")
	public List<Stmirequestitem> getAllStmirequestitem() {
		List<Stmirequestitem> stmirequestitems = stmirequestitemMapper.getAllStmirequestitem();
		return stmirequestitems;
	}

	@GetMapping("/{mIRId}/{serialNo}")
	public Stmirequestitem getStmirequestitem(@PathVariable(value = "mIRId") Integer mIRId, @PathVariable(value = "serialNo") Integer serialNo) {
		Stmirequestitem stmirequestitem = stmirequestitemMapper.getStmirequestitem(mIRId,serialNo);
		log.debug(stmirequestitem.toString());
		return stmirequestitem;
	}

	@PutMapping("/update")
	public void  updateStmirequestitem(@RequestBody Stmirequestitem stmirequestitem) {
		stmirequestitemMapper.updateStmirequestitem(stmirequestitem);
		log.debug(stmirequestitem.toString());
	}

	@PostMapping("/save")
	public void saveStmirequestitem(@RequestBody Stmirequestitem stmirequestitem){
		stmirequestitemMapper.saveStmirequestitem(stmirequestitem);
		log.debug(stmirequestitem.toString());
	}

	@DeleteMapping("/delete/{mIRId}/{serialNo}")
	public void  deleteStmirequestitem(@PathVariable(value = "mIRId") Integer mIRId, @PathVariable(value = "serialNo") Integer serialNo) {
		stmirequestitemMapper.deleteStmirequestitem(mIRId,serialNo);
	}


}
