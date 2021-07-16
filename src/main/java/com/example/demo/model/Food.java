package com.example.demo.model;

import javax.persistence.*;
import java.util.List;


@Entity

public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "food_id_seq")
    @SequenceGenerator(name = "food_id_seq", allocationSize = 1)
    private int id;
    private String name;
    private int quantity;
    private int values;
    private int calories;



    //1 aliment peut se retrouver sur plusieurs foodintake
    @OneToMany(mappedBy = "food")
    private List<FoodIntake> foodIntake;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getValues() {
        return values;
    }

    public int getCalories() {
        return calories;
    }
}
