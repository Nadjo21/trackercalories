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

    @GetMapping
    public List<WeightMeasurement> getAllWeightMeasurement() {return weightMeasurementRepository.findAll();}


    @PostMapping
    public void createWeightMeasurement(@RequestBody WeightMeasurement weightMeasurementToCreate){
        weightMeasurementRepository.save(weightMeasurementToCreate);

    }




}
