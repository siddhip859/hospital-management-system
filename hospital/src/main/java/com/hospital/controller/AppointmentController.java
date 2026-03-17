package com.hospital.controller;

import com.hospital.model.Appointment;
import com.hospital.repository.AppointmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/appointments")
public class AppointmentController {

@Autowired
AppointmentRepository appointmentRepository;

@GetMapping
public String appointmentPage(Model model){

model.addAttribute("appointments", appointmentRepository.findAll());
model.addAttribute("appointment", new Appointment());

return "appointments";
}

@PostMapping("/save")
public String saveAppointment(@ModelAttribute Appointment appointment){

appointmentRepository.save(appointment);

return "redirect:/appointments";
}

@GetMapping("/delete/{id}")
public String deleteAppointment(@PathVariable Long id){

appointmentRepository.deleteById(id);

return "redirect:/appointments";
}

}