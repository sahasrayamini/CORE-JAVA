package com.createiq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.createiq.DTO.LaboratoryDTO;
import com.createiq.Entities.Laboratory;
import com.createiq.service.LaboratoryServiceimpl;

@RestController
@RequestMapping("/laboratory")
public class LaboratoryController {
	@Autowired
	private LaboratoryServiceimpl laboratoryServiceimpl;
	
	@PostMapping
	public Laboratory save(LaboratoryDTO laboratoryDTO) {
		return laboratoryServiceimpl.save(laboratoryDTO);
		
	}
	
	@GetMapping
	public List<Laboratory> findAll(){
		return laboratoryServiceimpl.findAll();
		
	}

}
