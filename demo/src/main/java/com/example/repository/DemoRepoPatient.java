package com.example.repository;

import com.example.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DemoRepoPatient extends JpaRepository<Patient, Long> {
    List<Patient> findByPatientName(String pName);
}
