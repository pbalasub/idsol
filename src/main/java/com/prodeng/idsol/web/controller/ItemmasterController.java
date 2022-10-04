package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Itemmaster;
import com.prodeng.idsol.dao.mapper.ItemmasterMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/itemmaster")
@Slf4j
public class ItemmasterController{

	@Autowired
	private ItemmasterMapper itemmasterMapper;

	@GetMapping("/")
	public List<Itemmaster> getAllItemmaster() {
		List<Itemmaster> itemmasters = itemmasterMapper.getAllItemmaster();
		return itemmasters;
	}

	@GetMapping("/{itemCode}")
	public Itemmaster getItemmaster(@PathVariable(value = "itemCode") String itemCode) {
		Itemmaster itemmaster = itemmasterMapper.getItemmaster(itemCode);
		log.debug(itemmaster.toString());
		return itemmaster;
	}

	@PutMapping("/update")
	public void  updateItemmaster(@RequestBody Itemmaster itemmaster) {
		itemmasterMapper.updateItemmaster(String.valueOf(itemmaster));
		log.debug(itemmaster.toString());
	}

	@PostMapping("/save")
	public void saveItemmaster(@RequestBody Itemmaster itemmaster){
		itemmasterMapper.saveItemmaster(itemmaster);
		log.debug(itemmaster.toString());
	}

	@DeleteMapping("/delete/{itemCode}")
	public void  deleteItemmaster(@PathVariable(value = "itemCode") String itemCode) {
		itemmasterMapper.deleteItemmaster(itemCode);
	}


}
