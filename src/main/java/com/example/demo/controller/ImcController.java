package com.example.demo.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")

@RequestMapping("/api/imc")
public class ImcController {


    @GetMapping
    public double calculImc(@RequestParam int weight,@RequestParam double height) {
        return weight / (height * height);

    }

}
