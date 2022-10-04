package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Revenuebudgetplandetails;
import com.prodeng.idsol.dao.mapper.RevenuebudgetplandetailsMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/revenuebudgetplandetails")
@Slf4j
public class RevenuebudgetplandetailsController{

	@Autowired
	private RevenuebudgetplandetailsMapper revenuebudgetplandetailsMapper;

	@GetMapping("/")
	public List<Revenuebudgetplandetails> getAllRevenuebudgetplandetails() {
		List<Revenuebudgetplandetails> revenuebudgetplandetailss = revenuebudgetplandetailsMapper.getAllRevenuebudgetplandetails();
		return revenuebudgetplandetailss;
	}

	@GetMapping("/{rBPId}/{serialNo}")
	public Revenuebudgetplandetails getRevenuebudgetplandetails(@PathVariable(value = "rBPId") Integer rBPId, @PathVariable(value = "serialNo") Integer serialNo) {
		Revenuebudgetplandetails revenuebudgetplandetails = revenuebudgetplandetailsMapper.getRevenuebudgetplandetails(rBPId,serialNo);
		log.debug(revenuebudgetplandetails.toString());
		return revenuebudgetplandetails;
	}

	@PutMapping("/update")
	public void  updateRevenuebudgetplandetails(@RequestBody Revenuebudgetplandetails revenuebudgetplandetails) {
		revenuebudgetplandetailsMapper.updateRevenuebudgetplandetails(revenuebudgetplandetails);
		log.debug(revenuebudgetplandetails.toString());
	}

	@PostMapping("/save")
	public void saveRevenuebudgetplandetails(@RequestBody Revenuebudgetplandetails revenuebudgetplandetails){
		revenuebudgetplandetailsMapper.saveRevenuebudgetplandetails(revenuebudgetplandetails);
		log.debug(revenuebudgetplandetails.toString());
	}

	@DeleteMapping("/delete/{rBPId}/{serialNo}")
	public void  deleteRevenuebudgetplandetails(@PathVariable(value = "rBPId") Integer rBPId, @PathVariable(value = "serialNo") Integer serialNo) {
		revenuebudgetplandetailsMapper.deleteRevenuebudgetplandetails(rBPId,serialNo);
	}


}
