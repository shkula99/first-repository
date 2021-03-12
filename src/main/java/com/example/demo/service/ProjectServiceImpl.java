package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.ProjectDTO;
import com.example.demo.model.Project;
import com.example.demo.repository.ProjectRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Project saveProject(Project project) {

        return projectRepository.save(project);
    }

    @Override
    public List<Project> getAll() {
        return projectRepository.findAll();
    }

    @Override
    public List<ProjectDTO> convertToDTO(List<Project> projects) {
        List<ProjectDTO> projectDTOList = new ArrayList<>();
        for(Project project : projects) {
            ProjectDTO projectDTO = modelMapper.map(project, ProjectDTO.class);
            projectDTOList.add(projectDTO);
        }
        return projectDTOList;
    }

    @Override
    public ProjectDTO convertToDTO(Project project) {
        ProjectDTO projectDTO = modelMapper.map(project, ProjectDTO.class);
        return projectDTO;
    }
    
}
