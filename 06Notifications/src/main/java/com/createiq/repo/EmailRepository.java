package com.createiq.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.createiq.entity.Email;

public interface EmailRepository extends JpaRepository<Email, Long>{

}
