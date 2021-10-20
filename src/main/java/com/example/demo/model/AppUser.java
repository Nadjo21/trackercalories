package com.example.demo.model;
import com.fasterxml.jackson.annotation.JsonIgnore;


import javax.persistence.*;
import java.util.List;


@Entity
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "appuser_id_seq")
    @SequenceGenerator(name = "appuser_id_seq", allocationSize = 1)
    private int id;
    private String username;

    @JsonIgnore
    @Column(length = 64)
    private String password;

    @ElementCollection(fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    private List<Role> roleList;

    //1 user peut avoir  plusieurs weight
    @JsonIgnore
    @OneToMany(mappedBy = "appuser")
    private List<WeightMeasurement> weightmeasurement;

    //1 user peut avoir  plusieurs foodintake
    @JsonIgnore
    @OneToMany(mappedBy = "appuser")
    private List<FoodIntake> foodintake;


    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public AppUser(String username, String password, List<Role> roleList) {
        this.username = username;
        this.password = password;
        this.roleList = roleList;
    }

    public AppUser() {
    }

    public List<WeightMeasurement> getWeightmeasurement() {
        return weightmeasurement;
    }

    public List<FoodIntake> getFoodintake() {
        return foodintake;
    }
}
