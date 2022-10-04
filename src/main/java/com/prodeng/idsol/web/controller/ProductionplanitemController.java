package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Productionplanitem;
import com.prodeng.idsol.dao.mapper.ProductionplanitemMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/productionplanitem")
@Slf4j
public class ProductionplanitemController{

	@Autowired
	private ProductionplanitemMapper productionplanitemMapper;

	@GetMapping("/")
	public List<Productionplanitem> getAllProductionplanitem() {
		List<Productionplanitem> productionplanitems = productionplanitemMapper.getAllProductionplanitem();
		return productionplanitems;
	}

	@GetMapping("/{pPId}/{itemCode}")
	public Productionplanitem getProductionplanitem(@PathVariable(value = "pPId") Integer pPId, @PathVariable(value = "itemCode") String itemCode) {
		Productionplanitem productionplanitem = productionplanitemMapper.getProductionplanitem(pPId,itemCode);
		log.debug(productionplanitem.toString());
		return productionplanitem;
	}

	@PutMapping("/update")
	public void  updateProductionplanitem(@RequestBody Productionplanitem productionplanitem) {
		productionplanitemMapper.updateProductionplanitem(productionplanitem);
		log.debug(productionplanitem.toString());
	}

	@PostMapping("/save")
	public void saveProductionplanitem(@RequestBody Productionplanitem productionplanitem){
		productionplanitemMapper.saveProductionplanitem(productionplanitem);
		log.debug(productionplanitem.toString());
	}

	@DeleteMapping("/delete/{pPId}/{itemCode}")
	public void  deleteProductionplanitem(@PathVariable(value = "pPId") Integer pPId, @PathVariable(value = "itemCode") String itemCode) {
		productionplanitemMapper.deleteProductionplanitem(pPId,itemCode);
	}


}
