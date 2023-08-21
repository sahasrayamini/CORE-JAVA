package com.createiq.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.createiq.entity.UserBean;

public interface UserRepository extends JpaRepository<UserBean, Long>{
	
	 public UserBean findByUname(String uname);
	

}
