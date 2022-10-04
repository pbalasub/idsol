package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Mtceinspectionreport;
import com.prodeng.idsol.dao.mapper.MtceinspectionreportMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/mtceinspectionreport")
@Slf4j
public class MtceinspectionreportController{

	@Autowired
	private MtceinspectionreportMapper mtceinspectionreportMapper;

	@GetMapping("/")
	public List<Mtceinspectionreport> getAllMtceinspectionreport() {
		List<Mtceinspectionreport> mtceinspectionreports = mtceinspectionreportMapper.getAllMtceinspectionreport();
		return mtceinspectionreports;
	}

	@GetMapping("/{iRId}")
	public Mtceinspectionreport getMtceinspectionreport(@PathVariable(value = "iRId") Integer iRId) {
		Mtceinspectionreport mtceinspectionreport = mtceinspectionreportMapper.getMtceinspectionreport(iRId);
		log.debug(mtceinspectionreport.toString());
		return mtceinspectionreport;
	}

	@PutMapping("/update")
	public void  updateMtceinspectionreport(@RequestBody Mtceinspectionreport mtceinspectionreport) {
		mtceinspectionreportMapper.updateMtceinspectionreport(mtceinspectionreport.getIRId());
		log.debug(mtceinspectionreport.toString());
	}

	@PostMapping("/save")
	public void saveMtceinspectionreport(@RequestBody Mtceinspectionreport mtceinspectionreport){
		mtceinspectionreportMapper.saveMtceinspectionreport(mtceinspectionreport);
		log.debug(mtceinspectionreport.toString());
	}

	@DeleteMapping("/delete/{iRId}")
	public void  deleteMtceinspectionreport(@PathVariable(value = "iRId") Integer iRId) {
		mtceinspectionreportMapper.deleteMtceinspectionreport(iRId);
	}


}
