package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Itemmastercost;
import com.prodeng.idsol.dao.mapper.ItemmastercostMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/itemmastercost")
@Slf4j
public class ItemmastercostController{

	@Autowired
	private ItemmastercostMapper itemmastercostMapper;

	@GetMapping("/")
	public List<Itemmastercost> getAllItemmastercost() {
		List<Itemmastercost> itemmastercosts = itemmastercostMapper.getAllItemmastercost();
		return itemmastercosts;
	}

	@GetMapping("/{mainCategory}/{subCategory}/{itemCode}")
	public Itemmastercost getItemmastercost(@PathVariable(value = "mainCategory") String mainCategory, @PathVariable(value = "subCategory") String subCategory, @PathVariable(value = "itemCode") String itemCode) {
		Itemmastercost itemmastercost = itemmastercostMapper.getItemmastercost(mainCategory,subCategory,itemCode);
		log.debug(itemmastercost.toString());
		return itemmastercost;
	}

	@PutMapping("/update")
	public void  updateItemmastercost(@RequestBody Itemmastercost itemmastercost) {
		itemmastercostMapper.updateItemmastercost(itemmastercost);
		log.debug(itemmastercost.toString());
	}

	@PostMapping("/save")
	public void saveItemmastercost(@RequestBody Itemmastercost itemmastercost){
		itemmastercostMapper.saveItemmastercost(itemmastercost);
		log.debug(itemmastercost.toString());
	}

	@DeleteMapping("/delete/{mainCategory}/{subCategory}/{itemCode}")
	public void  deleteItemmastercost(@PathVariable(value = "mainCategory") String mainCategory, @PathVariable(value = "subCategory") String subCategory, @PathVariable(value = "itemCode") String itemCode) {
		itemmastercostMapper.deleteItemmastercost(mainCategory,subCategory,itemCode);
	}


}
