package com.example.demo.dto;

import java.util.List;

public class EmployeeDTO {
    
    private Integer id;
    private String firstName;
    private String lastName;
    private String gender;
    private Double salary;
    private Integer workingDepartmentId;
    private Integer managingDepartmentId;
    private Integer leadingProjectId;
    private List<Integer> projectsIds;


    public Integer getId() {
        return id;
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

    public Integer getWorkingDepartmentId() {
        return workingDepartmentId;
    }

    public void setWorkingDepartmentId(Integer workingDepartmentId) {
        this.workingDepartmentId = workingDepartmentId;
    }

    public Integer getManagingDepartmentId() {
        return managingDepartmentId;
    }

    public void setManagingDepartmentId(Integer managingDepartmentId) {
        this.managingDepartmentId = managingDepartmentId;
    }

    public Integer getLeadingProjectId() {
        return leadingProjectId;
    }

    public void setLeadingProjectId(Integer leadingProjectId) {
        this.leadingProjectId = leadingProjectId;
    }

    public List<Integer> getProjectsIds() {
        return projectsIds;
    }

    public void setProjectsIds(List<Integer> projectsIds) {
        this.projectsIds = projectsIds;
    }

    

    
}
