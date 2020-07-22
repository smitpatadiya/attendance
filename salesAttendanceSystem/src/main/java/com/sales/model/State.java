package com.sales.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class State {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long stateid;
	private String statename;
	private	String createdby;
	private Date 	createddate;
	private String lastupdatedby;
	private Date lastupdateddate;
	
	
	
}
