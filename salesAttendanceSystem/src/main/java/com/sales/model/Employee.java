package com.sales.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "mst_employee")
public class Employee implements Serializable {

	public Employee() {
		// super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonIgnore
	private long emp_id;
	@Column(unique = true)
	private String empcode;
	private String empname;
	@JsonIgnore
	private String password;
	@ManyToOne(cascade = {CascadeType.REMOVE})
	private Role role;
	private String created_by;
	private Date created_date;
	private String last_updated_by;
	private Date last_updated_date;

	public long getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(long emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmpcode() {
		return empcode;
	}

	public void setEmpcode(String empcode) {
		this.empcode = empcode;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public String getLast_updated_by() {
		return last_updated_by;
	}

	public void setLast_updated_by(String last_updated_by) {
		this.last_updated_by = last_updated_by;
	}

	public Date getLast_updated_date() {
		return last_updated_date;
	}

	public void setLast_updated_date(Date last_updated_date) {
		this.last_updated_date = last_updated_date;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", empcode=" + empcode + ", empname=" + empname + ", password=" + password
				+ ", role=" + role + ", created_by=" + created_by + ", created_date=" + created_date
				+ ", last_updated_by=" + last_updated_by + ", last_updated_date=" + last_updated_date + "]";
	}
	
	
	

	/*
	 * @JsonIgnore
	 * 
	 * @OneToOne(mappedBy = "empployee",cascade = {CascadeType.ALL})
	 */
	// @ManyToOne
	// private EmployeeDetails details=new EmployeeDetails();

}
