package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.ProjectDTO;
import com.example.demo.model.Project;

public interface ProjectService {
     
    Project saveProject(Project project);

	List<Project> getAll();

    List<ProjectDTO> convertToDTO(List<Project> projects);
    
    ProjectDTO convertToDTO(Project project);
}
