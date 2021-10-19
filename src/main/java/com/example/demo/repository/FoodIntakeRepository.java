package com.example.demo.repository;
import com.example.demo.model.FoodIntake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface FoodIntakeRepository extends JpaRepository<FoodIntake, Integer> {
      List<FoodIntake> findByDateAndAppuser_Id(LocalDate startDate, Integer id);
}


//List<FoodIntake> findByDate(LocalDate startDate);