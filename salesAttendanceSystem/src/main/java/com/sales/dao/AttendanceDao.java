package com.sales.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sales.model.Attendance;


@Repository
public interface AttendanceDao extends CrudRepository<Attendance, String> {

	



}
