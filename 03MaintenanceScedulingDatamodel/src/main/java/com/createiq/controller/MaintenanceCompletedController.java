package com.createiq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.createiq.entity.MaintenanceCompletedDetails;
import com.createiq.service.MaintenanceCompletedServiceimpl;

@RestController
@RequestMapping("/completedmaintenance")
public class MaintenanceCompletedController {
	
	@Autowired
	private MaintenanceCompletedServiceimpl completedServiceimpl;
	
	@PostMapping
	public MaintenanceCompletedDetails save(@RequestBody MaintenanceCompletedDetails completedDetails) {
		return completedServiceimpl.save(completedDetails);
		
	}
	
	@GetMapping
	public List<MaintenanceCompletedDetails> findall(){
		return completedServiceimpl.findAll();
		
	}
	

}
