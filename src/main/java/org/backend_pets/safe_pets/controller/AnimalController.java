package org.backend_pets.safe_pets.controller;

import jakarta.validation.Valid;
import org.backend_pets.safe_pets.exception.AnimalNaoEncontradoException;
import org.backend_pets.safe_pets.mapper.AnimalMapper;
import org.backend_pets.safe_pets.model.Animal;
import org.backend_pets.safe_pets.model.request.AtualizarAnimalRequest;
import org.backend_pets.safe_pets.model.request.CadastrarAnimalRequest;
import org.backend_pets.safe_pets.model.response.CadastrarAnimalResponse;
import org.backend_pets.safe_pets.service.AnimalService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animais")
public class AnimalController {

    private final AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping
    public List<Animal> getAnimais() {
        return animalService.buscarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPorId (@PathVariable String id) {
        try{
            return new ResponseEntity<Animal>(animalService.buscarPorId(id),HttpStatus.OK);
        } catch (AnimalNaoEncontradoException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public CadastrarAnimalResponse adicionarAnimal(@RequestBody @Valid CadastrarAnimalRequest cadastrarAnimalRequest) {
        return AnimalMapper.mapCadastrar(animalService.salvarAnimal(AnimalMapper.mapCadastrarRequest(cadastrarAnimalRequest)));
    }

    @PutMapping
    public ResponseEntity<?> alterarAnimal(@RequestBody @Valid AtualizarAnimalRequest atualizarAnimalRequest) {
        try {

            AnimalMapper.mapAtualizar(animalService.atualizar(AnimalMapper.mapAtualizarRequest(atualizarAnimalRequest)));
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (AnimalNaoEncontradoException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id) {
        animalService.deletarPorId(id);
    }

}
