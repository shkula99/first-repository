package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.DepartmentDTO;
import com.example.demo.model.Department;

public interface DepartmentService {
    
    Department saveDepartment(Department department);

	Department getById(Integer id);

	List<Department> getAll();

	List<DepartmentDTO> convertToDTO(List<Department> departments);

	DepartmentDTO convertToDTO(Department department);
}
