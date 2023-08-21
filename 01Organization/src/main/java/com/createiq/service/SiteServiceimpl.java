package com.createiq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.createiq.DTO.SiteDTO;
import com.createiq.Entities.Laboratory;
import com.createiq.Entities.Site;
import com.createiq.dao.LaboratoryDao;
import com.createiq.dao.SiteDao;

@Service
public class SiteServiceimpl implements SiteService{

	@Autowired
	private SiteDao siteDao;
	
	@Autowired
	private LaboratoryDao laboratoryDao;
	
	@Override
	public Site save(SiteDTO siteDTO) {
		List<Laboratory> lab1=laboratoryDao.findAllById(siteDTO.getLabids());
		 Site s1=Site.builder()
		.sname(siteDTO.getSname())
		.slocation(siteDTO.getSlocation())
		.Sitecordinator(siteDTO.getSitecordinator())
		.labs(lab1)
		.build();
	
		return siteDao.save(s1);
	}


	@Override
	public List<Site> findAll() {
		return siteDao.findAll();
	}

}
