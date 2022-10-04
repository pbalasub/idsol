package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Purchaserequest;
import com.prodeng.idsol.dao.mapper.PurchaserequestMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/purchaserequest")
@Slf4j
public class PurchaserequestController{

	@Autowired
	private PurchaserequestMapper purchaserequestMapper;

	@GetMapping("/")
	public List<Purchaserequest> getAllPurchaserequest() {
		List<Purchaserequest> purchaserequests = purchaserequestMapper.getAllPurchaserequest();
		return purchaserequests;
	}

	@GetMapping("/{pRId}")
	public Purchaserequest getPurchaserequest(@PathVariable(value = "pRId") Integer pRId) {
		Purchaserequest purchaserequest = purchaserequestMapper.getPurchaserequest(pRId);
		log.debug(purchaserequest.toString());
		return purchaserequest;
	}

	@PutMapping("/update")
	public void  updatePurchaserequest(@RequestBody Purchaserequest purchaserequest) {
		purchaserequestMapper.updatePurchaserequest(purchaserequest.getPRId());
		log.debug(purchaserequest.toString());
	}

	@PostMapping("/save")
	public void savePurchaserequest(@RequestBody Purchaserequest purchaserequest){
		purchaserequestMapper.savePurchaserequest(purchaserequest);
		log.debug(purchaserequest.toString());
	}

	@DeleteMapping("/delete/{pRId}")
	public void  deletePurchaserequest(@PathVariable(value = "pRId") Integer pRId) {
		purchaserequestMapper.deletePurchaserequest(pRId);
	}


}
