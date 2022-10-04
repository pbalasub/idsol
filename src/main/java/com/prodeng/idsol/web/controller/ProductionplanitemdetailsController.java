package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Productionplanitemdetails;
import com.prodeng.idsol.dao.mapper.ProductionplanitemdetailsMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/productionplanitemdetails")
@Slf4j
public class ProductionplanitemdetailsController{

	@Autowired
	private ProductionplanitemdetailsMapper productionplanitemdetailsMapper;

	@GetMapping("/")
	public List<Productionplanitemdetails> getAllProductionplanitemdetails() {
		List<Productionplanitemdetails> productionplanitemdetailss = productionplanitemdetailsMapper.getAllProductionplanitemdetails();
		return productionplanitemdetailss;
	}

	@GetMapping("/{pPId}/{itemCode}/{serialNo}")
	public Productionplanitemdetails getProductionplanitemdetails(@PathVariable(value = "pPId") Integer pPId, @PathVariable(value = "itemCode") String itemCode, @PathVariable(value = "serialNo") Integer serialNo) {
		Productionplanitemdetails productionplanitemdetails = productionplanitemdetailsMapper.getProductionplanitemdetails(pPId,itemCode,serialNo);
		log.debug(productionplanitemdetails.toString());
		return productionplanitemdetails;
	}

	@PutMapping("/update")
	public void  updateProductionplanitemdetails(@RequestBody Productionplanitemdetails productionplanitemdetails) {
		productionplanitemdetailsMapper.updateProductionplanitemdetails(productionplanitemdetails);
		log.debug(productionplanitemdetails.toString());
	}

	@PostMapping("/save")
	public void saveProductionplanitemdetails(@RequestBody Productionplanitemdetails productionplanitemdetails){
		productionplanitemdetailsMapper.saveProductionplanitemdetails(productionplanitemdetails);
		log.debug(productionplanitemdetails.toString());
	}

	@DeleteMapping("/delete/{pPId}/{itemCode}/{serialNo}")
	public void  deleteProductionplanitemdetails(@PathVariable(value = "pPId") Integer pPId, @PathVariable(value = "itemCode") String itemCode, @PathVariable(value = "serialNo") Integer serialNo) {
		productionplanitemdetailsMapper.deleteProductionplanitemdetails(pPId,itemCode,serialNo);
	}


}
