package com.prodeng.idsol.web.controller;

import com.prodeng.idsol.dao.entity.Menucomponent;
import com.prodeng.idsol.dao.mapper.MenucomponentMapper;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/menucomponent")
@Slf4j
public class MenucomponentController{

	@Autowired
	private MenucomponentMapper menucomponentMapper;

	@GetMapping("/")
	public List<Menucomponent> getAllMenucomponent() {
		List<Menucomponent> menucomponents = menucomponentMapper.getAllMenucomponent();
		return menucomponents;
	}

	@GetMapping("/{componentId}")
	public Menucomponent getMenucomponent(@PathVariable(value = "componentId") Integer componentId) {
		Menucomponent menucomponent = menucomponentMapper.getMenucomponent(componentId);
		log.debug(menucomponent.toString());
		return menucomponent;
	}

	@PutMapping("/update")
	public void  updateMenucomponent(@RequestBody Menucomponent menucomponent) {
		menucomponentMapper.updateMenucomponent(menucomponent);
		log.debug(menucomponent.toString());
	}

	@PostMapping("/save")
	public void saveMenucomponent(@RequestBody Menucomponent menucomponent){
		menucomponentMapper.saveMenucomponent(menucomponent);
		log.debug(menucomponent.toString());
	}

	@DeleteMapping("/delete/{componentId}")
	public void  deleteMenucomponent(@PathVariable(value = "componentId") Integer componentId) {
		menucomponentMapper.deleteMenucomponent(componentId);
	}


}
