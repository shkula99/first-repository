package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class ProjectAttendance implements Serializable{

   
    private Employee employee;
    private Project project;
    private Float hours;
    
    private ProjectAttendanceKey key;

    @MapsId("employee_id")
    @ManyToOne
    @JoinColumn(name = "employee_id")
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @MapsId("project_id")
    @ManyToOne
    @JoinColumn(name = "project_id")
    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @EmbeddedId
    public ProjectAttendanceKey getKey() {
        return key;
    }

    public void setKey(ProjectAttendanceKey key) {
        this.key = key;
    }

    public Float getHours() {
        return hours;
    }

    public void setHours(Float hours) {
        this.hours = hours;
    }


    
}
