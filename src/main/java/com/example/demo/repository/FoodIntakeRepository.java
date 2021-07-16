package com.example.demo.repository;


import com.example.demo.model.FoodIntake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodIntakeRepository extends JpaRepository<FoodIntake,Integer> {
}
