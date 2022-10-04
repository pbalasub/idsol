package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Calibrationhistorycarddetails;
import com.prodeng.idsol.dao.mapper.CalibrationhistorycarddetailsMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calibrationhistorycarddetails")
@Slf4j
public class CalibrationhistorycarddetailsController{

	@Autowired
	private CalibrationhistorycarddetailsMapper calibrationhistorycarddetailsMapper;

	@GetMapping("/")
	public List<Calibrationhistorycarddetails> getAllCalibrationhistorycarddetails() {
		List<Calibrationhistorycarddetails> calibrationhistorycarddetailss = calibrationhistorycarddetailsMapper.getAllCalibrationhistorycarddetails();
		return calibrationhistorycarddetailss;
	}

	@GetMapping("/{cHCId}/{serialNo}")
	public Calibrationhistorycarddetails getCalibrationhistorycarddetails(@PathVariable(value = "cHCId") Integer cHCId, @PathVariable(value = "serialNo") Integer serialNo) {
		Calibrationhistorycarddetails calibrationhistorycarddetails = calibrationhistorycarddetailsMapper.getCalibrationhistorycarddetails(cHCId,serialNo);
		log.debug(calibrationhistorycarddetails.toString());
		return calibrationhistorycarddetails;
	}

	@PutMapping("/update")
	public void  updateCalibrationhistorycarddetails(@RequestBody Calibrationhistorycarddetails calibrationhistorycarddetails) {
		calibrationhistorycarddetailsMapper.updateCalibrationhistorycarddetails(calibrationhistorycarddetails);
		log.debug(calibrationhistorycarddetails.toString());
	}

	@PostMapping("/save")
	public void saveCalibrationhistorycarddetails(@RequestBody Calibrationhistorycarddetails calibrationhistorycarddetails){
		calibrationhistorycarddetailsMapper.saveCalibrationhistorycarddetails(calibrationhistorycarddetails);
		log.debug(calibrationhistorycarddetails.toString());
	}

	@DeleteMapping("/delete/{cHCId}/{serialNo}")
	public void  deleteCalibrationhistorycarddetails(@PathVariable(value = "cHCId") Integer cHCId, @PathVariable(value = "serialNo") Integer serialNo) {
		calibrationhistorycarddetailsMapper.deleteCalibrationhistorycarddetails(cHCId,serialNo);
	}


}
