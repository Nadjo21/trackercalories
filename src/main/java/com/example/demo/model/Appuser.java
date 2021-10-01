package com.example.demo.model;
import javax.persistence.*;
import java.util.List;


@Entity
public class Appuser {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "appuser_id_seq")
    @SequenceGenerator(name = "appuser_id_seq", allocationSize = 1)
    private int id;
    private String name;

    //1 user peut avoir  plusieurs weight
    @OneToMany(mappedBy = "appuser")
    private List<WeightMeasurement> weightmeasurement;

    //1 user peut avoir  plusieurs foodintake
    @OneToMany(mappedBy = "appuser")
    private List<FoodIntake> foodintake;

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
