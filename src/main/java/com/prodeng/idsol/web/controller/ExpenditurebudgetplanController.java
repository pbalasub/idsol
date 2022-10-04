package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Expenditurebudgetplan;
import com.prodeng.idsol.dao.mapper.ExpenditurebudgetplanMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/expenditurebudgetplan")
@Slf4j
public class ExpenditurebudgetplanController{

	@Autowired
	private ExpenditurebudgetplanMapper expenditurebudgetplanMapper;

	@GetMapping("/")
	public List<Expenditurebudgetplan> getAllExpenditurebudgetplan() {
		List<Expenditurebudgetplan> expenditurebudgetplans = expenditurebudgetplanMapper.getAllExpenditurebudgetplan();
		return expenditurebudgetplans;
	}

	@GetMapping("/{eBPId}")
	public Expenditurebudgetplan getExpenditurebudgetplan(@PathVariable(value = "eBPId") Integer eBPId) {
		Expenditurebudgetplan expenditurebudgetplan = expenditurebudgetplanMapper.getExpenditurebudgetplan(eBPId);
		log.debug(expenditurebudgetplan.toString());
		return expenditurebudgetplan;
	}

	@PutMapping("/update")
	public void  updateExpenditurebudgetplan(@RequestBody Expenditurebudgetplan expenditurebudgetplan) {
		expenditurebudgetplanMapper.updateExpenditurebudgetplan(expenditurebudgetplan);
		log.debug(expenditurebudgetplan.toString());
	}

	@PostMapping("/save")
	public void saveExpenditurebudgetplan(@RequestBody Expenditurebudgetplan expenditurebudgetplan){
		expenditurebudgetplanMapper.saveExpenditurebudgetplan(expenditurebudgetplan);
		log.debug(expenditurebudgetplan.toString());
	}

	@DeleteMapping("/delete/{eBPId}")
	public void  deleteExpenditurebudgetplan(@PathVariable(value = "eBPId") Integer eBPId) {
		expenditurebudgetplanMapper.deleteExpenditurebudgetplan(eBPId);
	}


}
