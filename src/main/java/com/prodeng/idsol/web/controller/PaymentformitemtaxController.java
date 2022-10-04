package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Paymentformitemtax;
import com.prodeng.idsol.dao.mapper.PaymentformitemtaxMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/paymentformitemtax")
@Slf4j
public class PaymentformitemtaxController{

	@Autowired
	private PaymentformitemtaxMapper paymentformitemtaxMapper;

	@GetMapping("/")
	public List<Paymentformitemtax> getAllPaymentformitemtax() {
		List<Paymentformitemtax> paymentformitemtaxs = paymentformitemtaxMapper.getAllPaymentformitemtax();
		return paymentformitemtaxs;
	}

	@GetMapping("/{paymentId}/{serialNo}/{taxCode}")
	public Paymentformitemtax getPaymentformitemtax(@PathVariable(value = "paymentId") Integer paymentId, @PathVariable(value = "serialNo") Integer serialNo, @PathVariable(value = "taxCode") String taxCode) {
		Paymentformitemtax paymentformitemtax = paymentformitemtaxMapper.getPaymentformitemtax(paymentId,serialNo,taxCode);
		log.debug(paymentformitemtax.toString());
		return paymentformitemtax;
	}

	@PutMapping("/update")
	public void  updatePaymentformitemtax(@RequestBody Paymentformitemtax paymentformitemtax) {
		paymentformitemtaxMapper.updatePaymentformitemtax(paymentformitemtax);
		log.debug(paymentformitemtax.toString());
	}

	@PostMapping("/save")
	public void savePaymentformitemtax(@RequestBody Paymentformitemtax paymentformitemtax){
		paymentformitemtaxMapper.savePaymentformitemtax(paymentformitemtax);
		log.debug(paymentformitemtax.toString());
	}

	@DeleteMapping("/delete/{paymentId}/{serialNo}/{taxCode}")
	public void  deletePaymentformitemtax(@PathVariable(value = "paymentId") Integer paymentId, @PathVariable(value = "serialNo") Integer serialNo, @PathVariable(value = "taxCode") String taxCode) {
		paymentformitemtaxMapper.deletePaymentformitemtax(paymentId,serialNo,taxCode);
	}


}
