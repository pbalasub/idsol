package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Codevaluemasteritem;
import com.prodeng.idsol.dao.mapper.CodevaluemasteritemMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/codevaluemasteritem")
@Slf4j
public class CodevaluemasteritemController{

	@Autowired
	private CodevaluemasteritemMapper codevaluemasteritemMapper;

	@GetMapping("/")
	public List<Codevaluemasteritem> getAllCodevaluemasteritem() {
		List<Codevaluemasteritem> codevaluemasteritems = codevaluemasteritemMapper.getAllCodevaluemasteritem();
		return codevaluemasteritems;
	}

	@GetMapping("/{identifier}/{code}")
	public Codevaluemasteritem getCodevaluemasteritem(@PathVariable(value = "identifier") Integer identifier, @PathVariable(value = "code") String code) {
		Codevaluemasteritem codevaluemasteritem = codevaluemasteritemMapper.getCodevaluemasteritem(identifier,code);
		log.debug(codevaluemasteritem.toString());
		return codevaluemasteritem;
	}

	@PutMapping("/update")
	public void  updateCodevaluemasteritem(@RequestBody Codevaluemasteritem codevaluemasteritem) {
		codevaluemasteritemMapper.updateCodevaluemasteritem(codevaluemasteritem);
		log.debug(codevaluemasteritem.toString());
	}

	@PostMapping("/save")
	public void saveCodevaluemasteritem(@RequestBody Codevaluemasteritem codevaluemasteritem){
		codevaluemasteritemMapper.saveCodevaluemasteritem(codevaluemasteritem);
		log.debug(codevaluemasteritem.toString());
	}

	@DeleteMapping("/delete/{identifier}/{code}")
	public void  deleteCodevaluemasteritem(@PathVariable(value = "identifier") Integer identifier, @PathVariable(value = "code") String code) {
		codevaluemasteritemMapper.deleteCodevaluemasteritem(identifier,code);
	}


}
