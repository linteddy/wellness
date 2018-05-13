package za.co.sompisiit.wellness.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.sompisiit.wellness.model.Patient;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {

    List<Patient> findAllByBodyMassIndexGreaterThanOrSystolicBloodPressureGreaterThanAndDiastolicBloodPressureGreaterThan(final double bmi,
                                                                                                                          final double sbp,
                                                                                                                          final double dbp);
}
