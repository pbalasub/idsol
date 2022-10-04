package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Historymaster;
import com.prodeng.idsol.dao.mapper.HistorymasterMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/historymaster")
@Slf4j
public class HistorymasterController{

	@Autowired
	private HistorymasterMapper historymasterMapper;

	@GetMapping("/")
	public List<Historymaster> getAllHistorymaster() {
		List<Historymaster> historymasters = historymasterMapper.getAllHistorymaster();
		return historymasters;
	}

	@GetMapping("/{historyCode}")
	public Historymaster getHistorymaster(@PathVariable(value = "historyCode") String historyCode) {
		Historymaster historymaster = historymasterMapper.getHistorymaster(historyCode);
		log.debug(historymaster.toString());
		return historymaster;
	}

	@PutMapping("/update")
	public void  updateHistorymaster(@RequestBody Historymaster historymaster) {
		historymasterMapper.updateHistorymaster(String.valueOf(historymaster));
		log.debug(historymaster.toString());
	}

	@PostMapping("/save")
	public void saveHistorymaster(@RequestBody Historymaster historymaster){
		historymasterMapper.saveHistorymaster(historymaster);
		log.debug(historymaster.toString());
	}

	@DeleteMapping("/delete/{historyCode}")
	public void  deleteHistorymaster(@PathVariable(value = "historyCode") String historyCode) {
		historymasterMapper.deleteHistorymaster(historyCode);
	}


}
