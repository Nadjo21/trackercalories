package com.example.demo.model;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class WeightMeasurement {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "weightmeasurement_id_seq")
    @SequenceGenerator(name = "weightmeasurement_id_seq", allocationSize = 1)

    private int id;
    private int weight;
    private LocalDate measurementDate;

    // +sieurs Weight  peuvent être rattaché a un meme user
    @ManyToOne
    private AppUser appuser;
    public AppUser getAppuser() {
        return appuser;
    }
    public int getId() {
        return id;
    }
    public int getWeight() {
        return weight;
    }
    public LocalDate getMeasurementDate() {
        return measurementDate;
    }
}
