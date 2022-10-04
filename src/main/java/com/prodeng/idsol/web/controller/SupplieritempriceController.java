package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Supplieritemprice;
import com.prodeng.idsol.dao.mapper.SupplieritempriceMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/supplieritemprice")
@Slf4j
public class SupplieritempriceController{

	@Autowired
	private SupplieritempriceMapper supplieritempriceMapper;

	@GetMapping("/")
	public List<Supplieritemprice> getAllSupplieritemprice() {
		List<Supplieritemprice> supplieritemprices = supplieritempriceMapper.getAllSupplieritemprice();
		return supplieritemprices;
	}

	@GetMapping("/{supplierCode}/{itemCode}/{processFrom}/{processTo}")
	public Supplieritemprice getSupplieritemprice(@PathVariable(value = "supplierCode") String supplierCode, @PathVariable(value = "itemCode") String itemCode, @PathVariable(value = "processFrom") String processFrom, @PathVariable(value = "processTo") String processTo) {
		Supplieritemprice supplieritemprice = supplieritempriceMapper.getSupplieritemprice(supplierCode,itemCode,processFrom,processTo);
		log.debug(supplieritemprice.toString());
		return supplieritemprice;
	}

	@PutMapping("/update")
	public void  updateSupplieritemprice(@RequestBody Supplieritemprice supplieritemprice) {
		supplieritempriceMapper.updateSupplieritemprice(supplieritemprice);
		log.debug(supplieritemprice.toString());
	}

	@PostMapping("/save")
	public void saveSupplieritemprice(@RequestBody Supplieritemprice supplieritemprice){
		supplieritempriceMapper.saveSupplieritemprice(supplieritemprice);
		log.debug(supplieritemprice.toString());
	}

	@DeleteMapping("/delete/{supplierCode}/{itemCode}/{processFrom}/{processTo}")
	public void  deleteSupplieritemprice(@PathVariable(value = "supplierCode") String supplierCode, @PathVariable(value = "itemCode") String itemCode, @PathVariable(value = "processFrom") String processFrom, @PathVariable(value = "processTo") String processTo) {
		supplieritempriceMapper.deleteSupplieritemprice(supplierCode,itemCode,processFrom,processTo);
	}


}
