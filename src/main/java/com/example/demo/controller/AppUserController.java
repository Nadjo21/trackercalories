package com.example.demo.controller;
import com.example.demo.model.AppUser;
import com.example.demo.repository.AppUserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/appuser")

public class AppUserController {

    private AppUserRepository appUserRepository;


    public AppUserController(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    // Sélection de la liste de tous les users
    @GetMapping
    public List<AppUser> getAllAppuser() {
        return appUserRepository.findAll();
    }

    //recuperation d'un users par son id ( pour  lier les formulaire coté angular lors de la saisie du journal alimentaire )
    @GetMapping("/{id}")
    public AppUser getAppuserById(@PathVariable Long id) {
        //je range ci dessous ma methode dans un optionnal pour lui dire quoi faire si le resultat est nul
        Optional<AppUser> appuser = appUserRepository.findById(id);
        if (appuser.isPresent()) {
            return appuser.get();
        } else {
            //retourner un code d'erreur ......
        }
        return null;
    }





}
