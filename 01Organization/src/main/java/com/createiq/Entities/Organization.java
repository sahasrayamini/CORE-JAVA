package com.createiq.Entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Organization {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int oid;
	@Column(name="organization_name",length=45,nullable=false)
	private String oname;
	@Column(name="Description",length=256,nullable=false)
	private String description;
	
	@OneToMany
	@JoinTable(
			name="Org_Site",
			joinColumns=@JoinColumn(name="Org_id"),
			inverseJoinColumns =@JoinColumn(name="Site_id")
			)
	private List<Site> site;
	
	
}
