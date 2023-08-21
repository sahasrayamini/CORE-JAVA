package com.createiq.service;

import java.util.List;

import com.createiq.DTO.OrganizationDTO;
import com.createiq.Entities.Organization;

public interface OrganizationService {
	
	public Organization save(OrganizationDTO organizationDTO);
	
	List<Organization> findAll();

}
