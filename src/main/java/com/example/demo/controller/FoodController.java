package com.example.demo.controller;

import com.example.demo.model.Food;
import com.example.demo.repository.FoodRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="*")

@RequestMapping("api/food")
public class FoodController {


    private FoodRepository foodRepository;

    public FoodController(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;}

    // Sélection de la liste de tous les aliments
    @GetMapping
    public List<Food> getAllFood() {return foodRepository.findAll();}

    // Ajout nouveaux aliments
    @PostMapping
    public void createFood(@RequestBody Food foodToCreate) {
        foodRepository.save(foodToCreate);
    }

    // Modification des aliments
    @PutMapping
    public void updateFood(@RequestBody Food foodToUpdate) {
        foodRepository.save(foodToUpdate);
    }


    // Suppression d'un aliment(via son id)
    @DeleteMapping ("{id}")
    public void deleteFood(@PathVariable Integer id) {
        foodRepository.deleteById(id);
    }

}
