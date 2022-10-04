package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Revenuebudgetplan;
import com.prodeng.idsol.dao.mapper.RevenuebudgetplanMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/revenuebudgetplan")
@Slf4j
public class RevenuebudgetplanController{

	@Autowired
	private RevenuebudgetplanMapper revenuebudgetplanMapper;

	@GetMapping("/")
	public List<Revenuebudgetplan> getAllRevenuebudgetplan() {
		List<Revenuebudgetplan> revenuebudgetplans = revenuebudgetplanMapper.getAllRevenuebudgetplan();
		return revenuebudgetplans;
	}

	@GetMapping("/{rBPId}")
	public Revenuebudgetplan getRevenuebudgetplan(@PathVariable(value = "rBPId") Integer rBPId) {
		Revenuebudgetplan revenuebudgetplan = revenuebudgetplanMapper.getRevenuebudgetplan(rBPId);
		log.debug(revenuebudgetplan.toString());
		return revenuebudgetplan;
	}

	@PutMapping("/update")
	public void  updateRevenuebudgetplan(@RequestBody Revenuebudgetplan revenuebudgetplan) {
		revenuebudgetplanMapper.updateRevenuebudgetplan(revenuebudgetplan);
		log.debug(revenuebudgetplan.toString());
	}

	@PostMapping("/save")
	public void saveRevenuebudgetplan(@RequestBody Revenuebudgetplan revenuebudgetplan){
		revenuebudgetplanMapper.saveRevenuebudgetplan(revenuebudgetplan);
		log.debug(revenuebudgetplan.toString());
	}

	@DeleteMapping("/delete/{rBPId}")
	public void  deleteRevenuebudgetplan(@PathVariable(value = "rBPId") Integer rBPId) {
		revenuebudgetplanMapper.deleteRevenuebudgetplan(rBPId);
	}


}
