package com.createiq.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.createiq.entity.MaintenanceCompletedDetails;

public interface MaintenanceCompletedRepository extends JpaRepository<MaintenanceCompletedDetails, Long>{

}
