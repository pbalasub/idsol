package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Cashvoucher;
import com.prodeng.idsol.dao.mapper.CashvoucherMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cashvoucher")
@Slf4j
public class CashvoucherController{

	@Autowired
	private CashvoucherMapper cashvoucherMapper;

	@GetMapping("/")
	public List<Cashvoucher> getAllCashvoucher() {
		List<Cashvoucher> cashvouchers = cashvoucherMapper.getAllCashvoucher();
		return cashvouchers;
	}

	@GetMapping("/{cVId}")
	public Cashvoucher getCashvoucher(@PathVariable(value = "cVId") Integer cVId) {
		Cashvoucher cashvoucher = cashvoucherMapper.getCashvoucher(cVId);
		log.debug(cashvoucher.toString());
		return cashvoucher;
	}

	@PutMapping("/update")
	public void  updateCashvoucher(@RequestBody Cashvoucher cashvoucher) {
		cashvoucherMapper.updateCashvoucher(cashvoucher.getCVId());
		log.debug(cashvoucher.toString());
	}

	@PostMapping("/save")
	public void saveCashvoucher(@RequestBody Cashvoucher cashvoucher){
		cashvoucherMapper.saveCashvoucher(cashvoucher);
		log.debug(cashvoucher.toString());
	}

	@DeleteMapping("/delete/{cVId}")
	public void  deleteCashvoucher(@PathVariable(value = "cVId") Integer cVId) {
		cashvoucherMapper.deleteCashvoucher(cVId);
	}


}
