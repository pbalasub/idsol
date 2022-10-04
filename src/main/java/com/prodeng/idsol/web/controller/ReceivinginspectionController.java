package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Receivinginspection;
import com.prodeng.idsol.dao.mapper.ReceivinginspectionMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/receivinginspection")
@Slf4j
public class ReceivinginspectionController{

	@Autowired
	private ReceivinginspectionMapper receivinginspectionMapper;

	@GetMapping("/")
	public List<Receivinginspection> getAllReceivinginspection() {
		List<Receivinginspection> receivinginspections = receivinginspectionMapper.getAllReceivinginspection();
		return receivinginspections;
	}

	@GetMapping("/{rIId}")
	public Receivinginspection getReceivinginspection(@PathVariable(value = "rIId") Integer rIId) {
		Receivinginspection receivinginspection = receivinginspectionMapper.getReceivinginspection(rIId);
		log.debug(receivinginspection.toString());
		return receivinginspection;
	}

	@PutMapping("/update")
	public void  updateReceivinginspection(@RequestBody Receivinginspection receivinginspection) {
		receivinginspectionMapper.updateReceivinginspection(receivinginspection.getRIId());
		log.debug(receivinginspection.toString());
	}

	@PostMapping("/save")
	public void saveReceivinginspection(@RequestBody Receivinginspection receivinginspection){
		receivinginspectionMapper.saveReceivinginspection(receivinginspection);
		log.debug(receivinginspection.toString());
	}

	@DeleteMapping("/delete/{rIId}")
	public void  deleteReceivinginspection(@PathVariable(value = "rIId") Integer rIId) {
		receivinginspectionMapper.deleteReceivinginspection(rIId);
	}


}
