//package com.example.demo.controller;
//import com.example.demo.model.Imc;
//import com.example.demo.repository.ImcRepository;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@CrossOrigin(origins = "*")
//
//@RequestMapping("api/imc")
//public class ImcController {
//
//
//    private ImcRepository imcRepository;
//
//    public ImcController(ImcRepository imcRepository) {
//        this.imcRepository = imcRepository;}
//
////ok
//    @GetMapping
//    public double calculImc  (@RequestParam double weight, @RequestParam double height) {
//        double  imc1 = weight / (height * height);
//return imc1;
//    }
//
////    // Sélection de tous les Imc
////    @GetMapping
////    public List<Imc> GetAllImc() {
////        return imcRepository.findAll();
////    }
////
////    // Création de nouveaux Imc
////    @PostMapping
////    public void createImc(@RequestBody  Imc imcToCreate) {
////        imcRepository.save(imcToCreate);
////    }
//
//
//
//}
