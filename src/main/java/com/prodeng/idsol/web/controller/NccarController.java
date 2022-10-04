package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Nccar;
import com.prodeng.idsol.dao.mapper.NccarMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/nccar")
@Slf4j
public class NccarController{

	@Autowired
	private NccarMapper nccarMapper;

	@GetMapping("/")
	public List<Nccar> getAllNccar() {
		List<Nccar> nccars = nccarMapper.getAllNccar();
		return nccars;
	}

	@GetMapping("/{nCCARNo}")
	public Nccar getNccar(@PathVariable(value = "nCCARNo") String nCCARNo) {
		Nccar nccar = nccarMapper.getNccar(nCCARNo);
		log.debug(nccar.toString());
		return nccar;
	}

	@PutMapping("/update")
	public void  updateNccar(@RequestBody Nccar nccar) {
		nccarMapper.updateNccar(String.valueOf(nccar));
		log.debug(nccar.toString());
	}

	@PostMapping("/save")
	public void saveNccar(@RequestBody Nccar nccar){
		nccarMapper.saveNccar(nccar);
		log.debug(nccar.toString());
	}

	@DeleteMapping("/delete/{nCCARNo}")
	public void  deleteNccar(@PathVariable(value = "nCCARNo") String nCCARNo) {
		nccarMapper.deleteNccar(nCCARNo);
	}


}
