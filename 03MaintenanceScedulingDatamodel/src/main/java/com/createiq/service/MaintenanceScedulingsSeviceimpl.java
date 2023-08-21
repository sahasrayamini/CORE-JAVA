package com.createiq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.createiq.entity.MaintenanceScedule;
import com.createiq.repository.MaintenanceSceduleRepository;

@Service
public class MaintenanceScedulingsSeviceimpl implements MaintenanceSceduleService{

	
	@Autowired
	private MaintenanceSceduleRepository maintenanceSceduleRepository;
	
	@Override
	public MaintenanceScedule save(MaintenanceScedule maintenanceScedule) {
		return maintenanceSceduleRepository.save(maintenanceScedule);
	}

	@Override
	public List<MaintenanceScedule> findAll() {
		return maintenanceSceduleRepository.findAll();
	}

}
