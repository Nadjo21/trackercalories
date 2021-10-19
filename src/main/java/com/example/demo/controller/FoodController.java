package com.example.demo.controller;
import com.example.demo.model.Food;
import com.example.demo.repository.FoodRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/food")
public class FoodController {

    private FoodRepository foodRepository;
    public FoodController(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    // Sélection de la liste de tous les aliments
    @GetMapping
    public List<Food> getAllFood() {
        return foodRepository.findAll();
    }

    //recuperation d'un aliment par son id ( pour  lier les formulaire coté angular lors de la saisie du journal alimentaire )
    @GetMapping("/{id}")
    public Food getFoodById(@PathVariable int id) {
        //je range ci dessous ma methode dans un optionnal pour lui dire quoi faire si le resultat est nul
        Optional<Food> food = foodRepository.findById(id);
        if (food.isPresent()) {
            return food.get();
        } else {
            //retourner un code d'erreur ......
        }
        return null;
    }

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
    @DeleteMapping("{id}")
    public void deleteFood(@PathVariable Integer id) {
        foodRepository.deleteById(id);
    }

}
