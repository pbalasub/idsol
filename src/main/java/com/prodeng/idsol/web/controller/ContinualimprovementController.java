package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Continualimprovement;
import com.prodeng.idsol.dao.mapper.ContinualimprovementMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/continualimprovement")
@Slf4j
public class ContinualimprovementController{

	@Autowired
	private ContinualimprovementMapper continualimprovementMapper;

	@GetMapping("/")
	public List<Continualimprovement> getAllContinualimprovement() {
		List<Continualimprovement> continualimprovements = continualimprovementMapper.getAllContinualimprovement();
		return continualimprovements;
	}

	@GetMapping("/{cINo}")
	public Continualimprovement getContinualimprovement(@PathVariable(value = "cINo") String cINo) {
		Continualimprovement continualimprovement = continualimprovementMapper.getContinualimprovement(cINo);
		log.debug(continualimprovement.toString());
		return continualimprovement;
	}

	@PutMapping("/update")
	public void  updateContinualimprovement(@RequestBody Continualimprovement continualimprovement) {
		continualimprovementMapper.updateContinualimprovement(String.valueOf(continualimprovement));
		log.debug(continualimprovement.toString());
	}

	@PostMapping("/save")
	public void saveContinualimprovement(@RequestBody Continualimprovement continualimprovement){
		continualimprovementMapper.saveContinualimprovement(continualimprovement);
		log.debug(continualimprovement.toString());
	}

	@DeleteMapping("/delete/{cINo}")
	public void  deleteContinualimprovement(@PathVariable(value = "cINo") String cINo) {
		continualimprovementMapper.deleteContinualimprovement(cINo);
	}


}
