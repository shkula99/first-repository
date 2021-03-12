package com.example.demo.model;

import java.util.Set;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.ManyToMany;
//import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
//import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

 @Entity
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class Project {

    private Integer id;
    private String name;
    private String startDate;
    private Department department;
    private Employee leader;
    //private Set<Employee> employees;   
    private Set<ProjectAttendance> projectAttendances;

    @Id
    //@GeneratedValue
    public Integer getId() {
        return id;
    }

    @OneToOne
    public Employee getLeader() {
        return leader;
    }

    public void setLeader(Employee leader) {
        this.leader = leader;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @ManyToOne
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    // @ManyToMany(mappedBy = "projects")
    // public Set<Employee> getEmployees() {
    //     return employees;
    // }

    // public void setEmployees(Set<Employee> employees) {
    //     this.employees = employees;
    // }

    @OneToMany(mappedBy = "project")
    public Set<ProjectAttendance> getProjectAttendances() {
        return projectAttendances;
    }

    public void setProjectAttendances(Set<ProjectAttendance> projectAttendances) {
        this.projectAttendances = projectAttendances;
    }
    
}
