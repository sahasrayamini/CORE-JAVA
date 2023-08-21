package com.createiq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.createiq.DTO.OrganizationDTO;
import com.createiq.Entities.Organization;
import com.createiq.service.OrganizationServiceimpl;

@RestController
@RequestMapping("/org")
public class OrganizationController {
	
	@Autowired
	private OrganizationServiceimpl organizationServiceimpl;
	
	
	@PostMapping
	public Organization save(OrganizationDTO organizationDTO) {
		return organizationServiceimpl.save(organizationDTO);
		
	}
	
	@GetMapping
	public List<Organization> findAll(){
		return organizationServiceimpl.findAll();
	}

}
