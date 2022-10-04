package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Suppliermaster;
import com.prodeng.idsol.dao.mapper.SuppliermasterMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/suppliermaster")
@Slf4j
public class SuppliermasterController{

	@Autowired
	private SuppliermasterMapper suppliermasterMapper;

	@GetMapping("/")
	public List<Suppliermaster> getAllSuppliermaster() {
		List<Suppliermaster> suppliermasters = suppliermasterMapper.getAllSuppliermaster();
		return suppliermasters;
	}

	@GetMapping("/{supplierCode}")
	public Suppliermaster getSuppliermaster(@PathVariable(value = "supplierCode") String supplierCode) {
		Suppliermaster suppliermaster = suppliermasterMapper.getSuppliermaster(supplierCode);
		log.debug(suppliermaster.toString());
		return suppliermaster;
	}

	@PutMapping("/update")
	public void  updateSuppliermaster(@RequestBody Suppliermaster suppliermaster) {
		suppliermasterMapper.updateSuppliermaster(String.valueOf(suppliermaster));
		log.debug(suppliermaster.toString());
	}

	@PostMapping("/save")
	public void saveSuppliermaster(@RequestBody Suppliermaster suppliermaster){
		suppliermasterMapper.saveSuppliermaster(suppliermaster);
		log.debug(suppliermaster.toString());
	}

	@DeleteMapping("/delete/{supplierCode}")
	public void  deleteSuppliermaster(@PathVariable(value = "supplierCode") String supplierCode) {
		suppliermasterMapper.deleteSuppliermaster(supplierCode);
	}


}
