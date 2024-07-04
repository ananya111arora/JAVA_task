package com.example.doctorpatientsystem.controller;

import com.example.doctorpatientsystem.entity.Doctor;
import com.example.doctorpatientsystem.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @PostMapping
    public Doctor addDoctor(@RequestBody Doctor doctor) {
        return doctorService.addDoctor(doctor);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDoctor(@PathVariable Long id) {
        doctorService.deleteDoctor(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/suggest")
    public List<Doctor> suggestDoctors(@RequestParam String city, @RequestParam String symptom) {
        String speciality = getSpecialityBySymptom(symptom);
        return doctorService.suggestDoctors(city, speciality);
    }

    private String getSpecialityBySymptom(String symptom) {
        switch (symptom) {
            case "Arthritis":
            case "Back Pain":
            case "Tissue injuries":
                return "Orthopaedic";
            case "Dysmenorrhea":
                return "Gynecology";
            case "Skin infection":
            case "skin burn":
                return "Dermatology";
            case "Ear pain":
                return "ENT";
            default:
                throw new IllegalArgumentException("Unknown symptom: " + symptom);
        }
    }
}
