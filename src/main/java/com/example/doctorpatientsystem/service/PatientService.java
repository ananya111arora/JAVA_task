package com.example.doctorpatientsystem.service;

import com.example.doctorpatientsystem.entity.Patient;
import com.example.doctorpatientsystem.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }

    public Optional<Patient> getPatient(Long id) {
        return patientRepository.findById(id);
    }
}
