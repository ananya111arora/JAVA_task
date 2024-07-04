package com.example.doctorpatientsystem.service;

import com.example.doctorpatientsystem.entity.Doctor;
import com.example.doctorpatientsystem.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;

    public Doctor addDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    public void deleteDoctor(Long id) {
        doctorRepository.deleteById(id);
    }

    public List<Doctor> suggestDoctors(String city, String speciality) {
        return doctorRepository.findByCityAndSpeciality(city, speciality);
    }
}
