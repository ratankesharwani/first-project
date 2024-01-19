package com.local.firstproject.service;

import com.local.firstproject.entity.Student;
import org.springframework.http.ResponseEntity;

public interface IStudentService {
    ResponseEntity<?> getAll();
    ResponseEntity<?> getByDepartment(String department);
    ResponseEntity<?> getById(Integer id);
    ResponseEntity<?> save(Student student);
    ResponseEntity<?> deleteById(Integer id);
    ResponseEntity<?> deleteAll();
}
