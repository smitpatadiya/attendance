package com.sales.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="employee_detail")
public class EmployeeDetails implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	 @ManyToOne(fetch=FetchType.LAZY,targetEntity=Employee.class,cascade = {CascadeType.REMOVE})
	//@JoinColumn(name="empcode", referencedColumnName="empcode")
	//@PrimaryKeyJoinColumn
    private Employee empcode ;
	@ManyToOne(cascade = {CascadeType.REMOVE})
    private Role role;
	private String name;
	private String designation;
	private String contact_no;
	private int status;
	private String loi_date;
	private String doj;
	private String location;
	private String dis_appointment_target;
	private String achieved;
	private String sales_value_target;
	private String achieved_till_date;
	private String target_today;
	private String yesterday_achievment;
	private String visit_today;
	private String remark;
	private String created_by;
	private Date created_date;
	private String last_updated_by;
	private Date last_updated_date;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	

	public Employee getEmployee() {
		return empcode;
	}

	public void setEmployee(Employee employee) {
		this.empcode = employee;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getLoi_date() {
		return loi_date;
	}

	public void setLoi_date(String loi_date) {
		this.loi_date = loi_date;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDis_appointment_target() {
		return dis_appointment_target;
	}

	public void setDis_appointment_target(String dis_appointment_target) {
		this.dis_appointment_target = dis_appointment_target;
	}

	public String getAchieved() {
		return achieved;
	}

	public void setAchieved(String achieved) {
		this.achieved = achieved;
	}

	public String getSales_value_target() {
		return sales_value_target;
	}

	public void setSales_value_target(String sales_value_target) {
		this.sales_value_target = sales_value_target;
	}

	public String getAchieved_till_date() {
		return achieved_till_date;
	}

	public void setAchieved_till_date(String achieved_till_date) {
		this.achieved_till_date = achieved_till_date;
	}

	public String getTarget_today() {
		return target_today;
	}

	public void setTarget_today(String target_today) {
		this.target_today = target_today;
	}

	public String getYesterday_achievment() {
		return yesterday_achievment;
	}

	public void setYesterday_achievment(String yesterday_achievment) {
		this.yesterday_achievment = yesterday_achievment;
	}

	public String getVisit_today() {
		return visit_today;
	}

	public void setVisit_today(String visit_today) {
		this.visit_today = visit_today;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", name=" + name + ", designation=" + designation
				+ ", contact_no=" + contact_no + ", status=" + status + ", loi_date=" + loi_date + ", doj=" + doj
				+ ", location=" + location + ", dis_appointment_target=" + dis_appointment_target + ", achieved="
				+ achieved + ", sales_value_target=" + sales_value_target + ", achieved_till_date=" + achieved_till_date
				+ ", target_today=" + target_today + ", yesterday_achievment=" + yesterday_achievment + ", visit_today="
				+ visit_today + ", remark=" + remark + ", created_by=" + created_by + ", created_date=" + created_date
				+ ", last_updated_by=" + last_updated_by + ", last_updated_date=" + last_updated_date + "]";
	}

}
