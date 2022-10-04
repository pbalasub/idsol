package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Codevaluemaster;
import com.prodeng.idsol.dao.mapper.CodevaluemasterMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/codevaluemaster")
@Slf4j
public class CodevaluemasterController{

	@Autowired
	private CodevaluemasterMapper codevaluemasterMapper;

	@GetMapping("/")
	public List<Codevaluemaster> getAllCodevaluemaster() {
		List<Codevaluemaster> codevaluemasters = codevaluemasterMapper.getAllCodevaluemaster();
		return codevaluemasters;
	}

	@GetMapping("/{identifier}")
	public Codevaluemaster getCodevaluemaster(@PathVariable(value = "identifier") Integer identifier) {
		Codevaluemaster codevaluemaster = codevaluemasterMapper.getCodevaluemaster(identifier);
		log.debug(codevaluemaster.toString());
		return codevaluemaster;
	}

	@PutMapping("/update")
	public void  updateCodevaluemaster(@RequestBody Codevaluemaster codevaluemaster) {
		codevaluemasterMapper.updateCodevaluemaster(codevaluemaster.getIdentifier());
		log.debug(codevaluemaster.toString());
	}

	@PostMapping("/save")
	public void saveCodevaluemaster(@RequestBody Codevaluemaster codevaluemaster){
		codevaluemasterMapper.saveCodevaluemaster(codevaluemaster);
		log.debug(codevaluemaster.toString());
	}

	@DeleteMapping("/delete/{identifier}")
	public void  deleteCodevaluemaster(@PathVariable(value = "identifier") Integer identifier) {
		codevaluemasterMapper.deleteCodevaluemaster(identifier);
	}


}
