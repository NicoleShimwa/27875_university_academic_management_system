package com.example.universityacademic.repository;

import com.example.universityacademic.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository
        extends JpaRepository<Student, Long> {

}
