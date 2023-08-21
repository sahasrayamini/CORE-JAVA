package com.createiq.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.createiq.Entities.Organization;

public interface OrganizationDao extends JpaRepository<Organization, Integer>{

}
