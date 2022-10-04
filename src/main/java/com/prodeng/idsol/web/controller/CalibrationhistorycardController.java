package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Calibrationhistorycard;
import com.prodeng.idsol.dao.mapper.CalibrationhistorycardMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calibrationhistorycard")
@Slf4j
public class CalibrationhistorycardController{

	@Autowired
	private CalibrationhistorycardMapper calibrationhistorycardMapper;

	@GetMapping("/")
	public List<Calibrationhistorycard> getAllCalibrationhistorycard() {
		List<Calibrationhistorycard> calibrationhistorycards = calibrationhistorycardMapper.getAllCalibrationhistorycard();
		return calibrationhistorycards;
	}

	@GetMapping("/{cHCId}")
	public Calibrationhistorycard getCalibrationhistorycard(@PathVariable(value = "cHCId") Integer cHCId) {
		Calibrationhistorycard calibrationhistorycard = calibrationhistorycardMapper.getCalibrationhistorycard(cHCId);
		log.debug(calibrationhistorycard.toString());
		return calibrationhistorycard;
	}

	@PutMapping("/update")
	public void  updateCalibrationhistorycard(@RequestBody Calibrationhistorycard calibrationhistorycard) {
		calibrationhistorycardMapper.updateCalibrationhistorycard(calibrationhistorycard.getCHCId());
		log.debug(calibrationhistorycard.toString());
	}

	@PostMapping("/save")
	public void saveCalibrationhistorycard(@RequestBody Calibrationhistorycard calibrationhistorycard){
		calibrationhistorycardMapper.saveCalibrationhistorycard(calibrationhistorycard);
		log.debug(calibrationhistorycard.toString());
	}

	@DeleteMapping("/delete/{cHCId}")
	public void  deleteCalibrationhistorycard(@PathVariable(value = "cHCId") Integer cHCId) {
		calibrationhistorycardMapper.deleteCalibrationhistorycard(cHCId);
	}


}
