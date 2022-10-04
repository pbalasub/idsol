package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Processmasteritem;
import com.prodeng.idsol.dao.mapper.ProcessmasteritemMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/processmasteritem")
@Slf4j
public class ProcessmasteritemController{

	@Autowired
	private ProcessmasteritemMapper processmasteritemMapper;

	@GetMapping("/")
	public List<Processmasteritem> getAllProcessmasteritem() {
		List<Processmasteritem> processmasteritems = processmasteritemMapper.getAllProcessmasteritem();
		return processmasteritems;
	}

	@GetMapping("/{mainCategory}/{subCategory}/{itemCode}/{serialNo}")
	public Processmasteritem getProcessmasteritem(@PathVariable(value = "mainCategory") String mainCategory, @PathVariable(value = "subCategory") String subCategory, @PathVariable(value = "itemCode") String itemCode, @PathVariable(value = "serialNo") Integer serialNo) {
		Processmasteritem processmasteritem = processmasteritemMapper.getProcessmasteritem(mainCategory,subCategory,itemCode,serialNo);
		log.debug(processmasteritem.toString());
		return processmasteritem;
	}

	@PutMapping("/update")
	public void  updateProcessmasteritem(@RequestBody Processmasteritem processmasteritem) {
		processmasteritemMapper.updateProcessmasteritem(processmasteritem);
		log.debug(processmasteritem.toString());
	}

	@PostMapping("/save")
	public void saveProcessmasteritem(@RequestBody Processmasteritem processmasteritem){
		processmasteritemMapper.saveProcessmasteritem(processmasteritem);
		log.debug(processmasteritem.toString());
	}

	@DeleteMapping("/delete/{mainCategory}/{subCategory}/{itemCode}/{serialNo}")
	public void  deleteProcessmasteritem(@PathVariable(value = "mainCategory") String mainCategory, @PathVariable(value = "subCategory") String subCategory, @PathVariable(value = "itemCode") String itemCode, @PathVariable(value = "serialNo") Integer serialNo) {
		processmasteritemMapper.deleteProcessmasteritem(mainCategory,subCategory,itemCode,serialNo);
	}


}
