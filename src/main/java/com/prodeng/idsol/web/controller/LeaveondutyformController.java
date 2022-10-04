package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Leaveondutyform;
import com.prodeng.idsol.dao.mapper.LeaveondutyformMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/leaveondutyform")
@Slf4j
public class LeaveondutyformController{

	@Autowired
	private LeaveondutyformMapper leaveondutyformMapper;

	@GetMapping("/")
	public List<Leaveondutyform> getAllLeaveondutyform() {
		List<Leaveondutyform> leaveondutyforms = leaveondutyformMapper.getAllLeaveondutyform();
		return leaveondutyforms;
	}

	@GetMapping("/{lofNo}")
	public Leaveondutyform getLeaveondutyform(@PathVariable(value = "lofNo") String lofNo) {
		Leaveondutyform leaveondutyform = leaveondutyformMapper.getLeaveondutyform(lofNo);
		log.debug(leaveondutyform.toString());
		return leaveondutyform;
	}

	@PutMapping("/update")
	public void  updateLeaveondutyform(@RequestBody Leaveondutyform leaveondutyform) {
		leaveondutyformMapper.updateLeaveondutyform(String.valueOf(leaveondutyform));
		log.debug(leaveondutyform.toString());
	}

	@PostMapping("/save")
	public void saveLeaveondutyform(@RequestBody Leaveondutyform leaveondutyform){
		leaveondutyformMapper.saveLeaveondutyform(leaveondutyform);
		log.debug(leaveondutyform.toString());
	}

	@DeleteMapping("/delete/{lofNo}")
	public void  deleteLeaveondutyform(@PathVariable(value = "lofNo") String lofNo) {
		leaveondutyformMapper.deleteLeaveondutyform(lofNo);
	}


}
