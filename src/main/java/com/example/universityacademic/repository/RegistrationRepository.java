package com.example.universityacademic.repository;

import com.example.universityacademic.model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository
        extends JpaRepository<Registration, Long> {

}
