package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Controlplan;
import com.prodeng.idsol.dao.mapper.ControlplanMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/controlplan")
@Slf4j
public class ControlplanController{

	@Autowired
	private ControlplanMapper controlplanMapper;

	@GetMapping("/")
	public List<Controlplan> getAllControlplan() {
		List<Controlplan> controlplans = controlplanMapper.getAllControlplan();
		return controlplans;
	}

	@GetMapping("/{cPId}")
	public Controlplan getControlplan(@PathVariable(value = "cPId") Integer cPId) {
		Controlplan controlplan = controlplanMapper.getControlplan(cPId);
		log.debug(controlplan.toString());
		return controlplan;
	}

	@PutMapping("/update")
	public void  updateControlplan(@RequestBody Controlplan controlplan) {
		controlplanMapper.updateControlplan(controlplan.getCPId());
		log.debug(controlplan.toString());
	}

	@PostMapping("/save")
	public void saveControlplan(@RequestBody Controlplan controlplan){
		controlplanMapper.saveControlplan(controlplan);
		log.debug(controlplan.toString());
	}

	@DeleteMapping("/delete/{cPId}")
	public void  deleteControlplan(@PathVariable(value = "cPId") Integer cPId) {
		controlplanMapper.deleteControlplan(cPId);
	}


}
