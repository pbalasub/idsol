package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Paymentformitem;
import com.prodeng.idsol.dao.mapper.PaymentformitemMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/paymentformitem")
@Slf4j
public class PaymentformitemController{

	@Autowired
	private PaymentformitemMapper paymentformitemMapper;

	@GetMapping("/")
	public List<Paymentformitem> getAllPaymentformitem() {
		List<Paymentformitem> paymentformitems = paymentformitemMapper.getAllPaymentformitem();
		return paymentformitems;
	}

	@GetMapping("/{paymentId}/{serialNo}")
	public Paymentformitem getPaymentformitem(@PathVariable(value = "paymentId") Integer paymentId, @PathVariable(value = "serialNo") Integer serialNo) {
		Paymentformitem paymentformitem = paymentformitemMapper.getPaymentformitem(paymentId,serialNo);
		log.debug(paymentformitem.toString());
		return paymentformitem;
	}

	@PutMapping("/update")
	public void  updatePaymentformitem(@RequestBody Paymentformitem paymentformitem) {
		paymentformitemMapper.updatePaymentformitem(paymentformitem);
		log.debug(paymentformitem.toString());
	}

	@PostMapping("/save")
	public void savePaymentformitem(@RequestBody Paymentformitem paymentformitem){
		paymentformitemMapper.savePaymentformitem(paymentformitem);
		log.debug(paymentformitem.toString());
	}

	@DeleteMapping("/delete/{paymentId}/{serialNo}")
	public void  deletePaymentformitem(@PathVariable(value = "paymentId") Integer paymentId, @PathVariable(value = "serialNo") Integer serialNo) {
		paymentformitemMapper.deletePaymentformitem(paymentId,serialNo);
	}


}
