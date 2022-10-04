package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Issuereceiptitem;
import com.prodeng.idsol.dao.mapper.IssuereceiptitemMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/issuereceiptitem")
@Slf4j
public class IssuereceiptitemController{

	@Autowired
	private IssuereceiptitemMapper issuereceiptitemMapper;

	@GetMapping("/")
	public List<Issuereceiptitem> getAllIssuereceiptitem() {
		List<Issuereceiptitem> issuereceiptitems = issuereceiptitemMapper.getAllIssuereceiptitem();
		return issuereceiptitems;
	}

	@GetMapping("/{iRId}/{serialNo}")
	public Issuereceiptitem getIssuereceiptitem(@PathVariable(value = "iRId") Integer iRId, @PathVariable(value = "serialNo") Integer serialNo) {
		Issuereceiptitem issuereceiptitem = issuereceiptitemMapper.getIssuereceiptitem(iRId,serialNo);
		log.debug(issuereceiptitem.toString());
		return issuereceiptitem;
	}

	@PutMapping("/update")
	public void  updateIssuereceiptitem(@RequestBody Issuereceiptitem issuereceiptitem) {
		issuereceiptitemMapper.updateIssuereceiptitem(issuereceiptitem);
		log.debug(issuereceiptitem.toString());
	}

	@PostMapping("/save")
	public void saveIssuereceiptitem(@RequestBody Issuereceiptitem issuereceiptitem){
		issuereceiptitemMapper.saveIssuereceiptitem(issuereceiptitem);
		log.debug(issuereceiptitem.toString());
	}

	@DeleteMapping("/delete/{iRId}/{serialNo}")
	public void  deleteIssuereceiptitem(@PathVariable(value = "iRId") Integer iRId, @PathVariable(value = "serialNo") Integer serialNo) {
		issuereceiptitemMapper.deleteIssuereceiptitem(iRId,serialNo);
	}


}
