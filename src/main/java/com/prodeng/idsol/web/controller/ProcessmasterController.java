package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Processmaster;
import com.prodeng.idsol.dao.mapper.ProcessmasterMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/processmaster")
@Slf4j
public class ProcessmasterController{

	@Autowired
	private ProcessmasterMapper processmasterMapper;

	@GetMapping("/")
	public List<Processmaster> getAllProcessmaster() {
		List<Processmaster> processmasters = processmasterMapper.getAllProcessmaster();
		return processmasters;
	}

	@GetMapping("/{mainCategory}/{subCategory}/{itemCode}")
	public Processmaster getProcessmaster(@PathVariable(value = "mainCategory") String mainCategory, @PathVariable(value = "subCategory") String subCategory, @PathVariable(value = "itemCode") String itemCode) {
		Processmaster processmaster = processmasterMapper.getProcessmaster(mainCategory,subCategory,itemCode);
		log.debug(processmaster.toString());
		return processmaster;
	}

	@PutMapping("/update")
	public void  updateProcessmaster(@RequestBody Processmaster processmaster) {
		processmasterMapper.updateProcessmaster(processmaster);
		log.debug(processmaster.toString());
	}

	@PostMapping("/save")
	public void saveProcessmaster(@RequestBody Processmaster processmaster){
		processmasterMapper.saveProcessmaster(processmaster);
		log.debug(processmaster.toString());
	}

	@DeleteMapping("/delete/{mainCategory}/{subCategory}/{itemCode}")
	public void  deleteProcessmaster(@PathVariable(value = "mainCategory") String mainCategory, @PathVariable(value = "subCategory") String subCategory, @PathVariable(value = "itemCode") String itemCode) {
		processmasterMapper.deleteProcessmaster(mainCategory,subCategory,itemCode);
	}


}
