package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Receivinginspectiondispersion;
import com.prodeng.idsol.dao.mapper.ReceivinginspectiondispersionMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/receivinginspectiondispersion")
@Slf4j
public class ReceivinginspectiondispersionController{

	@Autowired
	private ReceivinginspectiondispersionMapper receivinginspectiondispersionMapper;

	@GetMapping("/")
	public List<Receivinginspectiondispersion> getAllReceivinginspectiondispersion() {
		List<Receivinginspectiondispersion> receivinginspectiondispersions = receivinginspectiondispersionMapper.getAllReceivinginspectiondispersion();
		return receivinginspectiondispersions;
	}

	@GetMapping("/{rIId}")
	public Receivinginspectiondispersion getReceivinginspectiondispersion(@PathVariable(value = "rIId") Integer rIId) {
		Receivinginspectiondispersion receivinginspectiondispersion = receivinginspectiondispersionMapper.getReceivinginspectiondispersion(rIId);
		log.debug(receivinginspectiondispersion.toString());
		return receivinginspectiondispersion;
	}

	@PutMapping("/update")
	public void  updateReceivinginspectiondispersion(@RequestBody Receivinginspectiondispersion receivinginspectiondispersion) {
		receivinginspectiondispersionMapper.updateReceivinginspectiondispersion(receivinginspectiondispersion.getRIId());
		log.debug(receivinginspectiondispersion.toString());
	}

	@PostMapping("/save")
	public void saveReceivinginspectiondispersion(@RequestBody Receivinginspectiondispersion receivinginspectiondispersion){
		receivinginspectiondispersionMapper.saveReceivinginspectiondispersion(receivinginspectiondispersion);
		log.debug(receivinginspectiondispersion.toString());
	}

	@DeleteMapping("/delete/{rIId}")
	public void  deleteReceivinginspectiondispersion(@PathVariable(value = "rIId") Integer rIId) {
		receivinginspectiondispersionMapper.deleteReceivinginspectiondispersion(rIId);
	}


}
