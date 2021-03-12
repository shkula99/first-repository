package com.example.demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.ManyToMany;
//import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
//import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "employees")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class Employee {

    private Integer id;
    private String firstName;
    private String lastName;
    private String gender;
    private Double salary;
    //private String location;
    private Department managingDepartment;
    private Department workingDepartment;
    private Project leadingProject;
    //private Set<Project> projects;
    private Set<ProjectAttendance> projectAttendances;

    @Id
    //@GeneratedValue
    public Integer getId() {
        return id;
    }

    @OneToOne(mappedBy = "leader")
    public Project getLeadingProject() {
        return leadingProject;
    }

    public void setLeadingProject(Project leadingProject) {
        this.leadingProject = leadingProject;
    }

    @ManyToOne
    public Department getWorkingDepartment() {
        return workingDepartment;
    }

    public void setWorkingDepartment(Department workingDepartment) {
        this.workingDepartment = workingDepartment;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    Employee(){
        projectAttendances = new HashSet<>();
    }

    public Employee(Integer id, String firstName, String lastName, String gender, Double salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.salary = salary;
	}

    @OneToOne(mappedBy = "manager", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public Department getmanagingDepartment() {
        return managingDepartment;
    }

    public void setmanagingDepartment(Department managingDepartment) {
        this.managingDepartment = managingDepartment;
    }

    // @ManyToMany
    // public Set<Project> getProjects() {
    //     return projects;
    // }

    // public void setProjects(Set<Project> projects) {
    //     this.projects = projects;
    // }

    

    @OneToMany(mappedBy = "employee" , cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public Set<ProjectAttendance> getProjectAttendances() {
        return projectAttendances;
    }

    public void setProjectAttendances(Set<ProjectAttendance> projectAttendances) {
        this.projectAttendances = projectAttendances;
    }
    
}
