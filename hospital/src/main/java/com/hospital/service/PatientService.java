package com.hospital.service;

import java.util.List;
import com.hospital.model.Patient;

public interface PatientService {

    List<Patient> getAllPatients();

    void savePatient(Patient patient);

    Patient getPatientById(Long id);

    void deletePatient(Long id);
}