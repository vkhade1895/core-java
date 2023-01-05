package com.example.controllers;

import com.example.model.Appointment;
import com.example.model.Doctor;
import com.example.model.Patient;
import com.example.model.Response;
import com.example.repository.DemoRepoDoctor;
import com.example.repository.DemoRepoPatient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1")
public class SampleController {

    @Autowired
    DemoRepoPatient demoRepoPatient;

    @Autowired
    DemoRepoDoctor demoRepoDoctor;

    @GetMapping(value="/doctors")
    public List<Doctor> getDoctors() {
        return demoRepoDoctor.findAll();
    }

    @GetMapping(value="/doctors/{name}")
    public List<Doctor> getDoctorsName(@PathVariable(value = "name") String dName) {
        return demoRepoDoctor.findByDoctorName(dName);
    }

    @GetMapping(value="/patients/{name}")
    public List<Patient> getPatientsName(@PathVariable(value = "name") String pName) {
        return demoRepoPatient.findByPatientName(pName);
    }

    @GetMapping(value="/patients")
    public List<Patient> getPatients() {
        return demoRepoPatient.findAll();
    }

    @PostMapping("/create-patient")
    public Optional<Patient> createPatient(@RequestBody Patient patient) {
        demoRepoPatient.save(patient);
        return demoRepoPatient.findById(patient.getPatientId());
    }

    @PostMapping("/create-doctor")
    public Optional<Doctor> createDoctor(@RequestBody Doctor doctor) {
        demoRepoDoctor.save(doctor);
        return demoRepoDoctor.findById(doctor.getDoctorId());
    }

    @DeleteMapping(value = "/delete-patient/{id}")
    public ResponseEntity<Object> deleteByIdPatient(@PathVariable Long id) {
        demoRepoPatient.deleteById(id);
        System.out.println("Patient Id deleted is-" + id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @DeleteMapping(value = "/delete-patients")
    public ResponseEntity<Object> deleteAllPatients() {
        demoRepoPatient.deleteAll();
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @DeleteMapping(value = "/delete-doctors")
    public ResponseEntity<Object> deleteAllDoctors() {
        demoRepoDoctor.deleteAll();
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @DeleteMapping(value = "/delete-doctor/{id}")
    public ResponseEntity<Object> deleteByIdDoctor(@PathVariable Long id) {
        demoRepoDoctor.deleteById(id);
        System.out.println("doctor Id deleted is-" + id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PostMapping("/book/{doctorId}")
    public ResponseEntity<Response> bookAppointment(@PathVariable(value = "doctorId") Long doctorId , @RequestBody Appointment bookingDetails) {
        Response response = new Response();
        Optional<Doctor> doc= demoRepoDoctor.findById(doctorId);
        if (doc != null && doc.isPresent()) {

            doc.get().setStatus("booked");
            response.setResDoctor(doc);
            System.out.println(""+response);
            return new ResponseEntity<>(response,HttpStatus.OK);
        } else {
            System.out.println("inside else"+doc);
            response.setMsg("Doctor not found-" + doctorId);
            return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
        }
    }
}
