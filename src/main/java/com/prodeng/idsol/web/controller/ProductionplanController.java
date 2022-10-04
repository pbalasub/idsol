package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Productionplan;
import com.prodeng.idsol.dao.mapper.ProductionplanMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/productionplan")
@Slf4j
public class ProductionplanController{

	@Autowired
	private ProductionplanMapper productionplanMapper;

	@GetMapping("/")
	public List<Productionplan> getAllProductionplan() {
		List<Productionplan> productionplans = productionplanMapper.getAllProductionplan();
		return productionplans;
	}

	@GetMapping("/{pPId}")
	public Productionplan getProductionplan(@PathVariable(value = "pPId") Integer pPId) {
		Productionplan productionplan = productionplanMapper.getProductionplan(pPId);
		log.debug(productionplan.toString());
		return productionplan;
	}

	@PutMapping("/update")
	public void  updateProductionplan(@RequestBody Productionplan productionplan) {
		productionplanMapper.updateProductionplan(productionplan.getPPId());
		log.debug(productionplan.toString());
	}

	@PostMapping("/save")
	public void saveProductionplan(@RequestBody Productionplan productionplan){
		productionplanMapper.saveProductionplan(productionplan);
		log.debug(productionplan.toString());
	}

	@DeleteMapping("/delete/{pPId}")
	public void  deleteProductionplan(@PathVariable(value = "pPId") Integer pPId) {
		productionplanMapper.deleteProductionplan(pPId);
	}


}
