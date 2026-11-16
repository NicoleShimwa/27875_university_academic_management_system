package com.example.universityacademic.repository;

import com.example.universityacademic.model.Lecturer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LecturerRepository
        extends JpaRepository<Lecturer, Long> {

}