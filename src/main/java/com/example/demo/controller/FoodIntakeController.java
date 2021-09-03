package com.example.demo.controller;

import com.example.demo.model.Food;
import com.example.demo.model.FoodIntake;
import com.example.demo.repository.FoodIntakeRepository;
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
    @GetMapping("/?foodIntakedate=date")
    public FoodIntake getFoodIntakeByDate(@RequestParam LocalDate date) {
        //je range ci dessous ma methode dans un optionnal pour lui dire quoi faire si le resultat est nul
        Optional<FoodIntake> foodIntake =foodIntakeRepository.findByDate(date);
        if(foodIntake.isPresent()){
                    return foodIntake.get();
        }else{

            //retourner un code d'erreur ......
        }
        return null;
    }

    @PostMapping
    public void createFoodIntake(@RequestBody FoodIntake foodintakeToCreate) {
        foodIntakeRepository.save(foodintakeToCreate);
    }


}
