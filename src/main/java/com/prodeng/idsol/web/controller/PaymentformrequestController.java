package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Paymentformrequest;
import com.prodeng.idsol.dao.mapper.PaymentformrequestMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/paymentformrequest")
@Slf4j
public class PaymentformrequestController{

	@Autowired
	private PaymentformrequestMapper paymentformrequestMapper;

	@GetMapping("/")
	public List<Paymentformrequest> getAllPaymentformrequest() {
		List<Paymentformrequest> paymentformrequests = paymentformrequestMapper.getAllPaymentformrequest();
		return paymentformrequests;
	}

	@GetMapping("/{paymentId}")
	public Paymentformrequest getPaymentformrequest(@PathVariable(value = "paymentId") Integer paymentId) {
		Paymentformrequest paymentformrequest = paymentformrequestMapper.getPaymentformrequest(paymentId);
		log.debug(paymentformrequest.toString());
		return paymentformrequest;
	}

	@PutMapping("/update")
	public void  updatePaymentformrequest(@RequestBody Paymentformrequest paymentformrequest) {
		paymentformrequestMapper.updatePaymentformrequest(paymentformrequest.getPaymentId());
		log.debug(paymentformrequest.toString());
	}

	@PostMapping("/save")
	public void savePaymentformrequest(@RequestBody Paymentformrequest paymentformrequest){
		paymentformrequestMapper.savePaymentformrequest(paymentformrequest);
		log.debug(paymentformrequest.toString());
	}

	@DeleteMapping("/delete/{paymentId}")
	public void  deletePaymentformrequest(@PathVariable(value = "paymentId") Integer paymentId) {
		paymentformrequestMapper.deletePaymentformrequest(paymentId);
	}


}
