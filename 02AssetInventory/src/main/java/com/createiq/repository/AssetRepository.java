package com.createiq.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.createiq.entities.Asset;

public interface AssetRepository extends JpaRepository<Asset, Integer>{

}
