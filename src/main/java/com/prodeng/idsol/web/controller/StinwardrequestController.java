package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Stinwardrequest;
import com.prodeng.idsol.dao.mapper.StinwardrequestMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/stinwardrequest")
@Slf4j
public class StinwardrequestController{

	@Autowired
	private StinwardrequestMapper stinwardrequestMapper;

	@GetMapping("/")
	public List<Stinwardrequest> getAllStinwardrequest() {
		List<Stinwardrequest> stinwardrequests = stinwardrequestMapper.getAllStinwardrequest();
		return stinwardrequests;
	}

	@GetMapping("/{inwardId}")
	public Stinwardrequest getStinwardrequest(@PathVariable(value = "inwardId") Integer inwardId) {
		Stinwardrequest stinwardrequest = stinwardrequestMapper.getStinwardrequest(inwardId);
		log.debug(stinwardrequest.toString());
		return stinwardrequest;
	}

	@PutMapping("/update")
	public void  updateStinwardrequest(@RequestBody Stinwardrequest stinwardrequest) {
		stinwardrequestMapper.updateStinwardrequest(stinwardrequest.getInwardId());
		log.debug(stinwardrequest.toString());
	}

	@PostMapping("/save")
	public void saveStinwardrequest(@RequestBody Stinwardrequest stinwardrequest){
		stinwardrequestMapper.saveStinwardrequest(stinwardrequest);
		log.debug(stinwardrequest.toString());
	}

	@DeleteMapping("/delete/{inwardId}")
	public void  deleteStinwardrequest(@PathVariable(value = "inwardId") Integer inwardId) {
		stinwardrequestMapper.deleteStinwardrequest(inwardId);
	}


}
