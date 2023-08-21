package com.createiq.service;

import java.util.List;

import com.createiq.DTO.SiteDTO;
import com.createiq.Entities.Site;

public interface SiteService {
	
	public Site save(SiteDTO siteDTO);
	
	List<Site> findAll();

}
