package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Stinwarditem;
import com.prodeng.idsol.dao.mapper.StinwarditemMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/stinwarditem")
@Slf4j
public class StinwarditemController{

	@Autowired
	private StinwarditemMapper stinwarditemMapper;

	@GetMapping("/")
	public List<Stinwarditem> getAllStinwarditem() {
		List<Stinwarditem> stinwarditems = stinwarditemMapper.getAllStinwarditem();
		return stinwarditems;
	}

	@GetMapping("/{inwardId}/{serialNo}")
	public Stinwarditem getStinwarditem(@PathVariable(value = "inwardId") Integer inwardId, @PathVariable(value = "serialNo") Integer serialNo) {
		Stinwarditem stinwarditem = stinwarditemMapper.getStinwarditem(inwardId,serialNo);
		log.debug(stinwarditem.toString());
		return stinwarditem;
	}

	@PutMapping("/update")
	public void  updateStinwarditem(@RequestBody Stinwarditem stinwarditem) {
		stinwarditemMapper.updateStinwarditem(stinwarditem);
		log.debug(stinwarditem.toString());
	}

	@PostMapping("/save")
	public void saveStinwarditem(@RequestBody Stinwarditem stinwarditem){
		stinwarditemMapper.saveStinwarditem(stinwarditem);
		log.debug(stinwarditem.toString());
	}

	@DeleteMapping("/delete/{inwardId}/{serialNo}")
	public void  deleteStinwarditem(@PathVariable(value = "inwardId") Integer inwardId, @PathVariable(value = "serialNo") Integer serialNo) {
		stinwarditemMapper.deleteStinwarditem(inwardId,serialNo);
	}


}
