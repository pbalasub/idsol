package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Mtcecharplan;
import com.prodeng.idsol.dao.mapper.MtcecharplanMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/mtcecharplan")
@Slf4j
public class MtcecharplanController{

	@Autowired
	private MtcecharplanMapper mtcecharplanMapper;

	@GetMapping("/")
	public List<Mtcecharplan> getAllMtcecharplan() {
		List<Mtcecharplan> mtcecharplans = mtcecharplanMapper.getAllMtcecharplan();
		return mtcecharplans;
	}

	@GetMapping("/{cPId}")
	public Mtcecharplan getMtcecharplan(@PathVariable(value = "cPId") Integer cPId) {
		Mtcecharplan mtcecharplan = mtcecharplanMapper.getMtcecharplan(cPId);
		log.debug(mtcecharplan.toString());
		return mtcecharplan;
	}

	@PutMapping("/update")
	public void  updateMtcecharplan(@RequestBody Mtcecharplan mtcecharplan) {
		mtcecharplanMapper.updateMtcecharplan(mtcecharplan.getCPId());
		log.debug(mtcecharplan.toString());
	}

	@PostMapping("/save")
	public void saveMtcecharplan(@RequestBody Mtcecharplan mtcecharplan){
		mtcecharplanMapper.saveMtcecharplan(mtcecharplan);
		log.debug(mtcecharplan.toString());
	}

	@DeleteMapping("/delete/{cPId}")
	public void  deleteMtcecharplan(@PathVariable(value = "cPId") Integer cPId) {
		mtcecharplanMapper.deleteMtcecharplan(cPId);
	}


}
