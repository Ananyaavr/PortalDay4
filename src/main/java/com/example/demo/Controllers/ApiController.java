 	package com.example.demo.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Student;
import com.example.demo.repository.StudentRepo;
import com.example.demo.Service.ApiService;

@RestController
public class ApiController {
@Autowired
StudentRepo serviceRepository;
@Autowired
ApiService service;
@GetMapping("/")
List<Student> getlist(){
	return serviceRepository.findAll();
}
@GetMapping("/{id}")
public Optional<Student> getbyid(int id){
	return service.getStudent(id);
}
@PutMapping("/{id}")
public String update(@RequestBody Student stu) {
	return service.updateDetails(stu);
}
@DeleteMapping("/{id}")
public String delete(@PathVariable int id) {
	return service.deleteDetails(id);
}
@PostMapping("/")
public Student create(@RequestBody Student stu) {
return serviceRepository.save(stu);
}
}
