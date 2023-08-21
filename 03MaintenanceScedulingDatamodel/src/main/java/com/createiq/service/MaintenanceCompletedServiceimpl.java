package com.createiq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.createiq.entity.MaintenanceCompletedDetails;
import com.createiq.repository.MaintenanceCompletedRepository;

@Service
public class MaintenanceCompletedServiceimpl implements MaintenanceCompletedService{

	@Autowired
	private MaintenanceCompletedRepository completedRepository;
	
	@Override
	public MaintenanceCompletedDetails save(MaintenanceCompletedDetails completedDetails) {
		return completedRepository.save(completedDetails);
	}

	@Override
	public List<MaintenanceCompletedDetails> findAll() {
		return completedRepository.findAll();
	}

}
