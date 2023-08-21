package com.createiq.service;

import java.util.List;

import com.createiq.entities.Asset;

public interface  AssetService {
	
	
	 public Asset save(Asset asset);
	 
	 public List<Asset> findAll();
	 
	
	
	

}
