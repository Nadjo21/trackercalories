package com.example.demo.repository;


import com.example.demo.model.FoodIntake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface FoodIntakeRepository extends JpaRepository<FoodIntake,Integer> {
    Optional<FoodIntake> findByDate(LocalDate date);
}
