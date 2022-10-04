package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Maincategorymaster;
import com.prodeng.idsol.dao.mapper.MaincategorymasterMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/maincategorymaster")
@Slf4j
public class MaincategorymasterController{

	@Autowired
	private MaincategorymasterMapper maincategorymasterMapper;

	@GetMapping("/")
	public List<Maincategorymaster> getAllMaincategorymaster() {
		List<Maincategorymaster> maincategorymasters = maincategorymasterMapper.getAllMaincategorymaster();
		return maincategorymasters;
	}

	@GetMapping("/{mainCategory}")
	public Maincategorymaster getMaincategorymaster(@PathVariable(value = "mainCategory") String mainCategory) {
		Maincategorymaster maincategorymaster = maincategorymasterMapper.getMaincategorymaster(mainCategory);
		log.debug(maincategorymaster.toString());
		return maincategorymaster;
	}

	@PutMapping("/update")
	public void  updateMaincategorymaster(@RequestBody Maincategorymaster maincategorymaster) {
		maincategorymasterMapper.updateMaincategorymaster(String.valueOf(maincategorymaster));
		log.debug(maincategorymaster.toString());
	}

	@PostMapping("/save")
	public void saveMaincategorymaster(@RequestBody Maincategorymaster maincategorymaster){
		maincategorymasterMapper.saveMaincategorymaster(maincategorymaster);
		log.debug(maincategorymaster.toString());
	}

	@DeleteMapping("/delete/{mainCategory}")
	public void  deleteMaincategorymaster(@PathVariable(value = "mainCategory") String mainCategory) {
		maincategorymasterMapper.deleteMaincategorymaster(mainCategory);
	}


}
