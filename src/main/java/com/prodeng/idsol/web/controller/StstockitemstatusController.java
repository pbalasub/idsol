package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Ststockitemstatus;
import com.prodeng.idsol.dao.mapper.StstockitemstatusMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ststockitemstatus")
@Slf4j
public class StstockitemstatusController{

	@Autowired
	private StstockitemstatusMapper ststockitemstatusMapper;

	@GetMapping("/")
	public List<Ststockitemstatus> getAllStstockitemstatus() {
		List<Ststockitemstatus> ststockitemstatuss = ststockitemstatusMapper.getAllStstockitemstatus();
		return ststockitemstatuss;
	}

	@GetMapping("/{itemCode}/{referenceNo}/{processedState}")
	public Ststockitemstatus getStstockitemstatus(@PathVariable(value = "itemCode") String itemCode, @PathVariable(value = "referenceNo") String referenceNo, @PathVariable(value = "processedState") String processedState) {
		Ststockitemstatus ststockitemstatus = ststockitemstatusMapper.getStstockitemstatus(itemCode,referenceNo,processedState);
		log.debug(ststockitemstatus.toString());
		return ststockitemstatus;
	}

	@PutMapping("/update")
	public void  updateStstockitemstatus(@RequestBody Ststockitemstatus ststockitemstatus) {
		ststockitemstatusMapper.updateStstockitemstatus(ststockitemstatus);
		log.debug(ststockitemstatus.toString());
	}

	@PostMapping("/save")
	public void saveStstockitemstatus(@RequestBody Ststockitemstatus ststockitemstatus){
		ststockitemstatusMapper.saveStstockitemstatus(ststockitemstatus);
		log.debug(ststockitemstatus.toString());
	}

	@DeleteMapping("/delete/{itemCode}/{referenceNo}/{processedState}")
	public void  deleteStstockitemstatus(@PathVariable(value = "itemCode") String itemCode, @PathVariable(value = "referenceNo") String referenceNo, @PathVariable(value = "processedState") String processedState) {
		ststockitemstatusMapper.deleteStstockitemstatus(itemCode,referenceNo,processedState);
	}


}
