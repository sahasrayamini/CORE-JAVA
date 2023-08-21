package com.createiq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.createiq.DTO.OrganizationDTO;
import com.createiq.Entities.Organization;
import com.createiq.Entities.Site;
import com.createiq.dao.OrganizationDao;
import com.createiq.dao.SiteDao;

@Service
public class OrganizationServiceimpl implements OrganizationService{

	@Autowired
	private OrganizationDao organizationDao;
	
	@Autowired
	private SiteDao siteDao;
	
	@Override
	public Organization save(OrganizationDTO organizationDTO) {
		
		List<Site> si=siteDao.findAllById(organizationDTO.getSiteids());
		Organization org=Organization.builder()
				.oname(organizationDTO.getOname())
				.description(organizationDTO.getDescription())
				.site(si)
				.build();
		return organizationDao.save(org);
	}

	@Override
	public List<Organization> findAll() {
		return organizationDao.findAll();
	}

}
