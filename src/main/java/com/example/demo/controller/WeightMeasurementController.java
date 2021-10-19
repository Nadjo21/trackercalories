package com.example.demo.controller;

import com.example.demo.model.WeightMeasurement;
import com.example.demo.repository.WeightMeasurementRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/weightmeasurement")
public class WeightMeasurementController {

    private WeightMeasurementRepository weightMeasurementRepository;
    public WeightMeasurementController(WeightMeasurementRepository weightMeasurementRepository) {
        this.weightMeasurementRepository = weightMeasurementRepository;
    }

    //  ci dessous getMapping pour filtrer les weight par l'id du user
    @GetMapping("/{id}")
    List<WeightMeasurement> getWeightByUser(@PathVariable int id) {
        return weightMeasurementRepository.findWeightMeasurementByAppuser_Id(id);
    }

    @PostMapping
    public void createWeightMeasurement(@RequestBody WeightMeasurement weightMeasurementToCreate) {
        weightMeasurementRepository.save(weightMeasurementToCreate);
    }
}


//    @GetMapping
//    public List<WeightMeasurement> getAllWeightMeasurement() {
//        return weightMeasurementRepository.findAll();
//    }

