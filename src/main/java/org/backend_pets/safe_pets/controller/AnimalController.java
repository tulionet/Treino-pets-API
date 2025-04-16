package org.backend_pets.safe_pets.controller;

import org.backend_pets.safe_pets.model.Animal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Animais")
public class AnimalController {

    @GetMapping
    public List<Animal> getAnimais() {
        return null;
    }

    @PostMapping
    public Animal adicionarAnimal(@RequestBody Animal animal) {
        return animal;
    }
}
