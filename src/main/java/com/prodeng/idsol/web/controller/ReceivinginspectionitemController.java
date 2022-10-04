package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Receivinginspectionitem;
import com.prodeng.idsol.dao.mapper.ReceivinginspectionitemMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/receivinginspectionitem")
@Slf4j
public class ReceivinginspectionitemController{

	@Autowired
	private ReceivinginspectionitemMapper receivinginspectionitemMapper;

	@GetMapping("/")
	public List<Receivinginspectionitem> getAllReceivinginspectionitem() {
		List<Receivinginspectionitem> receivinginspectionitems = receivinginspectionitemMapper.getAllReceivinginspectionitem();
		return receivinginspectionitems;
	}

	@GetMapping("/{rIId}/{serialNo}")
	public Receivinginspectionitem getReceivinginspectionitem(@PathVariable(value = "rIId") Integer rIId, @PathVariable(value = "serialNo") Integer serialNo) {
		Receivinginspectionitem receivinginspectionitem = receivinginspectionitemMapper.getReceivinginspectionitem(rIId,serialNo);
		log.debug(receivinginspectionitem.toString());
		return receivinginspectionitem;
	}

	@PutMapping("/update")
	public void  updateReceivinginspectionitem(@RequestBody Receivinginspectionitem receivinginspectionitem) {
		receivinginspectionitemMapper.updateReceivinginspectionitem(receivinginspectionitem);
		log.debug(receivinginspectionitem.toString());
	}

	@PostMapping("/save")
	public void saveReceivinginspectionitem(@RequestBody Receivinginspectionitem receivinginspectionitem){
		receivinginspectionitemMapper.saveReceivinginspectionitem(receivinginspectionitem);
		log.debug(receivinginspectionitem.toString());
	}

	@DeleteMapping("/delete/{rIId}/{serialNo}")
	public void  deleteReceivinginspectionitem(@PathVariable(value = "rIId") Integer rIId, @PathVariable(value = "serialNo") Integer serialNo) {
		receivinginspectionitemMapper.deleteReceivinginspectionitem(rIId,serialNo);
	}


}
