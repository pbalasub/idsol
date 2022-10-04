package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Purchaserequestitem;
import com.prodeng.idsol.dao.mapper.PurchaserequestitemMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/purchaserequestitem")
@Slf4j
public class PurchaserequestitemController{

	@Autowired
	private PurchaserequestitemMapper purchaserequestitemMapper;

	@GetMapping("/")
	public List<Purchaserequestitem> getAllPurchaserequestitem() {
		List<Purchaserequestitem> purchaserequestitems = purchaserequestitemMapper.getAllPurchaserequestitem();
		return purchaserequestitems;
	}

	@GetMapping("/{pRId}/{serialNo}")
	public Purchaserequestitem getPurchaserequestitem(@PathVariable(value = "pRId") Integer pRId, @PathVariable(value = "serialNo") Integer serialNo) {
		Purchaserequestitem purchaserequestitem = purchaserequestitemMapper.getPurchaserequestitem(pRId,serialNo);
		log.debug(purchaserequestitem.toString());
		return purchaserequestitem;
	}

	@PutMapping("/update")
	public void  updatePurchaserequestitem(@RequestBody Purchaserequestitem purchaserequestitem) {
		purchaserequestitemMapper.updatePurchaserequestitem(purchaserequestitem);
		log.debug(purchaserequestitem.toString());
	}

	@PostMapping("/save")
	public void savePurchaserequestitem(@RequestBody Purchaserequestitem purchaserequestitem){
		purchaserequestitemMapper.savePurchaserequestitem(purchaserequestitem);
		log.debug(purchaserequestitem.toString());
	}

	@DeleteMapping("/delete/{pRId}/{serialNo}")
	public void  deletePurchaserequestitem(@PathVariable(value = "pRId") Integer pRId, @PathVariable(value = "serialNo") Integer serialNo) {
		purchaserequestitemMapper.deletePurchaserequestitem(pRId,serialNo);
	}


}
