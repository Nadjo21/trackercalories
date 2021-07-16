package com.example.demo.model;

import javax.persistence.*;

@Table
@Entity

public class Appuser {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "appuser_id_seq")
    @SequenceGenerator(name = "appuser_id_seq", allocationSize = 1)
    private int id;
    private String name;



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


}
