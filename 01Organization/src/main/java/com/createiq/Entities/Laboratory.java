package com.createiq.Entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class Laboratory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int lid;
	@Column(name="lab_name",length=45,nullable=false)
	private String lname;
	@Column(name="lab_cordinator",length=45,nullable=false )
	private String LabCordinator;
	
   
}
