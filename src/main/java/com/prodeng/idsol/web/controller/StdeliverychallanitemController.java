package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Stdeliverychallanitem;
import com.prodeng.idsol.dao.mapper.StdeliverychallanitemMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/stdeliverychallanitem")
@Slf4j
public class StdeliverychallanitemController{

	@Autowired
	private StdeliverychallanitemMapper stdeliverychallanitemMapper;

	@GetMapping("/")
	public List<Stdeliverychallanitem> getAllStdeliverychallanitem() {
		List<Stdeliverychallanitem> stdeliverychallanitems = stdeliverychallanitemMapper.getAllStdeliverychallanitem();
		return stdeliverychallanitems;
	}

	@GetMapping("/{dCId}/{serialNo}")
	public Stdeliverychallanitem getStdeliverychallanitem(@PathVariable(value = "dCId") Integer dCId, @PathVariable(value = "serialNo") Integer serialNo) {
		Stdeliverychallanitem stdeliverychallanitem = stdeliverychallanitemMapper.getStdeliverychallanitem(dCId,serialNo);
		log.debug(stdeliverychallanitem.toString());
		return stdeliverychallanitem;
	}

	@PutMapping("/update")
	public void  updateStdeliverychallanitem(@RequestBody Stdeliverychallanitem stdeliverychallanitem) {
		stdeliverychallanitemMapper.updateStdeliverychallanitem(stdeliverychallanitem);
		log.debug(stdeliverychallanitem.toString());
	}

	@PostMapping("/save")
	public void saveStdeliverychallanitem(@RequestBody Stdeliverychallanitem stdeliverychallanitem){
		stdeliverychallanitemMapper.saveStdeliverychallanitem(stdeliverychallanitem);
		log.debug(stdeliverychallanitem.toString());
	}

	@DeleteMapping("/delete/{dCId}/{serialNo}")
	public void  deleteStdeliverychallanitem(@PathVariable(value = "dCId") Integer dCId, @PathVariable(value = "serialNo") Integer serialNo) {
		stdeliverychallanitemMapper.deleteStdeliverychallanitem(dCId,serialNo);
	}


}
