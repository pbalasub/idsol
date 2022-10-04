package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Finalinspectionreport;
import com.prodeng.idsol.dao.mapper.FinalinspectionreportMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/finalinspectionreport")
@Slf4j
public class FinalinspectionreportController{

	@Autowired
	private FinalinspectionreportMapper finalinspectionreportMapper;

	@GetMapping("/")
	public List<Finalinspectionreport> getAllFinalinspectionreport() {
		List<Finalinspectionreport> finalinspectionreports = finalinspectionreportMapper.getAllFinalinspectionreport();
		return finalinspectionreports;
	}

	@GetMapping("/{fIRId}")
	public Finalinspectionreport getFinalinspectionreport(@PathVariable(value = "fIRId") Integer fIRId) {
		Finalinspectionreport finalinspectionreport = finalinspectionreportMapper.getFinalinspectionreport(fIRId);
		log.debug(finalinspectionreport.toString());
		return finalinspectionreport;
	}

	@PutMapping("/update")
	public void  updateFinalinspectionreport(@RequestBody Finalinspectionreport finalinspectionreport) {
		finalinspectionreportMapper.updateFinalinspectionreport(finalinspectionreport);
		log.debug(finalinspectionreport.toString());
	}

	@PostMapping("/save")
	public void saveFinalinspectionreport(@RequestBody Finalinspectionreport finalinspectionreport){
		finalinspectionreportMapper.saveFinalinspectionreport(finalinspectionreport);
		log.debug(finalinspectionreport.toString());
	}

	@DeleteMapping("/delete/{fIRId}")
	public void  deleteFinalinspectionreport(@PathVariable(value = "fIRId") Integer fIRId) {
		finalinspectionreportMapper.deleteFinalinspectionreport(fIRId);
	}


}
