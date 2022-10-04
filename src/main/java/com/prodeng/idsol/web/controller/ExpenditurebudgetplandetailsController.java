package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Expenditurebudgetplandetails;
import com.prodeng.idsol.dao.mapper.ExpenditurebudgetplandetailsMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/expenditurebudgetplandetails")
@Slf4j
public class ExpenditurebudgetplandetailsController{

	@Autowired
	private ExpenditurebudgetplandetailsMapper expenditurebudgetplandetailsMapper;

	@GetMapping("/")
	public List<Expenditurebudgetplandetails> getAllExpenditurebudgetplandetails() {
		List<Expenditurebudgetplandetails> expenditurebudgetplandetailss = expenditurebudgetplandetailsMapper.getAllExpenditurebudgetplandetails();
		return expenditurebudgetplandetailss;
	}

	@GetMapping("/{eBPId}/{accHeadCode}")
	public Expenditurebudgetplandetails getExpenditurebudgetplandetails(@PathVariable(value = "eBPId") Integer eBPId, @PathVariable(value = "accHeadCode") String accHeadCode) {
		Expenditurebudgetplandetails expenditurebudgetplandetails = expenditurebudgetplandetailsMapper.getExpenditurebudgetplandetails(eBPId,accHeadCode);
		log.debug(expenditurebudgetplandetails.toString());
		return expenditurebudgetplandetails;
	}

	@PutMapping("/update")
	public void  updateExpenditurebudgetplandetails(@RequestBody Expenditurebudgetplandetails expenditurebudgetplandetails) {
		expenditurebudgetplandetailsMapper.updateExpenditurebudgetplandetails(expenditurebudgetplandetails);
		log.debug(expenditurebudgetplandetails.toString());
	}

	@PostMapping("/save")
	public void saveExpenditurebudgetplandetails(@RequestBody Expenditurebudgetplandetails expenditurebudgetplandetails){
		expenditurebudgetplandetailsMapper.saveExpenditurebudgetplandetails(expenditurebudgetplandetails);
		log.debug(expenditurebudgetplandetails.toString());
	}

	@DeleteMapping("/delete/{eBPId}/{accHeadCode}")
	public void  deleteExpenditurebudgetplandetails(@PathVariable(value = "eBPId") Integer eBPId, @PathVariable(value = "accHeadCode") String accHeadCode) {
		expenditurebudgetplandetailsMapper.deleteExpenditurebudgetplandetails(eBPId,accHeadCode);
	}


}
