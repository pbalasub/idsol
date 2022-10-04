package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Mtcemasterplandetails;
import com.prodeng.idsol.dao.mapper.MtcemasterplandetailsMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/mtcemasterplandetails")
@Slf4j
public class MtcemasterplandetailsController{

	@Autowired
	private MtcemasterplandetailsMapper mtcemasterplandetailsMapper;

	@GetMapping("/")
	public List<Mtcemasterplandetails> getAllMtcemasterplandetails() {
		List<Mtcemasterplandetails> mtcemasterplandetailss = mtcemasterplandetailsMapper.getAllMtcemasterplandetails();
		return mtcemasterplandetailss;
	}

	@GetMapping("/{mPId}/{serialNo}")
	public Mtcemasterplandetails getMtcemasterplandetails(@PathVariable(value = "mPId") Integer mPId, @PathVariable(value = "serialNo") Integer serialNo) {
		Mtcemasterplandetails mtcemasterplandetails = mtcemasterplandetailsMapper.getMtcemasterplandetails(mPId,serialNo);
		log.debug(mtcemasterplandetails.toString());
		return mtcemasterplandetails;
	}

	@PutMapping("/update")
	public void  updateMtcemasterplandetails(@RequestBody Mtcemasterplandetails mtcemasterplandetails) {
		mtcemasterplandetailsMapper.updateMtcemasterplandetails(mtcemasterplandetails);
		log.debug(mtcemasterplandetails.toString());
	}

	@PostMapping("/save")
	public void saveMtcemasterplandetails(@RequestBody Mtcemasterplandetails mtcemasterplandetails){
		mtcemasterplandetailsMapper.saveMtcemasterplandetails(mtcemasterplandetails);
		log.debug(mtcemasterplandetails.toString());
	}

	@DeleteMapping("/delete/{mPId}/{serialNo}")
	public void  deleteMtcemasterplandetails(@PathVariable(value = "mPId") Integer mPId, @PathVariable(value = "serialNo") Integer serialNo) {
		mtcemasterplandetailsMapper.deleteMtcemasterplandetails(mPId,serialNo);
	}


}
