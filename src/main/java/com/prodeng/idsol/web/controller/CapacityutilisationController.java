package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Capacityutilisation;
import com.prodeng.idsol.dao.mapper.CapacityutilisationMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/capacityutilisation")
@Slf4j
public class CapacityutilisationController{

	@Autowired
	private CapacityutilisationMapper capacityutilisationMapper;

	@GetMapping("/")
	public List<Capacityutilisation> getAllCapacityutilisation() {
		List<Capacityutilisation> capacityutilisations = capacityutilisationMapper.getAllCapacityutilisation();
		return capacityutilisations;
	}

	@GetMapping("/{cUId}")
	public Capacityutilisation getCapacityutilisation(@PathVariable(value = "cUId") Integer cUId) {
		Capacityutilisation capacityutilisation = capacityutilisationMapper.getCapacityutilisation(cUId);
		log.debug(capacityutilisation.toString());
		return capacityutilisation;
	}

	@PutMapping("/update")
	public void  updateCapacityutilisation(@RequestBody Capacityutilisation capacityutilisation) {
		capacityutilisationMapper.updateCapacityutilisation(capacityutilisation.getCUId());
		log.debug(capacityutilisation.toString());
	}

	@PostMapping("/save")
	public void saveCapacityutilisation(@RequestBody Capacityutilisation capacityutilisation){
		capacityutilisationMapper.saveCapacityutilisation(capacityutilisation);
		log.debug(capacityutilisation.toString());
	}

	@DeleteMapping("/delete/{cUId}")
	public void  deleteCapacityutilisation(@PathVariable(value = "cUId") Integer cUId) {
		capacityutilisationMapper.deleteCapacityutilisation(cUId);
	}


}
