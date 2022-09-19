package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.StudentRepository;
import com.example.demo.model.Student;

public interface StudentService {

	public List<Student> getListByCity(String city);
}
