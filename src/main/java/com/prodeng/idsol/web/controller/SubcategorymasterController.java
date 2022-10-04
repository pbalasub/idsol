package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Subcategorymaster;
import com.prodeng.idsol.dao.mapper.SubcategorymasterMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/subcategorymaster")
@Slf4j
public class SubcategorymasterController{

	@Autowired
	private SubcategorymasterMapper subcategorymasterMapper;

	@GetMapping("/")
	public List<Subcategorymaster> getAllSubcategorymaster() {
		List<Subcategorymaster> subcategorymasters = subcategorymasterMapper.getAllSubcategorymaster();
		return subcategorymasters;
	}

	@GetMapping("/{mainCategory}/{subCategory}")
	public Subcategorymaster getSubcategorymaster(@PathVariable(value = "mainCategory") String mainCategory, @PathVariable(value = "subCategory") String subCategory) {
		Subcategorymaster subcategorymaster = subcategorymasterMapper.getSubcategorymaster(mainCategory,subCategory);
		log.debug(subcategorymaster.toString());
		return subcategorymaster;
	}

	@PutMapping("/update")
	public void  updateSubcategorymaster(@RequestBody Subcategorymaster subcategorymaster) {
		subcategorymasterMapper.updateSubcategorymaster(subcategorymaster);
		log.debug(subcategorymaster.toString());
	}

	@PostMapping("/save")
	public void saveSubcategorymaster(@RequestBody Subcategorymaster subcategorymaster){
		subcategorymasterMapper.saveSubcategorymaster(subcategorymaster);
		log.debug(subcategorymaster.toString());
	}

	@DeleteMapping("/delete/{mainCategory}/{subCategory}")
	public void  deleteSubcategorymaster(@PathVariable(value = "mainCategory") String mainCategory, @PathVariable(value = "subCategory") String subCategory) {
		subcategorymasterMapper.deleteSubcategorymaster(mainCategory,subCategory);
	}


}
