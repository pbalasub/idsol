package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Orderitem;
import com.prodeng.idsol.dao.mapper.OrderitemMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orderitem")
@Slf4j
public class OrderitemController{

	@Autowired
	private OrderitemMapper orderitemMapper;

	@GetMapping("/")
	public List<Orderitem> getAllOrderitem() {
		List<Orderitem> orderitems = orderitemMapper.getAllOrderitem();
		return orderitems;
	}

	@GetMapping("/{oFNo}/{itemCode}/{specialChar1}/{specialChar2}/{specialChar3}/{specialChar4}/{specialChar5}")
	public Orderitem getOrderitem(@PathVariable(value = "oFNo") String oFNo, @PathVariable(value = "itemCode") String itemCode, @PathVariable(value = "specialChar1") String specialChar1, @PathVariable(value = "specialChar2") String specialChar2, @PathVariable(value = "specialChar3") String specialChar3, @PathVariable(value = "specialChar4") String specialChar4, @PathVariable(value = "specialChar5") String specialChar5) {
		Orderitem orderitem = orderitemMapper.getOrderitem(oFNo,itemCode,specialChar1,specialChar2,specialChar3,specialChar4,specialChar5);
		log.debug(orderitem.toString());
		return orderitem;
	}

	@PutMapping("/update")
	public void  updateOrderitem(@RequestBody Orderitem orderitem) {
		orderitemMapper.updateOrderitem(orderitem);
		log.debug(orderitem.toString());
	}

	@PostMapping("/save")
	public void saveOrderitem(@RequestBody Orderitem orderitem){
		orderitemMapper.saveOrderitem(orderitem);
		log.debug(orderitem.toString());
	}

	@DeleteMapping("/delete/{oFNo}/{itemCode}/{specialChar1}/{specialChar2}/{specialChar3}/{specialChar4}/{specialChar5}")
	public void  deleteOrderitem(@PathVariable(value = "oFNo") String oFNo, @PathVariable(value = "itemCode") String itemCode, @PathVariable(value = "specialChar1") String specialChar1, @PathVariable(value = "specialChar2") String specialChar2, @PathVariable(value = "specialChar3") String specialChar3, @PathVariable(value = "specialChar4") String specialChar4, @PathVariable(value = "specialChar5") String specialChar5) {
		orderitemMapper.deleteOrderitem(oFNo,itemCode,specialChar1,specialChar2,specialChar3,specialChar4,specialChar5);
	}


}
