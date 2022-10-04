package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Orderformrequest;
import com.prodeng.idsol.dao.mapper.OrderformrequestMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orderformrequest")
@Slf4j
public class OrderformrequestController{

	@Autowired
	private OrderformrequestMapper orderformrequestMapper;

	@GetMapping("/")
	public List<Orderformrequest> getAllOrderformrequest() {
		List<Orderformrequest> orderformrequests = orderformrequestMapper.getAllOrderformrequest();
		return orderformrequests;
	}

	@GetMapping("/{oFId}")
	public Orderformrequest getOrderformrequest(@PathVariable(value = "oFId") Integer oFId) {
		Orderformrequest orderformrequest = orderformrequestMapper.getOrderformrequest(oFId);
		log.debug(orderformrequest.toString());
		return orderformrequest;
	}

	@PutMapping("/update")
	public void  updateOrderformrequest(@RequestBody Orderformrequest orderformrequest) {
		orderformrequestMapper.updateOrderformrequest(orderformrequest.getOFId());
		log.debug(orderformrequest.toString());
	}

	@PostMapping("/save")
	public void saveOrderformrequest(@RequestBody Orderformrequest orderformrequest){
		orderformrequestMapper.saveOrderformrequest(orderformrequest);
		log.debug(orderformrequest.toString());
	}

	@DeleteMapping("/delete/{oFId}")
	public void  deleteOrderformrequest(@PathVariable(value = "oFId") Integer oFId) {
		orderformrequestMapper.deleteOrderformrequest(oFId);
	}


}
