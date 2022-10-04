package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Productionentrymaster;
import com.prodeng.idsol.dao.mapper.ProductionentrymasterMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/productionentrymaster")
@Slf4j
public class ProductionentrymasterController{

	@Autowired
	private ProductionentrymasterMapper productionentrymasterMapper;

	@GetMapping("/")
	public List<Productionentrymaster> getAllProductionentrymaster() {
		List<Productionentrymaster> productionentrymasters = productionentrymasterMapper.getAllProductionentrymaster();
		return productionentrymasters;
	}

	@GetMapping("/{prodNo}")
	public Productionentrymaster getProductionentrymaster(@PathVariable(value = "prodNo") String prodNo) {
		Productionentrymaster productionentrymaster = productionentrymasterMapper.getProductionentrymaster(prodNo);
		log.debug(productionentrymaster.toString());
		return productionentrymaster;
	}

	@PutMapping("/update")
	public void  updateProductionentrymaster(@RequestBody Productionentrymaster productionentrymaster) {
		productionentrymasterMapper.updateProductionentrymaster(String.valueOf(productionentrymaster));
		log.debug(productionentrymaster.toString());
	}

	@PostMapping("/save")
	public void saveProductionentrymaster(@RequestBody Productionentrymaster productionentrymaster){
		productionentrymasterMapper.saveProductionentrymaster(productionentrymaster);
		log.debug(productionentrymaster.toString());
	}

	@DeleteMapping("/delete/{prodNo}")
	public void  deleteProductionentrymaster(@PathVariable(value = "prodNo") String prodNo) {
		productionentrymasterMapper.deleteProductionentrymaster(prodNo);
	}


}
