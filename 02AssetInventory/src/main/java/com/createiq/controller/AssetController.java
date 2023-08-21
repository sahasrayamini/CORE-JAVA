package com.createiq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.createiq.entities.Asset;
import com.createiq.service.AssetServiceImpl;

@RestController
@RequestMapping("/asset")
public class AssetController {
	
	@Autowired
	private AssetServiceImpl assetServiceImpl;
	
	@PostMapping
	public Asset save(@RequestBody Asset asset) {
		return assetServiceImpl.save(asset);
		
	}
	
	@GetMapping
	public List<Asset> findAll(){
		return assetServiceImpl.findAll();
		
	}
	

}
