package za.co.sompisiit.wellness.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.sompisiit.wellness.model.Patient;

import java.util.List;
import java.util.Optional;

public interface PatientRepository  extends JpaRepository<Patient,Long>{

    Optional<List<Patient>> findAllByBodyMassIndexGreaterThanOrSystolicBloodPressureGreaterThanAndDiastolicBloodPressureGreaterThan(final double bmi,
                                                                                                                                    final double sbp,
                                                                                                                                    final double dbp);
}
