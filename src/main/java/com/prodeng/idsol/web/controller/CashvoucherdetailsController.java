package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Cashvoucherdetails;
import com.prodeng.idsol.dao.mapper.CashvoucherdetailsMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cashvoucherdetails")
@Slf4j
public class CashvoucherdetailsController{

	@Autowired
	private CashvoucherdetailsMapper cashvoucherdetailsMapper;

	@GetMapping("/")
	public List<Cashvoucherdetails> getAllCashvoucherdetails() {
		List<Cashvoucherdetails> cashvoucherdetailss = cashvoucherdetailsMapper.getAllCashvoucherdetails();
		return cashvoucherdetailss;
	}

	@GetMapping("/{cVId}/{serialNo}")
	public Cashvoucherdetails getCashvoucherdetails(@PathVariable(value = "cVId") Integer cVId, @PathVariable(value = "serialNo") Integer serialNo) {
		Cashvoucherdetails cashvoucherdetails = cashvoucherdetailsMapper.getCashvoucherdetails(cVId,serialNo);
		log.debug(cashvoucherdetails.toString());
		return cashvoucherdetails;
	}

	@PutMapping("/update")
	public void  updateCashvoucherdetails(@RequestBody Cashvoucherdetails cashvoucherdetails) {
		cashvoucherdetailsMapper.updateCashvoucherdetails(cashvoucherdetails);
		log.debug(cashvoucherdetails.toString());
	}

	@PostMapping("/save")
	public void saveCashvoucherdetails(@RequestBody Cashvoucherdetails cashvoucherdetails){
		cashvoucherdetailsMapper.saveCashvoucherdetails(cashvoucherdetails);
		log.debug(cashvoucherdetails.toString());
	}

	@DeleteMapping("/delete/{cVId}/{serialNo}")
	public void  deleteCashvoucherdetails(@PathVariable(value = "cVId") Integer cVId, @PathVariable(value = "serialNo") Integer serialNo) {
		cashvoucherdetailsMapper.deleteCashvoucherdetails(cVId,serialNo);
	}


}
