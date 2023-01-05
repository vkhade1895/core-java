package com.example.repository;

import com.example.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DemoRepoDoctor extends JpaRepository<Doctor,Long> {
    List<Doctor> findByDoctorName(String dName);
}
