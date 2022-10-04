package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Iacmaster;
import com.prodeng.idsol.dao.mapper.IacmasterMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/iacmaster")
@Slf4j
public class IacmasterController{

	@Autowired
	private IacmasterMapper iacmasterMapper;

	@GetMapping("/")
	public List<Iacmaster> getAllIacmaster() {
		List<Iacmaster> iacmasters = iacmasterMapper.getAllIacmaster();
		return iacmasters;
	}

	@GetMapping("/{iACCode}")
	public Iacmaster getIacmaster(@PathVariable(value = "iACCode") String iACCode) {
		Iacmaster iacmaster = iacmasterMapper.getIacmaster(iACCode);
		log.debug(iacmaster.toString());
		return iacmaster;
	}

	@PutMapping("/update")
	public void  updateIacmaster(@RequestBody Iacmaster iacmaster) {
		iacmasterMapper.updateIacmaster(String.valueOf(iacmaster));
		log.debug(iacmaster.toString());
	}

	@PostMapping("/save")
	public void saveIacmaster(@RequestBody Iacmaster iacmaster){
		iacmasterMapper.saveIacmaster(iacmaster);
		log.debug(iacmaster.toString());
	}

	@DeleteMapping("/delete/{iACCode}")
	public void  deleteIacmaster(@PathVariable(value = "iACCode") String iACCode) {
		iacmasterMapper.deleteIacmaster(iACCode);
	}


}
