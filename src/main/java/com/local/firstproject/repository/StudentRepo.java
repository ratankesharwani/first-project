package com.local.firstproject.repository;

import com.local.firstproject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
    List<Student> findAllByDepartmentLike(String department);
}
