package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/studentCustom")
public class StudentController {

	// inject service method here
	@Autowired
	private StudentService studentService;

	@GetMapping("/city/{city}")
	public ResponseEntity<List<Student>> getListByCity(@PathVariable("city") String city) {
		List<Student> list = studentService.getListByCity(city);

		return ResponseEntity.ok().body(list);
	}
}
