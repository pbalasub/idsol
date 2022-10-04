package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Issuereceiptitemseg;
import com.prodeng.idsol.dao.mapper.IssuereceiptitemsegMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/issuereceiptitemseg")
@Slf4j
public class IssuereceiptitemsegController{

	@Autowired
	private IssuereceiptitemsegMapper issuereceiptitemsegMapper;

	@GetMapping("/")
	public List<Issuereceiptitemseg> getAllIssuereceiptitemseg() {
		List<Issuereceiptitemseg> issuereceiptitemsegs = issuereceiptitemsegMapper.getAllIssuereceiptitemseg();
		return issuereceiptitemsegs;
	}

	@GetMapping("/{iRId}/{serialNo}/{segType}/{characteristics}")
	public Issuereceiptitemseg getIssuereceiptitemseg(@PathVariable(value = "iRId") Integer iRId, @PathVariable(value = "serialNo") Integer serialNo, @PathVariable(value = "segType") String segType, @PathVariable(value = "characteristics") String characteristics) {
		Issuereceiptitemseg issuereceiptitemseg = issuereceiptitemsegMapper.getIssuereceiptitemseg(iRId,serialNo,segType,characteristics);
		log.debug(issuereceiptitemseg.toString());
		return issuereceiptitemseg;
	}

	@PutMapping("/update")
	public void  updateIssuereceiptitemseg(@RequestBody Issuereceiptitemseg issuereceiptitemseg) {
		issuereceiptitemsegMapper.updateIssuereceiptitemseg(issuereceiptitemseg);
		log.debug(issuereceiptitemseg.toString());
	}

	@PostMapping("/save")
	public void saveIssuereceiptitemseg(@RequestBody Issuereceiptitemseg issuereceiptitemseg){
		issuereceiptitemsegMapper.saveIssuereceiptitemseg(issuereceiptitemseg);
		log.debug(issuereceiptitemseg.toString());
	}

	@DeleteMapping("/delete/{iRId}/{serialNo}/{segType}/{characteristics}")
	public void  deleteIssuereceiptitemseg(@PathVariable(value = "iRId") Integer iRId, @PathVariable(value = "serialNo") Integer serialNo, @PathVariable(value = "segType") String segType, @PathVariable(value = "characteristics") String characteristics) {
		issuereceiptitemsegMapper.deleteIssuereceiptitemseg(iRId,serialNo,segType,characteristics);
	}


}
