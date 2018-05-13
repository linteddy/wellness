package za.co.sompisiit.wellness.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.sompisiit.wellness.model.Patient;

import java.util.List;

@RestController
@RequestMapping("patient")
public class PatientController {

    private PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/high-risk")
    public ResponseEntity<List<Patient>> getHighRiskPatients() {
        List<Patient> patients = patientService.retrieveHighRiskPatients();
        if (patients == null)
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(patients, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Patient> capturePatient(@RequestBody Patient patient) {
        try {
            Patient savedPatient = patientService.addPatient(patient);
        }
        catch (Exception ex){
            new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}