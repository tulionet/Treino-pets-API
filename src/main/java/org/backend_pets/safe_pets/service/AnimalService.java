package org.backend_pets.safe_pets.service;

import jakarta.validation.Valid;
import org.backend_pets.safe_pets.exception.AnimalNaoEncontradoException;
import org.backend_pets.safe_pets.model.Animal;
import org.backend_pets.safe_pets.repository.AnimalRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AnimalService {
    private final AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public Animal salvarAnimal(@Valid Animal animal) {
        animal.setCadastradoEm(LocalDateTime.now());
        return this.animalRepository.save(animal);
    }

    public List<Animal> buscarTodos() {
        return this.animalRepository.findAll();
    }

    public Animal buscarPorId(String id) {
        return animalRepository.findById(id).orElseThrow(AnimalNaoEncontradoException::new);
    }

    public Animal atualizar(Animal animal) {
        Animal animalBD = animalRepository.findById(animal.getId())
                .orElseThrow(AnimalNaoEncontradoException::new);
        animal.setCadastradoEm(animalBD.getCadastradoEm());
        return this.animalRepository.save(animal);
    }

    public void deletarPorId(String id) {
        animalRepository.delete(animalRepository.findById(id).
                orElseThrow(AnimalNaoEncontradoException::new)
        );
    }
}
