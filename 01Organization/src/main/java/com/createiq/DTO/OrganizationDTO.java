package com.createiq.DTO;

import java.util.List;


import lombok.Data;

@Data
public class OrganizationDTO {
	
	private int oid;
	private String oname;
	private String description;

	private List<Integer> siteids;




}
