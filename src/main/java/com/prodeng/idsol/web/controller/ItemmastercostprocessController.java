package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Itemmastercostprocess;
import com.prodeng.idsol.dao.mapper.ItemmastercostprocessMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/itemmastercostprocess")
@Slf4j
public class ItemmastercostprocessController{

	@Autowired
	private ItemmastercostprocessMapper itemmastercostprocessMapper;

	@GetMapping("/")
	public List<Itemmastercostprocess> getAllItemmastercostprocess() {
		List<Itemmastercostprocess> itemmastercostprocesss = itemmastercostprocessMapper.getAllItemmastercostprocess();
		return itemmastercostprocesss;
	}

	@GetMapping("/{mainCategory}/{subCategory}/{itemCode}/{suppCode}/{processFrom}/{processTo}")
	public Itemmastercostprocess getItemmastercostprocess(@PathVariable(value = "mainCategory") String mainCategory, @PathVariable(value = "subCategory") String subCategory, @PathVariable(value = "itemCode") String itemCode, @PathVariable(value = "suppCode") String suppCode, @PathVariable(value = "processFrom") String processFrom, @PathVariable(value = "processTo") String processTo) {
		Itemmastercostprocess itemmastercostprocess = itemmastercostprocessMapper.getItemmastercostprocess(mainCategory,subCategory,itemCode,suppCode,processFrom,processTo);
		log.debug(itemmastercostprocess.toString());
		return itemmastercostprocess;
	}

	@PutMapping("/update")
	public void  updateItemmastercostprocess(@RequestBody Itemmastercostprocess itemmastercostprocess) {
		itemmastercostprocessMapper.updateItemmastercostprocess(itemmastercostprocess);
		log.debug(itemmastercostprocess.toString());
	}

	@PostMapping("/save")
	public void saveItemmastercostprocess(@RequestBody Itemmastercostprocess itemmastercostprocess){
		itemmastercostprocessMapper.saveItemmastercostprocess(itemmastercostprocess);
		log.debug(itemmastercostprocess.toString());
	}

	@DeleteMapping("/delete/{mainCategory}/{subCategory}/{itemCode}/{suppCode}/{processFrom}/{processTo}")
	public void  deleteItemmastercostprocess(@PathVariable(value = "mainCategory") String mainCategory, @PathVariable(value = "subCategory") String subCategory, @PathVariable(value = "itemCode") String itemCode, @PathVariable(value = "suppCode") String suppCode, @PathVariable(value = "processFrom") String processFrom, @PathVariable(value = "processTo") String processTo) {
		itemmastercostprocessMapper.deleteItemmastercostprocess(mainCategory,subCategory,itemCode,suppCode,processFrom,processTo);
	}


}
