package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Seqgen;
import com.prodeng.idsol.dao.mapper.SeqgenMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/seqgen")
@Slf4j
public class SeqgenController{

	@Autowired
	private SeqgenMapper seqgenMapper;

	@GetMapping("/")
	public List<Seqgen> getAllSeqgen() {
		List<Seqgen> seqgens = seqgenMapper.getAllSeqgen();
		return seqgens;
	}

	@GetMapping("/{prefix}/{seqType}")
	public Seqgen getSeqgen(@PathVariable(value = "prefix") String prefix, @PathVariable(value = "seqType") String seqType) {
		Seqgen seqgen = seqgenMapper.getSeqgen(prefix,seqType);
		log.debug(seqgen.toString());
		return seqgen;
	}

	@PutMapping("/update")
	public void  updateSeqgen(@RequestBody Seqgen seqgen) {
		seqgenMapper.updateSeqgen(seqgen);
		log.debug(seqgen.toString());
	}

	@PostMapping("/save")
	public void saveSeqgen(@RequestBody Seqgen seqgen){
		seqgenMapper.saveSeqgen(seqgen);
		log.debug(seqgen.toString());
	}

	@DeleteMapping("/delete/{prefix}/{seqType}")
	public void  deleteSeqgen(@PathVariable(value = "prefix") String prefix, @PathVariable(value = "seqType") String seqType) {
		seqgenMapper.deleteSeqgen(prefix,seqType);
	}


}
