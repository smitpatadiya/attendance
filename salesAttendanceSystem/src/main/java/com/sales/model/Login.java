package com.sales.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
public class Login {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonIgnore
	private int id;
	@ManyToOne(cascade = {CascadeType.REMOVE})
	private Employee empcode;
	private String appversion;
	private String appversioncode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Employee getEmpcode() {
		return empcode;
	}
	public void setEmpcode(Employee empcode) {
		this.empcode = empcode;
	}
	public String getAppversion() {
		return appversion;
	}
	public void setAppversion(String appversion) {
		this.appversion = appversion;
	}
	public String getAppversioncode() {
		return appversioncode;
	}
	public void setAppversioncode(String appversioncode) {
		this.appversioncode = appversioncode;
	}
	@Override
	public String toString() {
		return "Login [empcode=" + empcode + ", appversion=" + appversion + ", appversioncode=" + appversioncode + "]";
	}
	
	
}
