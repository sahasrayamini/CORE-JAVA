package com.createiq.Entities;

import java.util.List;

import jakarta.persistence.CascadeType;
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
public class Site {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	@Column(name="site_name",length=45,nullable=false)
	private String sname;
	@Column(name="site_location",length=45,nullable=false)
	private String slocation;
	@Column(name="site_cordinator",length=45,nullable=false)
	private String Sitecordinator;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name="Site_Lab",
			joinColumns=@JoinColumn(name="sid"),
			inverseJoinColumns=@JoinColumn(name="lid")
			)
	private List<Laboratory> labs;

	
	
	
	
	

}
