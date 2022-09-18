package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	//inject the sudentService here
	
	@Autowired
	private StudentService studentService;
	
	@DeleteMapping("/delete/{id}")
	public void deleteStudentById(@PathVariable("id")Integer id) {
		studentService.deleteStudent(id);
	}
}
