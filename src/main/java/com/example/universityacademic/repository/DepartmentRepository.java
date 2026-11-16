package com.example.universityacademic.repository;

import com.example.universityacademic.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository
        extends JpaRepository<Department, Long> {

}
