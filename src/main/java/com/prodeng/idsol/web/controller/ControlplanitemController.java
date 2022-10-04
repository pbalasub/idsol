package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Controlplanitem;
import com.prodeng.idsol.dao.mapper.ControlplanitemMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/controlplanitem")
@Slf4j
public class ControlplanitemController{

	@Autowired
	private ControlplanitemMapper controlplanitemMapper;

	@GetMapping("/")
	public List<Controlplanitem> getAllControlplanitem() {
		List<Controlplanitem> controlplanitems = controlplanitemMapper.getAllControlplanitem();
		return controlplanitems;
	}

	@GetMapping("/{cPId}/{serialNo}")
	public Controlplanitem getControlplanitem(@PathVariable(value = "cPId") Integer cPId, @PathVariable(value = "serialNo") Integer serialNo) {
		Controlplanitem controlplanitem = controlplanitemMapper.getControlplanitem(cPId,serialNo);
		log.debug(controlplanitem.toString());
		return controlplanitem;
	}

	@PutMapping("/update")
	public void  updateControlplanitem(@RequestBody Controlplanitem controlplanitem) {
		controlplanitemMapper.updateControlplanitem(controlplanitem);
		log.debug(controlplanitem.toString());
	}

	@PostMapping("/save")
	public void saveControlplanitem(@RequestBody Controlplanitem controlplanitem){
		controlplanitemMapper.saveControlplanitem(controlplanitem);
		log.debug(controlplanitem.toString());
	}

	@DeleteMapping("/delete/{cPId}/{serialNo}")
	public void  deleteControlplanitem(@PathVariable(value = "cPId") Integer cPId, @PathVariable(value = "serialNo") Integer serialNo) {
		controlplanitemMapper.deleteControlplanitem(cPId,serialNo);
	}


}
