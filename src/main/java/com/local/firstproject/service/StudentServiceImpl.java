package com.local.firstproject.service;

import com.local.firstproject.entity.Student;
import com.local.firstproject.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements IStudentService {
    private final StudentRepo studentRepo;

    @Autowired
    public StudentServiceImpl(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public ResponseEntity<?> getAll() {
        List<Student> studentsList = studentRepo.findAll();
        if(studentsList.isEmpty()){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
       return ResponseEntity.status(HttpStatus.OK).body(studentsList);
    }

    @Override
    public ResponseEntity<?> getByDepartment(String department) {
        return ResponseEntity.status(HttpStatus.OK).body(studentRepo.findAllByDepartmentLike(department));
    }

    @Override
    public ResponseEntity<?> getById(Integer id) {
        return ResponseEntity.status(HttpStatus.OK).body(Optional.ofNullable(studentRepo.findById(id)));
    }

    @Override
    public ResponseEntity<?> save(Student student) {
        return ResponseEntity.status(HttpStatus.OK).body(studentRepo.save(student));
    }

    @Override
    public ResponseEntity<?> deleteById(Integer id) {
        studentRepo.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @Override
    public ResponseEntity<?> deleteAll() {
        studentRepo.deleteAll();
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
