package com.sales.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Area {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long areaid;
	private String areaname;
	private String createdby;
	private Date createddate;
	private String lastupdatedby;
	private Date lastupdateddate;
	@ManyToOne(cascade = {CascadeType.REMOVE})
	private City city;
}
