package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Budgetmaster;
import com.prodeng.idsol.dao.mapper.BudgetmasterMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/budgetmaster")
@Slf4j
public class BudgetmasterController{

	@Autowired
	private BudgetmasterMapper budgetmasterMapper;

	@GetMapping("/")
	public List<Budgetmaster> getAllBudgetmaster() {
		List<Budgetmaster> budgetmasters = budgetmasterMapper.getAllBudgetmaster();
		return budgetmasters;
	}

	@GetMapping("/{sectionCode}/{month}/{year}")
	public Budgetmaster getBudgetmaster(@PathVariable(value = "sectionCode") String sectionCode, @PathVariable(value = "month") Integer month, @PathVariable(value = "year") Integer year) {
		Budgetmaster budgetmaster = budgetmasterMapper.getBudgetmaster(sectionCode,month,year);
		log.debug(budgetmaster.toString());
		return budgetmaster;
	}

	@PutMapping("/update")
	public void  updateBudgetmaster(@RequestBody Budgetmaster budgetmaster) {
		budgetmasterMapper.updateBudgetmaster(budgetmaster);
		log.debug(budgetmaster.toString());
	}

	@PostMapping("/save")
	public void saveBudgetmaster(@RequestBody Budgetmaster budgetmaster){
		budgetmasterMapper.saveBudgetmaster(budgetmaster);
		log.debug(budgetmaster.toString());
	}

	@DeleteMapping("/delete/{sectionCode}/{month}/{year}")
	public void  deleteBudgetmaster(@PathVariable(value = "sectionCode") String sectionCode, @PathVariable(value = "month") Integer month, @PathVariable(value = "year") Integer year) {
		budgetmasterMapper.deleteBudgetmaster(sectionCode,month,year);
	}


}
