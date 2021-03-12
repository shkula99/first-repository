package com.example.demo.dto;

//import java.util.List;

//import com.example.demo.model.Location;

public class DepartmentDTO {

    private Integer id;
    private String name;
    private String location;
    private Integer managerId;
   // private List<Integer>Department_Locations;

    public Integer getId() {
        return id;
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

    // public String getLocation() {
    //     return location;
    // }

    // public void setLocation(String location) {
    //     this.location = location;
    // }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    // public List<Integer> getDepartment_Locations() {
    //     return Department_Locations;
    // }

    // public void setDepartment_Locations(List<Integer> department_Locations) {
    //     Department_Locations = department_Locations;
    // }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    
}
