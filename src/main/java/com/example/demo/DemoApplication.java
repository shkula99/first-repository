package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import com.example.demo.model.Department;
import com.example.demo.model.Location;
//import com.example.demo.model.ProjectAttendance;
//import com.example.demo.model.ProjectAttendanceKey;
import com.example.demo.repository.DepartmentRepository;
//import com.example.demo.repository.ProjectAttendanceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	@Autowired
	//private ProjectAttendanceRepository repository;
	private DepartmentRepository departmentRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args); 
	}

	@Override
	public void run(String... args) throws Exception {

		Location location1 = new Location();
		Location location2 = new Location();
		Location location3 = new Location();
		location1.setName("Kabul");
		location2.setName("Herat");
		location3.setName("Kandar");
		Set<Location> locations = new HashSet<>();
		locations.add(location1);
		locations.add(location2);
		locations.add(location3);
		Department department = new Department();
		department.setName("NetWork");
		department.setLocations(locations);
		departmentRepository.save(department);
		

		// ProjectAttendance projectAttendance = new ProjectAttendance();
		// ProjectAttendanceKey key = new ProjectAttendanceKey();
		// key.setEmployeeId(1);
		// key.setProjectId(1);
		// projectAttendance.setKey(key);
		// repository.save(projectAttendance);

	}

}
