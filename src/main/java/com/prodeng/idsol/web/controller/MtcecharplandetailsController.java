package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Mtcecharplandetails;
import com.prodeng.idsol.dao.mapper.MtcecharplandetailsMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/mtcecharplandetails")
@Slf4j
public class MtcecharplandetailsController{

	@Autowired
	private MtcecharplandetailsMapper mtcecharplandetailsMapper;

	@GetMapping("/")
	public List<Mtcecharplandetails> getAllMtcecharplandetails() {
		List<Mtcecharplandetails> mtcecharplandetailss = mtcecharplandetailsMapper.getAllMtcecharplandetails();
		return mtcecharplandetailss;
	}

	@GetMapping("/{cPId}/{serialNo}")
	public Mtcecharplandetails getMtcecharplandetails(@PathVariable(value = "cPId") Integer cPId, @PathVariable(value = "serialNo") Integer serialNo) {
		Mtcecharplandetails mtcecharplandetails = mtcecharplandetailsMapper.getMtcecharplandetails(cPId,serialNo);
		log.debug(mtcecharplandetails.toString());
		return mtcecharplandetails;
	}

	@PutMapping("/update")
	public void  updateMtcecharplandetails(@RequestBody Mtcecharplandetails mtcecharplandetails) {
		mtcecharplandetailsMapper.updateMtcecharplandetails(mtcecharplandetails);
		log.debug(mtcecharplandetails.toString());
	}

	@PostMapping("/save")
	public void saveMtcecharplandetails(@RequestBody Mtcecharplandetails mtcecharplandetails){
		mtcecharplandetailsMapper.saveMtcecharplandetails(mtcecharplandetails);
		log.debug(mtcecharplandetails.toString());
	}

	@DeleteMapping("/delete/{cPId}/{serialNo}")
	public void  deleteMtcecharplandetails(@PathVariable(value = "cPId") Integer cPId, @PathVariable(value = "serialNo") Integer serialNo) {
		mtcecharplandetailsMapper.deleteMtcecharplandetails(cPId,serialNo);
	}


}
