package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Itemmastercostotherheads;
import com.prodeng.idsol.dao.mapper.ItemmastercostotherheadsMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/itemmastercostotherheads")
@Slf4j
public class ItemmastercostotherheadsController{

	@Autowired
	private ItemmastercostotherheadsMapper itemmastercostotherheadsMapper;

	@GetMapping("/")
	public List<Itemmastercostotherheads> getAllItemmastercostotherheads() {
		List<Itemmastercostotherheads> itemmastercostotherheadss = itemmastercostotherheadsMapper.getAllItemmastercostotherheads();
		return itemmastercostotherheadss;
	}

	@GetMapping("/{mainCategory}/{subCategory}/{itemCode}/{accHeadCode}")
	public Itemmastercostotherheads getItemmastercostotherheads(@PathVariable(value = "mainCategory") String mainCategory, @PathVariable(value = "subCategory") String subCategory, @PathVariable(value = "itemCode") String itemCode, @PathVariable(value = "accHeadCode") String accHeadCode) {
		Itemmastercostotherheads itemmastercostotherheads = itemmastercostotherheadsMapper.getItemmastercostotherheads(mainCategory,subCategory,itemCode,accHeadCode);
		log.debug(itemmastercostotherheads.toString());
		return itemmastercostotherheads;
	}

	@PutMapping("/update")
	public void  updateItemmastercostotherheads(@RequestBody Itemmastercostotherheads itemmastercostotherheads) {
		itemmastercostotherheadsMapper.updateItemmastercostotherheads(itemmastercostotherheads);
		log.debug(itemmastercostotherheads.toString());
	}

	@PostMapping("/save")
	public void saveItemmastercostotherheads(@RequestBody Itemmastercostotherheads itemmastercostotherheads){
		itemmastercostotherheadsMapper.saveItemmastercostotherheads(itemmastercostotherheads);
		log.debug(itemmastercostotherheads.toString());
	}

	@DeleteMapping("/delete/{mainCategory}/{subCategory}/{itemCode}/{accHeadCode}")
	public void  deleteItemmastercostotherheads(@PathVariable(value = "mainCategory") String mainCategory, @PathVariable(value = "subCategory") String subCategory, @PathVariable(value = "itemCode") String itemCode, @PathVariable(value = "accHeadCode") String accHeadCode) {
		itemmastercostotherheadsMapper.deleteItemmastercostotherheads(mainCategory,subCategory,itemCode,accHeadCode);
	}


}
