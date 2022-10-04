package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Purchaserequestitemsupplier;
import com.prodeng.idsol.dao.mapper.PurchaserequestitemsupplierMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/purchaserequestitemsupplier")
@Slf4j
public class PurchaserequestitemsupplierController{

	@Autowired
	private PurchaserequestitemsupplierMapper purchaserequestitemsupplierMapper;

	@GetMapping("/")
	public List<Purchaserequestitemsupplier> getAllPurchaserequestitemsupplier() {
		List<Purchaserequestitemsupplier> purchaserequestitemsuppliers = purchaserequestitemsupplierMapper.getAllPurchaserequestitemsupplier();
		return purchaserequestitemsuppliers;
	}

	@GetMapping("/{pRId}/{serialNo}/{suppSerialNo}")
	public Purchaserequestitemsupplier getPurchaserequestitemsupplier(@PathVariable(value = "pRId") Integer pRId, @PathVariable(value = "serialNo") Integer serialNo, @PathVariable(value = "suppSerialNo") Integer suppSerialNo) {
		Purchaserequestitemsupplier purchaserequestitemsupplier = purchaserequestitemsupplierMapper.getPurchaserequestitemsupplier(pRId,serialNo,suppSerialNo);
		log.debug(purchaserequestitemsupplier.toString());
		return purchaserequestitemsupplier;
	}

	@PutMapping("/update")
	public void  updatePurchaserequestitemsupplier(@RequestBody Purchaserequestitemsupplier purchaserequestitemsupplier) {
		purchaserequestitemsupplierMapper.updatePurchaserequestitemsupplier(purchaserequestitemsupplier);
		log.debug(purchaserequestitemsupplier.toString());
	}

	@PostMapping("/save")
	public void savePurchaserequestitemsupplier(@RequestBody Purchaserequestitemsupplier purchaserequestitemsupplier){
		purchaserequestitemsupplierMapper.savePurchaserequestitemsupplier(purchaserequestitemsupplier);
		log.debug(purchaserequestitemsupplier.toString());
	}

	@DeleteMapping("/delete/{pRId}/{serialNo}/{suppSerialNo}")
	public void  deletePurchaserequestitemsupplier(@PathVariable(value = "pRId") Integer pRId, @PathVariable(value = "serialNo") Integer serialNo, @PathVariable(value = "suppSerialNo") Integer suppSerialNo) {
		purchaserequestitemsupplierMapper.deletePurchaserequestitemsupplier(pRId,serialNo,suppSerialNo);
	}


}
