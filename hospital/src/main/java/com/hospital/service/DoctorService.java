package com.hospital.service;

import java.util.List;
import com.hospital.model.Doctor;

public interface DoctorService {

    List<Doctor> getAllDoctors();

    void saveDoctor(Doctor doctor);

    void deleteDoctor(Long id);
}