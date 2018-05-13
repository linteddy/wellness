package za.co.sompisiit.wellness.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Patient extends AuditedEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String surname;
    private String email;
    private double height;
    private double weight;
    @Column(name = "systolic_blood_pressure")
    private double systolicBloodPressure;
    @Column(name = "diastolic_blood_pressure")
    private double diastolicBloodPressure;

    private double bodyMassIndex;

    @PrePersist
    @PreUpdate
    private void calculateBodyMassIndex() {
        bodyMassIndex = weight / (height * height);
    }
}
