package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Openingbalancemaster;
import com.prodeng.idsol.dao.mapper.OpeningbalancemasterMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/openingbalancemaster")
@Slf4j
public class OpeningbalancemasterController{

	@Autowired
	private OpeningbalancemasterMapper openingbalancemasterMapper;

	@GetMapping("/")
	public List<Openingbalancemaster> getAllOpeningbalancemaster() {
		List<Openingbalancemaster> openingbalancemasters = openingbalancemasterMapper.getAllOpeningbalancemaster();
		return openingbalancemasters;
	}

	@GetMapping("/{param1}/{param2}/{param3}/{param4}/{param5}/{param6}/{identityType}/{month}/{year}")
	public Openingbalancemaster getOpeningbalancemaster(@PathVariable(value = "param1") String param1, @PathVariable(value = "param2") String param2, @PathVariable(value = "param3") String param3, @PathVariable(value = "param4") String param4, @PathVariable(value = "param5") String param5, @PathVariable(value = "param6") String param6, @PathVariable(value = "identityType") String identityType, @PathVariable(value = "month") Integer month, @PathVariable(value = "year") Integer year) {
		Openingbalancemaster openingbalancemaster = openingbalancemasterMapper.getOpeningbalancemaster(param1,param2,param3,param4,param5,param6,identityType,month,year);
		log.debug(openingbalancemaster.toString());
		return openingbalancemaster;
	}

	@PutMapping("/update")
	public void  updateOpeningbalancemaster(@RequestBody Openingbalancemaster openingbalancemaster) {
		openingbalancemasterMapper.updateOpeningbalancemaster(openingbalancemaster);
		log.debug(openingbalancemaster.toString());
	}

	@PostMapping("/save")
	public void saveOpeningbalancemaster(@RequestBody Openingbalancemaster openingbalancemaster){
		openingbalancemasterMapper.saveOpeningbalancemaster(openingbalancemaster);
		log.debug(openingbalancemaster.toString());
	}

	@DeleteMapping("/delete/{param1}/{param2}/{param3}/{param4}/{param5}/{param6}/{identityType}/{month}/{year}")
	public void  deleteOpeningbalancemaster(@PathVariable(value = "param1") String param1, @PathVariable(value = "param2") String param2, @PathVariable(value = "param3") String param3, @PathVariable(value = "param4") String param4, @PathVariable(value = "param5") String param5, @PathVariable(value = "param6") String param6, @PathVariable(value = "identityType") String identityType, @PathVariable(value = "month") Integer month, @PathVariable(value = "year") Integer year) {
		openingbalancemasterMapper.deleteOpeningbalancemaster(param1,param2,param3,param4,param5,param6,identityType,month,year);
	}


}
