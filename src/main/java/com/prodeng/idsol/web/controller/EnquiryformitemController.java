package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Enquiryformitem;
import com.prodeng.idsol.dao.mapper.EnquiryformitemMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/enquiryformitem")
@Slf4j
public class EnquiryformitemController{

	@Autowired
	private EnquiryformitemMapper enquiryformitemMapper;

	@GetMapping("/")
	public List<Enquiryformitem> getAllEnquiryformitem() {
		List<Enquiryformitem> enquiryformitems = enquiryformitemMapper.getAllEnquiryformitem();
		return enquiryformitems;
	}

	@GetMapping("/{enquiryId}/{serialNo}")
	public Enquiryformitem getEnquiryformitem(@PathVariable(value = "enquiryId") Integer enquiryId, @PathVariable(value = "serialNo") Integer serialNo) {
		Enquiryformitem enquiryformitem = enquiryformitemMapper.getEnquiryformitem(enquiryId,serialNo);
		log.debug(enquiryformitem.toString());
		return enquiryformitem;
	}

	@PutMapping("/update")
	public void  updateEnquiryformitem(@RequestBody Enquiryformitem enquiryformitem) {
		enquiryformitemMapper.updateEnquiryformitem(enquiryformitem);
		log.debug(enquiryformitem.toString());
	}

	@PostMapping("/save")
	public void saveEnquiryformitem(@RequestBody Enquiryformitem enquiryformitem){
		enquiryformitemMapper.saveEnquiryformitem(enquiryformitem);
		log.debug(enquiryformitem.toString());
	}

	@DeleteMapping("/delete/{enquiryId}/{serialNo}")
	public void  deleteEnquiryformitem(@PathVariable(value = "enquiryId") Integer enquiryId, @PathVariable(value = "serialNo") Integer serialNo) {
		enquiryformitemMapper.deleteEnquiryformitem(enquiryId,serialNo);
	}


}
