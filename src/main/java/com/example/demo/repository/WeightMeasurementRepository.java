package com.example.demo.repository;

import com.example.demo.model.WeightMeasurement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeightMeasurementRepository extends JpaRepository<WeightMeasurement,Integer> {
}
