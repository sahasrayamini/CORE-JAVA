package com.createiq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.createiq.entities.Asset;
import com.createiq.repository.AssetRepository;

@Service
public class AssetServiceImpl implements AssetService{

	@Autowired
	private AssetRepository assetRepository;
	
	@Override
	public Asset save(Asset asset) {
		return assetRepository.save(asset);
	}

	@Override
	public List<Asset> findAll() {
		return assetRepository.findAll();
	}

}
