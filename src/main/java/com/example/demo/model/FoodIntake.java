package com.example.demo.model;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class FoodIntake {
    @Id
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
