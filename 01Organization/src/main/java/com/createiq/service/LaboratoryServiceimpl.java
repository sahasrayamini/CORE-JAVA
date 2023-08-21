package com.createiq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.createiq.DTO.LaboratoryDTO;
import com.createiq.Entities.Laboratory;
import com.createiq.dao.LaboratoryDao;

@Service
public class LaboratoryServiceimpl implements LaboratoryService{

	@Autowired
	private LaboratoryDao  laboratoryDao;

	@Override
	public Laboratory save(LaboratoryDTO laboratoryDTO) {
		Laboratory lab=Laboratory.builder()
				.lname(laboratoryDTO.getLname())
				.LabCordinator(laboratoryDTO.getLabCordinator())
				.build();
		return laboratoryDao.save(lab);
	}

	@Override
	public List<Laboratory> findAll() {
		return laboratoryDao.findAll();
	}
	
}
