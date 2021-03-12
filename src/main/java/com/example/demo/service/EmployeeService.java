package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.model.Employee;

public interface EmployeeService {

Employee addEmployee(Employee employee);

List<Employee> getAllEmployees();

Employee getEmployeeById(Integer id);

void deleteEmployeeById(Integer id);

List<EmployeeDTO> convertToDTO(List<Employee> employees); 

EmployeeDTO convertToDTO(Employee employee);

    
}
