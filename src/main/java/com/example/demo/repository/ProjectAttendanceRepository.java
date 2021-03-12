package com.example.demo.repository;

import com.example.demo.model.ProjectAttendance;
import com.example.demo.model.ProjectAttendanceKey;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectAttendanceRepository extends JpaRepository<ProjectAttendance, ProjectAttendanceKey>{
    
}
