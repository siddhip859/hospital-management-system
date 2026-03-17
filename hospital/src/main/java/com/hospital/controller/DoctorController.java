package com.hospital.controller;

import com.hospital.model.Doctor;
import com.hospital.repository.DoctorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/doctors")
public class DoctorController {

@Autowired
DoctorRepository doctorRepository;

@GetMapping
public String doctorsPage(Model model){

model.addAttribute("doctors", doctorRepository.findAll());
model.addAttribute("doctor", new Doctor());

return "doctors";
}

@PostMapping("/save")
public String saveDoctor(@ModelAttribute Doctor doctor){

doctorRepository.save(doctor);

return "redirect:/doctors";
}

@GetMapping("/delete/{id}")
public String deleteDoctor(@PathVariable Long id){

doctorRepository.deleteById(id);

return "redirect:/doctors";
}
@GetMapping("/edit/{id}")
public String editDoctor(@PathVariable Long id, Model model){

Doctor doctor = doctorRepository.findById(id).orElse(null);

model.addAttribute("doctor", doctor);
model.addAttribute("doctors", doctorRepository.findAll());

return "doctors";
}

}