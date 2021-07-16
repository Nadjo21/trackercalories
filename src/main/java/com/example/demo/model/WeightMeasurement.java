package com.example.demo.model;

import javax.persistence.*;


@Entity
public class WeightMeasurement {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "weightmeasurement_id_seq")
    @SequenceGenerator(name = "weightmeasurement_id_seq", allocationSize = 1)

    private int id;
    private int value ;
    private int unit ;
    private int measurementdate ;

    public int getId() {
        return id;
    }

    public int getValue() {
        return value;
    }

    public int getUnit() {
        return unit;
    }

    public int getMeasurementdate() {
        return measurementdate;
    }
}
