package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Enquiryformrequest;
import com.prodeng.idsol.dao.mapper.EnquiryformrequestMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/enquiryformrequest")
@Slf4j
public class EnquiryformrequestController{

	@Autowired
	private EnquiryformrequestMapper enquiryformrequestMapper;

	@GetMapping("/")
	public List<Enquiryformrequest> getAllEnquiryformrequest() {
		List<Enquiryformrequest> enquiryformrequests = enquiryformrequestMapper.getAllEnquiryformrequest();
		return enquiryformrequests;
	}

	@GetMapping("/{enquiryId}")
	public Enquiryformrequest getEnquiryformrequest(@PathVariable(value = "enquiryId") Integer enquiryId) {
		Enquiryformrequest enquiryformrequest = enquiryformrequestMapper.getEnquiryformrequest(enquiryId);
		log.debug(enquiryformrequest.toString());
		return enquiryformrequest;
	}

	@PutMapping("/update")
	public void  updateEnquiryformrequest(@RequestBody Enquiryformrequest enquiryformrequest) {
		enquiryformrequestMapper.updateEnquiryformrequest(enquiryformrequest.getEnquiryId());
		log.debug(enquiryformrequest.toString());
	}

	@PostMapping("/save")
	public void saveEnquiryformrequest(@RequestBody Enquiryformrequest enquiryformrequest){
		enquiryformrequestMapper.saveEnquiryformrequest(enquiryformrequest);
		log.debug(enquiryformrequest.toString());
	}

	@DeleteMapping("/delete/{enquiryId}")
	public void  deleteEnquiryformrequest(@PathVariable(value = "enquiryId") Integer enquiryId) {
		enquiryformrequestMapper.deleteEnquiryformrequest(enquiryId);
	}


}
