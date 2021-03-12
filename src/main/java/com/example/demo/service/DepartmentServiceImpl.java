package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collector;
//import java.util.stream.Collectors;

import com.example.demo.dto.DepartmentDTO;
import com.example.demo.model.Department;
//import com.example.demo.model.Location;
import com.example.demo.repository.DepartmentRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Department saveDepartment(Department department) {

        return departmentRepository.save(department);

    }

    @Override
    public Department getById(Integer id) {
        return departmentRepository.getOne(id);
    }

    @Override
    public List<Department> getAll() {
        return departmentRepository.findAll();
    }

    @Override
    public List<DepartmentDTO> convertToDTO(List<Department> departments) {
        List<DepartmentDTO> departmentDTOList = new ArrayList<>();
        for (Department department : departments) {

            DepartmentDTO departmentDTO = modelMapper.map(department, DepartmentDTO.class);
            //departmentDTO.setDepartment_Locations(department.getLocations().stream().map(Location -> Location.getId()).collect(Collectors.toList()));
            departmentDTOList.add(departmentDTO);

        }
        return departmentDTOList;
    }

    @Override
    public DepartmentDTO convertToDTO(Department department) {

        DepartmentDTO departmentDTO = modelMapper.map(department, DepartmentDTO.class);
        return departmentDTO;
    }

}

