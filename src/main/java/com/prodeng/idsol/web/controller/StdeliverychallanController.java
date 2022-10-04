package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Stdeliverychallan;
import com.prodeng.idsol.dao.mapper.StdeliverychallanMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/stdeliverychallan")
@Slf4j
public class StdeliverychallanController{

	@Autowired
	private StdeliverychallanMapper stdeliverychallanMapper;

	@GetMapping("/")
	public List<Stdeliverychallan> getAllStdeliverychallan() {
		List<Stdeliverychallan> stdeliverychallans = stdeliverychallanMapper.getAllStdeliverychallan();
		return stdeliverychallans;
	}

	@GetMapping("/{dCId}")
	public Stdeliverychallan getStdeliverychallan(@PathVariable(value = "dCId") Integer dCId) {
		Stdeliverychallan stdeliverychallan = stdeliverychallanMapper.getStdeliverychallan(dCId);
		log.debug(stdeliverychallan.toString());
		return stdeliverychallan;
	}

	@PutMapping("/update")
	public void  updateStdeliverychallan(@RequestBody Stdeliverychallan stdeliverychallan) {
		stdeliverychallanMapper.updateStdeliverychallan(stdeliverychallan.getDCId());
		log.debug(stdeliverychallan.toString());
	}

	@PostMapping("/save")
	public void saveStdeliverychallan(@RequestBody Stdeliverychallan stdeliverychallan){
		stdeliverychallanMapper.saveStdeliverychallan(stdeliverychallan);
		log.debug(stdeliverychallan.toString());
	}

	@DeleteMapping("/delete/{dCId}")
	public void  deleteStdeliverychallan(@PathVariable(value = "dCId") Integer dCId) {
		stdeliverychallanMapper.deleteStdeliverychallan(dCId);
	}


}
