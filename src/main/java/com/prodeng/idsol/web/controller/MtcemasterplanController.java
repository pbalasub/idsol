package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Mtcemasterplan;
import com.prodeng.idsol.dao.mapper.MtcemasterplanMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/mtcemasterplan")
@Slf4j
public class MtcemasterplanController{

	@Autowired
	private MtcemasterplanMapper mtcemasterplanMapper;

	@GetMapping("/")
	public List<Mtcemasterplan> getAllMtcemasterplan() {
		List<Mtcemasterplan> mtcemasterplans = mtcemasterplanMapper.getAllMtcemasterplan();
		return mtcemasterplans;
	}

	@GetMapping("/{mPId}")
	public Mtcemasterplan getMtcemasterplan(@PathVariable(value = "mPId") Integer mPId) {
		Mtcemasterplan mtcemasterplan = mtcemasterplanMapper.getMtcemasterplan(mPId);
		log.debug(mtcemasterplan.toString());
		return mtcemasterplan;
	}

	@PutMapping("/update")
	public void  updateMtcemasterplan(@RequestBody Mtcemasterplan mtcemasterplan) {
		mtcemasterplanMapper.updateMtcemasterplan(mtcemasterplan.getMPId());
		log.debug(mtcemasterplan.toString());
	}

	@PostMapping("/save")
	public void saveMtcemasterplan(@RequestBody Mtcemasterplan mtcemasterplan){
		mtcemasterplanMapper.saveMtcemasterplan(mtcemasterplan);
		log.debug(mtcemasterplan.toString());
	}

	@DeleteMapping("/delete/{mPId}")
	public void  deleteMtcemasterplan(@PathVariable(value = "mPId") Integer mPId) {
		mtcemasterplanMapper.deleteMtcemasterplan(mPId);
	}


}
