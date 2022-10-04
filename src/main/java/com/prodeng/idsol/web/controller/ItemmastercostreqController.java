package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Itemmastercostreq;
import com.prodeng.idsol.dao.mapper.ItemmastercostreqMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/itemmastercostreq")
@Slf4j
public class ItemmastercostreqController{

	@Autowired
	private ItemmastercostreqMapper itemmastercostreqMapper;

	@GetMapping("/")
	public List<Itemmastercostreq> getAllItemmastercostreq() {
		List<Itemmastercostreq> itemmastercostreqs = itemmastercostreqMapper.getAllItemmastercostreq();
		return itemmastercostreqs;
	}

	@GetMapping("/{mainCategory}/{subCategory}/{itemCode}/{reqItemCode}")
	public Itemmastercostreq getItemmastercostreq(@PathVariable(value = "mainCategory") String mainCategory, @PathVariable(value = "subCategory") String subCategory, @PathVariable(value = "itemCode") String itemCode, @PathVariable(value = "reqItemCode") String reqItemCode) {
		Itemmastercostreq itemmastercostreq = itemmastercostreqMapper.getItemmastercostreq(mainCategory,subCategory,itemCode,reqItemCode);
		log.debug(itemmastercostreq.toString());
		return itemmastercostreq;
	}

	@PutMapping("/update")
	public void  updateItemmastercostreq(@RequestBody Itemmastercostreq itemmastercostreq) {
		itemmastercostreqMapper.updateItemmastercostreq(itemmastercostreq);
		log.debug(itemmastercostreq.toString());
	}

	@PostMapping("/save")
	public void saveItemmastercostreq(@RequestBody Itemmastercostreq itemmastercostreq){
		itemmastercostreqMapper.saveItemmastercostreq(itemmastercostreq);
		log.debug(itemmastercostreq.toString());
	}

	@DeleteMapping("/delete/{mainCategory}/{subCategory}/{itemCode}/{reqItemCode}")
	public void  deleteItemmastercostreq(@PathVariable(value = "mainCategory") String mainCategory, @PathVariable(value = "subCategory") String subCategory, @PathVariable(value = "itemCode") String itemCode, @PathVariable(value = "reqItemCode") String reqItemCode) {
		itemmastercostreqMapper.deleteItemmastercostreq(mainCategory,subCategory,itemCode,reqItemCode);
	}


}
