package com.example.demo.controller;
import java.util.List;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.model.Employee;
import com.example.demo.service.DepartmentService;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApplicationController {

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/employee/all")

    public ResponseEntity<List<EmployeeDTO>> getEmployee(){

         List<Employee> employees = employeeService.getAllEmployees();
         List<EmployeeDTO> employeeDTOList = employeeService.convertToDTO(employees);

         return new ResponseEntity<>(employeeDTOList, HttpStatus.OK);
     }

     @PostMapping("/employee/add")
     public ResponseEntity<EmployeeDTO> addEmployee(@RequestBody Employee employee) {
        employee.setWorkingDepartment(departmentService.getById(2));
        Employee savedEmployee = employeeService.addEmployee(employee);

        EmployeeDTO employeeDTO = employeeService.convertToDTO(savedEmployee);
        return new ResponseEntity<>(employeeDTO, HttpStatus.CREATED);
    }
    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable("id") Integer id){
      Employee employee =  employeeService.getEmployeeById(id);
      return new ResponseEntity<>(employee, HttpStatus.OK);

    }
    @PutMapping("/employee/update")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {

        Employee savedEmployee = employeeService.addEmployee(employee);

       return new ResponseEntity<>(savedEmployee, HttpStatus.OK);
   }
   @DeleteMapping("/employee/{id}/delete")
   public ResponseEntity<String> deleteEmployee(@PathVariable("id") Integer id){

       employeeService.deleteEmployeeById(id);

       return new ResponseEntity<>("Employee" + id + "deleted", HttpStatus.OK);
   }
  
    
}
