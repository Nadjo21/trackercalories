package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;
import com.example.demo.repository.AppUserRepository;



@RestController
@CrossOrigin(origins="*")

public class AppUserController {

    private AppUserRepository appUserRepository;

    public AppUserController (AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;}
}
