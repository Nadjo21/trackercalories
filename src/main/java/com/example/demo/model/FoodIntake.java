package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class FoodIntake {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "foodintake_id_seq")
   @SequenceGenerator(name = "foodintake_id_seq", allocationSize = 1)

    private int id;
    private int date;
    private int quantity;


    // +sieurs Food Intake  peuvent être rattaché a un meme aliment
    @ManyToOne
private Food food;


    public int getId() {
        return id;
    }

    public int getDate() {
        return date;
    }

    public int getQuantity() {
        return quantity;
    }

    public Food getFood() {
        return food;
    }
}
