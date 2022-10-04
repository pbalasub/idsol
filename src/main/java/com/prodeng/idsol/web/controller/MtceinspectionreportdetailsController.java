package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Mtceinspectionreportdetails;
import com.prodeng.idsol.dao.mapper.MtceinspectionreportdetailsMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/mtceinspectionreportdetails")
@Slf4j
public class MtceinspectionreportdetailsController{

	@Autowired
	private MtceinspectionreportdetailsMapper mtceinspectionreportdetailsMapper;

	@GetMapping("/")
	public List<Mtceinspectionreportdetails> getAllMtceinspectionreportdetails() {
		List<Mtceinspectionreportdetails> mtceinspectionreportdetailss = mtceinspectionreportdetailsMapper.getAllMtceinspectionreportdetails();
		return mtceinspectionreportdetailss;
	}

	@GetMapping("/{iRId}/{serialNo}")
	public Mtceinspectionreportdetails getMtceinspectionreportdetails(@PathVariable(value = "iRId") Integer iRId, @PathVariable(value = "serialNo") Integer serialNo) {
		Mtceinspectionreportdetails mtceinspectionreportdetails = mtceinspectionreportdetailsMapper.getMtceinspectionreportdetails(iRId,serialNo);
		log.debug(mtceinspectionreportdetails.toString());
		return mtceinspectionreportdetails;
	}

	@PutMapping("/update")
	public void  updateMtceinspectionreportdetails(@RequestBody Mtceinspectionreportdetails mtceinspectionreportdetails) {
		mtceinspectionreportdetailsMapper.updateMtceinspectionreportdetails(mtceinspectionreportdetails);
		log.debug(mtceinspectionreportdetails.toString());
	}

	@PostMapping("/save")
	public void saveMtceinspectionreportdetails(@RequestBody Mtceinspectionreportdetails mtceinspectionreportdetails){
		mtceinspectionreportdetailsMapper.saveMtceinspectionreportdetails(mtceinspectionreportdetails);
		log.debug(mtceinspectionreportdetails.toString());
	}

	@DeleteMapping("/delete/{iRId}/{serialNo}")
	public void  deleteMtceinspectionreportdetails(@PathVariable(value = "iRId") Integer iRId, @PathVariable(value = "serialNo") Integer serialNo) {
		mtceinspectionreportdetailsMapper.deleteMtceinspectionreportdetails(iRId,serialNo);
	}


}
