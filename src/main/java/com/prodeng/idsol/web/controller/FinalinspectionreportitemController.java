package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Finalinspectionreportitem;
import com.prodeng.idsol.dao.mapper.FinalinspectionreportitemMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/finalinspectionreportitem")
@Slf4j
public class FinalinspectionreportitemController{

	@Autowired
	private FinalinspectionreportitemMapper finalinspectionreportitemMapper;

	@GetMapping("/")
	public List<Finalinspectionreportitem> getAllFinalinspectionreportitem() {
		List<Finalinspectionreportitem> finalinspectionreportitems = finalinspectionreportitemMapper.getAllFinalinspectionreportitem();
		return finalinspectionreportitems;
	}

	@GetMapping("/{fIRId}/{serialNo}")
	public Finalinspectionreportitem getFinalinspectionreportitem(@PathVariable(value = "fIRId") Integer fIRId, @PathVariable(value = "serialNo") Integer serialNo) {
		Finalinspectionreportitem finalinspectionreportitem = finalinspectionreportitemMapper.getFinalinspectionreportitem(fIRId,serialNo);
		log.debug(finalinspectionreportitem.toString());
		return finalinspectionreportitem;
	}

	@PutMapping("/update")
	public void  updateFinalinspectionreportitem(@RequestBody Finalinspectionreportitem finalinspectionreportitem) {
		finalinspectionreportitemMapper.updateFinalinspectionreportitem(finalinspectionreportitem);
		log.debug(finalinspectionreportitem.toString());
	}

	@PostMapping("/save")
	public void saveFinalinspectionreportitem(@RequestBody Finalinspectionreportitem finalinspectionreportitem){
		finalinspectionreportitemMapper.saveFinalinspectionreportitem(finalinspectionreportitem);
		log.debug(finalinspectionreportitem.toString());
	}

	@DeleteMapping("/delete/{fIRId}/{serialNo}")
	public void  deleteFinalinspectionreportitem(@PathVariable(value = "fIRId") Integer fIRId, @PathVariable(value = "serialNo") Integer serialNo) {
		finalinspectionreportitemMapper.deleteFinalinspectionreportitem(fIRId,serialNo);
	}


}
