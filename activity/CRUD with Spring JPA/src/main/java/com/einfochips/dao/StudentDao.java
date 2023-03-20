package com.einfochips.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.einfochips.models.Student;

public interface StudentDao extends JpaRepository<Student, Integer>{
   
   List<Student> findByCourse(String course);
}
