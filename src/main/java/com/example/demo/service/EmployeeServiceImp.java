package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImp implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Employee addEmployee(Employee employee) {

        return employeeRepository.save(employee);

    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return employeeRepository.getOne(id);

    }

    @Override
    public void deleteEmployeeById(Integer id) {
        employeeRepository.deleteById(id);

    }

    @Override
    public List<EmployeeDTO> convertToDTO(List<Employee> employees) {
        List<EmployeeDTO> employeeDTOList = new ArrayList<>();
        for (Employee employee : employees) {

            EmployeeDTO employeeDTO = modelMapper.map(employee, EmployeeDTO.class);
            //employeeDTO.setProjectsIds(employee.getProjects().stream().map(project -> project.getId()).collect(Collectors.toList()));
            employeeDTOList.add(employeeDTO);
        }

        return employeeDTOList;
    }

    @Override
    public EmployeeDTO convertToDTO(Employee employee) {
        EmployeeDTO employeeDTO = modelMapper.map(employee, EmployeeDTO.class);
        return employeeDTO;
    }

}
