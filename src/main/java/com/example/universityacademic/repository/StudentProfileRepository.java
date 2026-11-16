package com.example.universityacademic.repository;

import com.example.universityacademic.model.StudentProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentProfileRepository
        extends JpaRepository<StudentProfile, Long> {

}