package com.createiq.service;

import java.util.List;

import com.createiq.entity.MaintenanceScedule;

public interface MaintenanceSceduleService {
	
	public MaintenanceScedule save(MaintenanceScedule maintenanceScedule);
	
	List<MaintenanceScedule> findAll();
	

}
