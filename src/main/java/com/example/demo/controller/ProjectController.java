package com.example.demo.controller;

import java.util.List;

import com.example.demo.dto.ProjectDTO;
import com.example.demo.model.Department;
import com.example.demo.model.Project;
import com.example.demo.service.DepartmentService;
import com.example.demo.service.ProjectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {
    
    @Autowired
    private ProjectService projectService;

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/project/all")

    public ResponseEntity<List<ProjectDTO>> getProjects(){

        List<Project> projects = projectService.getAll();
        List<ProjectDTO> projectDTOList = projectService.convertToDTO(projects);


         return new ResponseEntity<>(projectDTOList, HttpStatus.OK);
     }
    @PostMapping("/project/add")
    public ResponseEntity<ProjectDTO> addProject(@RequestBody Project project) {

        Department department = departmentService.getById(1);
        project.setDepartment(department);
        Project savedProject = projectService.saveProject(project);
        ProjectDTO projectDTO = projectService.convertToDTO(savedProject);

       return new ResponseEntity<>(projectDTO, HttpStatus.ACCEPTED);
   }
}
