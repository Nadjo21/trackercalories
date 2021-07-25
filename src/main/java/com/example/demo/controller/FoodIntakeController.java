package com.example.demo.controller;

import com.example.demo.model.FoodIntake;
import com.example.demo.repository.FoodIntakeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PostMapping
    public void createFoodIntake(@RequestBody FoodIntake foodintakeToCreate) {
        foodIntakeRepository.save(foodintakeToCreate);
    }


}
