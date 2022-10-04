package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Orderformitem;
import com.prodeng.idsol.dao.mapper.OrderformitemMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orderformitem")
@Slf4j
public class OrderformitemController{

	@Autowired
	private OrderformitemMapper orderformitemMapper;

	@GetMapping("/")
	public List<Orderformitem> getAllOrderformitem() {
		List<Orderformitem> orderformitems = orderformitemMapper.getAllOrderformitem();
		return orderformitems;
	}

	@GetMapping("/{oFId}/{serialNo}")
	public Orderformitem getOrderformitem(@PathVariable(value = "oFId") Integer oFId, @PathVariable(value = "serialNo") Integer serialNo) {
		Orderformitem orderformitem = orderformitemMapper.getOrderformitem(oFId,serialNo);
		log.debug(orderformitem.toString());
		return orderformitem;
	}

	@PutMapping("/update")
	public void  updateOrderformitem(@RequestBody Orderformitem orderformitem) {
		orderformitemMapper.updateOrderformitem(orderformitem);
		log.debug(orderformitem.toString());
	}

	@PostMapping("/save")
	public void saveOrderformitem(@RequestBody Orderformitem orderformitem){
		orderformitemMapper.saveOrderformitem(orderformitem);
		log.debug(orderformitem.toString());
	}

	@DeleteMapping("/delete/{oFId}/{serialNo}")
	public void  deleteOrderformitem(@PathVariable(value = "oFId") Integer oFId, @PathVariable(value = "serialNo") Integer serialNo) {
		orderformitemMapper.deleteOrderformitem(oFId,serialNo);
	}


}
