package com.createiq.service;

import java.util.List;

import com.createiq.DTO.LaboratoryDTO;
import com.createiq.Entities.Laboratory;


public interface LaboratoryService {
	
	public  Laboratory save(LaboratoryDTO laboratory);
	
	List<Laboratory> findAll();

}
