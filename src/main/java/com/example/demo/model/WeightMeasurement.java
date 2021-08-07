package com.example.demo.model;

import javax.persistence.*;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.Date;


@Entity
public class WeightMeasurement {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "weightmeasurement_id_seq")
    @SequenceGenerator(name = "weightmeasurement_id_seq", allocationSize = 1)

    private int id;
    private int weight;
   private LocalDateTime measurementDate;



    public int getId() {
        return id;
    }

    public int getWeight() {
        return weight;
    }

    public LocalDateTime getMeasurementDate() {
        return measurementDate;
    }


}
