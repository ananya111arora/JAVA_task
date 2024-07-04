
package com.example.doctorpatientsystem.repository;

import com.example.doctorpatientsystem.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}