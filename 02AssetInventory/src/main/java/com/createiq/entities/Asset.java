package com.createiq.entities;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Table(name="Asset")
//@Data
public class Asset {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="Asset_name",length=45,nullable=false)
	private String name;
	
	@Column(name="refId",length=45,nullable=false)
	private String refid;
	
	@Column(name="Description",length=256,nullable=false)
	private String description;
	
	@Column(name="Asset_Type",length=45,nullable=false)
	private String type;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name="expDate",length=45,nullable=false)
	private Date expDate;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(iso = ISO.DATE)


	@Column(name="installationDate",length=45,nullable=false)
	private Date installationDate;
	
	@Column(name="labname",length=45,nullable=false)
	private String labname;
	
	@Column(name="sitename",length=45,nullable=false)
	private String sitename;
	
	@Column(name="assetPrimaryOwner",length=45,nullable=false)
	private String assetPrimaryOwner;
	
	@Column(name="assetSecondaryOwner",length=45,nullable=false)
	private String assetSecondaryOwner;

	public Asset() {
		// TODO Auto-generated constructor stub
	}
	
	public Asset(int id, String name, String refid, String description, String type, Date expDate,
			Date installationDate, String labname, String sitename, String assetPrimaryOwner,
			String assetSecondaryOwner) {
		super();
		this.id = id;
		this.name = name;
		this.refid = refid;
		this.description = description;
		this.type = type;
		this.expDate = expDate;
		this.installationDate = installationDate;
		this.labname = labname;
		this.sitename = sitename;
		this.assetPrimaryOwner = assetPrimaryOwner;
		this.assetSecondaryOwner = assetSecondaryOwner;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRefid() {
		return refid;
	}

	public void setRefid(String refid) {
		this.refid = refid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getExpDate() {
		return expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	public Date getInstallationDate() {
		return installationDate;
	}

	public void setInstallationDate(Date installationDate) {
		this.installationDate = installationDate;
	}

	public String getLabname() {
		return labname;
	}

	public void setLabname(String labname) {
		this.labname = labname;
	}

	public String getSitename() {
		return sitename;
	}

	public void setSitename(String sitename) {
		this.sitename = sitename;
	}

	public String getAssetPrimaryOwner() {
		return assetPrimaryOwner;
	}

	public void setAssetPrimaryOwner(String assetPrimaryOwner) {
		this.assetPrimaryOwner = assetPrimaryOwner;
	}

	public String getAssetSecondaryOwner() {
		return assetSecondaryOwner;
	}

	public void setAssetSecondaryOwner(String assetSecondaryOwner) {
		this.assetSecondaryOwner = assetSecondaryOwner;
	}
	
	
}