package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Purchaseorder;
import com.prodeng.idsol.dao.mapper.PurchaseorderMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/purchaseorder")
@Slf4j
public class PurchaseorderController{

	@Autowired
	private PurchaseorderMapper purchaseorderMapper;

	@GetMapping("/")
	public List<Purchaseorder> getAllPurchaseorder() {
		List<Purchaseorder> purchaseorders = purchaseorderMapper.getAllPurchaseorder();
		return purchaseorders;
	}

	@GetMapping("/{pOId}")
	public Purchaseorder getPurchaseorder(@PathVariable(value = "pOId") Integer pOId) {
		Purchaseorder purchaseorder = purchaseorderMapper.getPurchaseorder(pOId);
		log.debug(purchaseorder.toString());
		return purchaseorder;
	}

	@PutMapping("/update")
	public void  updatePurchaseorder(@RequestBody Purchaseorder purchaseorder) {
		purchaseorderMapper.updatePurchaseorder(purchaseorder.getPOId());
		log.debug(purchaseorder.toString());
	}

	@PostMapping("/save")
	public void savePurchaseorder(@RequestBody Purchaseorder purchaseorder){
		purchaseorderMapper.savePurchaseorder(purchaseorder);
		log.debug(purchaseorder.toString());
	}

	@DeleteMapping("/delete/{pOId}")
	public void  deletePurchaseorder(@PathVariable(value = "pOId") Integer pOId) {
		purchaseorderMapper.deletePurchaseorder(pOId);
	}


}
