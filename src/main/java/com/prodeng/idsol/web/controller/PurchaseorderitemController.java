package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Purchaseorderitem;
import com.prodeng.idsol.dao.mapper.PurchaseorderitemMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/purchaseorderitem")
@Slf4j
public class PurchaseorderitemController{

	@Autowired
	private PurchaseorderitemMapper purchaseorderitemMapper;

	@GetMapping("/")
	public List<Purchaseorderitem> getAllPurchaseorderitem() {
		List<Purchaseorderitem> purchaseorderitems = purchaseorderitemMapper.getAllPurchaseorderitem();
		return purchaseorderitems;
	}

	@GetMapping("/{pOId}/{serialNo}")
	public Purchaseorderitem getPurchaseorderitem(@PathVariable(value = "pOId") Integer pOId, @PathVariable(value = "serialNo") Integer serialNo) {
		Purchaseorderitem purchaseorderitem = purchaseorderitemMapper.getPurchaseorderitem(pOId,serialNo);
		log.debug(purchaseorderitem.toString());
		return purchaseorderitem;
	}

	@PutMapping("/update")
	public void  updatePurchaseorderitem(@RequestBody Purchaseorderitem purchaseorderitem) {
		purchaseorderitemMapper.updatePurchaseorderitem(purchaseorderitem);
		log.debug(purchaseorderitem.toString());
	}

	@PostMapping("/save")
	public void savePurchaseorderitem(@RequestBody Purchaseorderitem purchaseorderitem){
		purchaseorderitemMapper.savePurchaseorderitem(purchaseorderitem);
		log.debug(purchaseorderitem.toString());
	}

	@DeleteMapping("/delete/{pOId}/{serialNo}")
	public void  deletePurchaseorderitem(@PathVariable(value = "pOId") Integer pOId, @PathVariable(value = "serialNo") Integer serialNo) {
		purchaseorderitemMapper.deletePurchaseorderitem(pOId,serialNo);
	}


}
