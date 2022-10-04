package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Mtcebreakdetails;
import com.prodeng.idsol.dao.mapper.MtcebreakdetailsMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/mtcebreakdetails")
@Slf4j
public class MtcebreakdetailsController{

	@Autowired
	private MtcebreakdetailsMapper mtcebreakdetailsMapper;

	@GetMapping("/")
	public List<Mtcebreakdetails> getAllMtcebreakdetails() {
		List<Mtcebreakdetails> mtcebreakdetailss = mtcebreakdetailsMapper.getAllMtcebreakdetails();
		return mtcebreakdetailss;
	}

	@GetMapping("/{bSId}")
	public Mtcebreakdetails getMtcebreakdetails(@PathVariable(value = "bSId") Integer bSId) {
		Mtcebreakdetails mtcebreakdetails = mtcebreakdetailsMapper.getMtcebreakdetails(bSId);
		log.debug(mtcebreakdetails.toString());
		return mtcebreakdetails;
	}

	@PutMapping("/update")
	public void  updateMtcebreakdetails(@RequestBody Mtcebreakdetails mtcebreakdetails) {
		mtcebreakdetailsMapper.updateMtcebreakdetails(mtcebreakdetails);
		log.debug(mtcebreakdetails.toString());
	}

	@PostMapping("/save")
	public void saveMtcebreakdetails(@RequestBody Mtcebreakdetails mtcebreakdetails){
		mtcebreakdetailsMapper.saveMtcebreakdetails(mtcebreakdetails);
		log.debug(mtcebreakdetails.toString());
	}

	@DeleteMapping("/delete/{bSId}")
	public void  deleteMtcebreakdetails(@PathVariable(value = "bSId") Integer bSId) {
		mtcebreakdetailsMapper.deleteMtcebreakdetails(bSId);
	}


}
