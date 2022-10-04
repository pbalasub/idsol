package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Paymentformiteminward;
import com.prodeng.idsol.dao.mapper.PaymentformiteminwardMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/paymentformiteminward")
@Slf4j
public class PaymentformiteminwardController{

	@Autowired
	private PaymentformiteminwardMapper paymentformiteminwardMapper;

	@GetMapping("/")
	public List<Paymentformiteminward> getAllPaymentformiteminward() {
		List<Paymentformiteminward> paymentformiteminwards = paymentformiteminwardMapper.getAllPaymentformiteminward();
		return paymentformiteminwards;
	}

	@GetMapping("/{paymentId}/{serialNo}/{inwardId}/{inwardSerialNo}")
	public Paymentformiteminward getPaymentformiteminward(@PathVariable(value = "paymentId") Integer paymentId, @PathVariable(value = "serialNo") Integer serialNo, @PathVariable(value = "inwardId") Integer inwardId, @PathVariable(value = "inwardSerialNo") Integer inwardSerialNo) {
		Paymentformiteminward paymentformiteminward = paymentformiteminwardMapper.getPaymentformiteminward(paymentId,serialNo,inwardId,inwardSerialNo);
		log.debug(paymentformiteminward.toString());
		return paymentformiteminward;
	}

	@PutMapping("/update")
	public void  updatePaymentformiteminward(@RequestBody Paymentformiteminward paymentformiteminward) {
		paymentformiteminwardMapper.updatePaymentformiteminward(paymentformiteminward);
		log.debug(paymentformiteminward.toString());
	}

	@PostMapping("/save")
	public void savePaymentformiteminward(@RequestBody Paymentformiteminward paymentformiteminward){
		paymentformiteminwardMapper.savePaymentformiteminward(paymentformiteminward);
		log.debug(paymentformiteminward.toString());
	}

	@DeleteMapping("/delete/{paymentId}/{serialNo}/{inwardId}/{inwardSerialNo}")
	public void  deletePaymentformiteminward(@PathVariable(value = "paymentId") Integer paymentId, @PathVariable(value = "serialNo") Integer serialNo, @PathVariable(value = "inwardId") Integer inwardId, @PathVariable(value = "inwardSerialNo") Integer inwardSerialNo) {
		paymentformiteminwardMapper.deletePaymentformiteminward(paymentId,serialNo,inwardId,inwardSerialNo);
	}


}
