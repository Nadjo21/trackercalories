package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


@Entity
public class WeightMeasurement {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "weightmeasurement_id_seq")
    @SequenceGenerator(name = "weightmeasurement_id_seq", allocationSize = 1)

    private int id;
    private int weight;

    private LocalDate measurementDate;

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
