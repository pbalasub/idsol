package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Capacityutilisationdetails;
import com.prodeng.idsol.dao.mapper.CapacityutilisationdetailsMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/capacityutilisationdetails")
@Slf4j
public class CapacityutilisationdetailsController{

	@Autowired
	private CapacityutilisationdetailsMapper capacityutilisationdetailsMapper;

	@GetMapping("/")
	public List<Capacityutilisationdetails> getAllCapacityutilisationdetails() {
		List<Capacityutilisationdetails> capacityutilisationdetailss = capacityutilisationdetailsMapper.getAllCapacityutilisationdetails();
		return capacityutilisationdetailss;
	}

	@GetMapping("/{cUId}/{serialNo}")
	public Capacityutilisationdetails getCapacityutilisationdetails(@PathVariable(value = "cUId") Integer cUId, @PathVariable(value = "serialNo") Integer serialNo) {
		Capacityutilisationdetails capacityutilisationdetails = capacityutilisationdetailsMapper.getCapacityutilisationdetails(cUId,serialNo);
		log.debug(capacityutilisationdetails.toString());
		return capacityutilisationdetails;
	}

	@PutMapping("/update")
	public void  updateCapacityutilisationdetails(@RequestBody Capacityutilisationdetails capacityutilisationdetails) {
		capacityutilisationdetailsMapper.updateCapacityutilisationdetails(capacityutilisationdetails);
		log.debug(capacityutilisationdetails.toString());
	}

	@PostMapping("/save")
	public void saveCapacityutilisationdetails(@RequestBody Capacityutilisationdetails capacityutilisationdetails){
		capacityutilisationdetailsMapper.saveCapacityutilisationdetails(capacityutilisationdetails);
		log.debug(capacityutilisationdetails.toString());
	}

	@DeleteMapping("/delete/{cUId}/{serialNo}")
	public void  deleteCapacityutilisationdetails(@PathVariable(value = "cUId") Integer cUId, @PathVariable(value = "serialNo") Integer serialNo) {
		capacityutilisationdetailsMapper.deleteCapacityutilisationdetails(cUId,serialNo);
	}


}
