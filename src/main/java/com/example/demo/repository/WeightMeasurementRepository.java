package com.example.demo.repository;

import com.example.demo.model.WeightMeasurement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface WeightMeasurementRepository extends JpaRepository<WeightMeasurement, Integer> {
    List<WeightMeasurement> findWeightMeasurementByAppuser_Id (Integer id);

}
