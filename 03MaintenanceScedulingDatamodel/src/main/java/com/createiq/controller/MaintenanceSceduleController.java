package com.createiq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.createiq.entity.MaintenanceScedule;
import com.createiq.service.MaintenanceScedulingsSeviceimpl;

@RestController
@RequestMapping("/maintenance")
public class MaintenanceSceduleController {
	
	@Autowired
	private MaintenanceScedulingsSeviceimpl maintenanceScedulingsSeviceimpl;
	
	@PostMapping
	public MaintenanceScedule save(@RequestBody MaintenanceScedule maintenanceScedule) {
		return maintenanceScedulingsSeviceimpl.save(maintenanceScedule);
		
	}
	
	@GetMapping
	public List<MaintenanceScedule> findALL(){
		return maintenanceScedulingsSeviceimpl.findAll();
		
	}

}
