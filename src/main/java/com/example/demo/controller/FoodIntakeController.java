package com.example.demo.controller;

import com.example.demo.model.FoodIntake;
import com.example.demo.repository.FoodIntakeRepository;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")

@RequestMapping("api/foodintake")
public class FoodIntakeController {

    private FoodIntakeRepository foodIntakeRepository;

    //constructeur vide ou autowired
    public FoodIntakeController(FoodIntakeRepository foodIntakeRepository) {
             this.foodIntakeRepository = foodIntakeRepository;
    }

    @GetMapping
    public List<FoodIntake> getAllFoodIntake(){
        return foodIntakeRepository.findAll();}


 //ci dessous getMapping pour filtrer les foodIntake a partir de la date
    @GetMapping("/foodintakebydate")
    List <FoodIntake> getFoodIntakeByDate(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return foodIntakeRepository.findByDate(date);
    }


    @PostMapping
    public void createFoodIntake(@RequestBody FoodIntake foodintakeToCreate) {
        foodIntakeRepository.save(foodintakeToCreate);
    }


}
