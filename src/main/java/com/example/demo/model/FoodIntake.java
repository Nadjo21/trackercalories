package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class FoodIntake {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "foodintake_id_seq")
   @SequenceGenerator(name = "foodintake_id_seq", allocationSize = 1)

    private int id;
    private LocalDate date;
    private int quantity;


    // +sieurs Food Intake  peuvent être rattaché a un meme aliment
    @ManyToOne
private Food food;


    public int getId() {
        return id;
    }

    // annotation pour contourner message d'erreur sur deserialisation impossible de la date
   // @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    public LocalDate getDate() {
        return date;
    }

    public int getQuantity() {
        return quantity;
    }

    public Food getFood() {
        return food;
    }
}
