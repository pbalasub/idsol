package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Suggestiondetailsrecord;
import com.prodeng.idsol.dao.mapper.SuggestiondetailsrecordMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/suggestiondetailsrecord")
@Slf4j
public class SuggestiondetailsrecordController{

	@Autowired
	private SuggestiondetailsrecordMapper suggestiondetailsrecordMapper;

	@GetMapping("/")
	public List<Suggestiondetailsrecord> getAllSuggestiondetailsrecord() {
		List<Suggestiondetailsrecord> suggestiondetailsrecords = suggestiondetailsrecordMapper.getAllSuggestiondetailsrecord();
		return suggestiondetailsrecords;
	}

	@GetMapping("/{suggestionNo}")
	public Suggestiondetailsrecord getSuggestiondetailsrecord(@PathVariable(value = "suggestionNo") String suggestionNo) {
		Suggestiondetailsrecord suggestiondetailsrecord = suggestiondetailsrecordMapper.getSuggestiondetailsrecord(suggestionNo);
		log.debug(suggestiondetailsrecord.toString());
		return suggestiondetailsrecord;
	}

	@PutMapping("/update")
	public void  updateSuggestiondetailsrecord(@RequestBody Suggestiondetailsrecord suggestiondetailsrecord) {
		suggestiondetailsrecordMapper.updateSuggestiondetailsrecord(String.valueOf(suggestiondetailsrecord));
		log.debug(suggestiondetailsrecord.toString());
	}

	@PostMapping("/save")
	public void saveSuggestiondetailsrecord(@RequestBody Suggestiondetailsrecord suggestiondetailsrecord){
		suggestiondetailsrecordMapper.saveSuggestiondetailsrecord(suggestiondetailsrecord);
		log.debug(suggestiondetailsrecord.toString());
	}

	@DeleteMapping("/delete/{suggestionNo}")
	public void  deleteSuggestiondetailsrecord(@PathVariable(value = "suggestionNo") String suggestionNo) {
		suggestiondetailsrecordMapper.deleteSuggestiondetailsrecord(suggestionNo);
	}


}
