package com.example.demo.controller;

import java.util.List;

import com.example.demo.dto.DepartmentDTO;
import com.example.demo.model.Department;
import com.example.demo.service.DepartmentService;
import com.example.demo.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    
    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/department/all")

    public ResponseEntity<List<DepartmentDTO>> getDepartments(){

        List<Department> departments = departmentService.getAll();

        List<DepartmentDTO> departmentDTOList = departmentService.convertToDTO(departments);

         return new ResponseEntity<>(departmentDTOList, HttpStatus.OK);
     }
    @PostMapping("/department/add")
    public ResponseEntity<DepartmentDTO> addDeprtment(@RequestBody Department department) {

        department.setManager(employeeService.getEmployeeById(2));

        Department savedDepartment = departmentService.saveDepartment(department);

        DepartmentDTO departmentDTO = departmentService.convertToDTO(savedDepartment);

       return new ResponseEntity<>(departmentDTO, HttpStatus.CREATED);
   }
}
