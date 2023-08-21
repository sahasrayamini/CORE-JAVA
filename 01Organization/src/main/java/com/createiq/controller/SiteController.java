package com.createiq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.createiq.DTO.SiteDTO;
import com.createiq.Entities.Site;
import com.createiq.service.SiteServiceimpl;

@RestController
@RequestMapping("/site")
public class SiteController {
	
	@Autowired
	private SiteServiceimpl siteServiceimpl;
	
	@PostMapping
	public Site save(@RequestBody SiteDTO siteDTO) {
		return siteServiceimpl.save(siteDTO);
		
	}
	
	@GetMapping
	public List<Site> findAll(){
		return siteServiceimpl.findAll();
		
	}

}
