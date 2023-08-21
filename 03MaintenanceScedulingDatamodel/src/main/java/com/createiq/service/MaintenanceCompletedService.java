package com.createiq.service;

import java.util.List;

import com.createiq.entity.MaintenanceCompletedDetails;

public interface MaintenanceCompletedService {
	
	public MaintenanceCompletedDetails save(MaintenanceCompletedDetails completedDetails);
	
	List<MaintenanceCompletedDetails> findAll();
 
}
