package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Manpowerrequisition;
import com.prodeng.idsol.dao.mapper.ManpowerrequisitionMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/manpowerrequisition")
@Slf4j
public class ManpowerrequisitionController{

	@Autowired
	private ManpowerrequisitionMapper manpowerrequisitionMapper;

	@GetMapping("/")
	public List<Manpowerrequisition> getAllManpowerrequisition() {
		List<Manpowerrequisition> manpowerrequisitions = manpowerrequisitionMapper.getAllManpowerrequisition();
		return manpowerrequisitions;
	}

	@GetMapping("/{mPRNo}")
	public Manpowerrequisition getManpowerrequisition(@PathVariable(value = "mPRNo") String mPRNo) {
		Manpowerrequisition manpowerrequisition = manpowerrequisitionMapper.getManpowerrequisition(mPRNo);
		log.debug(manpowerrequisition.toString());
		return manpowerrequisition;
	}

	@PutMapping("/update")
	public void  updateManpowerrequisition(@RequestBody Manpowerrequisition manpowerrequisition) {
		manpowerrequisitionMapper.updateManpowerrequisition(String.valueOf(manpowerrequisition));
		log.debug(manpowerrequisition.toString());
	}

	@PostMapping("/save")
	public void saveManpowerrequisition(@RequestBody Manpowerrequisition manpowerrequisition){
		manpowerrequisitionMapper.saveManpowerrequisition(manpowerrequisition);
		log.debug(manpowerrequisition.toString());
	}

	@DeleteMapping("/delete/{mPRNo}")
	public void  deleteManpowerrequisition(@PathVariable(value = "mPRNo") String mPRNo) {
		manpowerrequisitionMapper.deleteManpowerrequisition(mPRNo);
	}


}
