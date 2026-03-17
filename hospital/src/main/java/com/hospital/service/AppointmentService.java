package com.hospital.service;

import com.hospital.model.Appointment;
import java.util.List;

public interface AppointmentService {

    List<Appointment> getAllAppointments();

    void saveAppointment(Appointment appointment);

    Appointment getAppointmentById(Long id);

    void deleteAppointment(Long id);
}