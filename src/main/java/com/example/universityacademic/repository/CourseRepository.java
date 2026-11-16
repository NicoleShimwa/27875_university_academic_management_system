package com.example.universityacademic.repository;

import com.example.universityacademic.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository
        extends JpaRepository<Course, Long> {

}