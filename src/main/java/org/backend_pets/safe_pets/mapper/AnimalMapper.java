package org.backend_pets.safe_pets.mapper;

import org.backend_pets.safe_pets.model.Animal;
import org.backend_pets.safe_pets.model.request.AtualizarAnimalRequest;
import org.backend_pets.safe_pets.model.request.CadastrarAnimalRequest;
import org.backend_pets.safe_pets.model.response.AtualizarAnimalResponse;
import org.backend_pets.safe_pets.model.response.CadastrarAnimalResponse;

public class AnimalMapper {
    public static Animal mapCadastrarRequest(CadastrarAnimalRequest cadastrarAnimalRequest){
        Animal animal = new Animal();
        animal.setNome(cadastrarAnimalRequest.getNome());
        animal.setEspecie(cadastrarAnimalRequest.getEspecie());
        animal.setRaca(cadastrarAnimalRequest.getRaca());
        animal.setSituacao(cadastrarAnimalRequest.getSituacao());
        animal.setPorte(cadastrarAnimalRequest.getPorte());
        animal.setDataNascimento(cadastrarAnimalRequest.getDataNascimento());
        animal.setCastrado(cadastrarAnimalRequest.getCastrado());
        animal.setCadastradoEm(cadastrarAnimalRequest.getCadastradoEm());
        return animal;
    }

    public static CadastrarAnimalResponse mapCadastrar(Animal animal){
        CadastrarAnimalResponse cadastrarAnimalResponse = new CadastrarAnimalResponse();
        return cadastrarAnimalResponse;
    }

    public static AtualizarAnimalResponse mapAtualizar(Animal animal){
        AtualizarAnimalResponse atualizarAnimalResponse = new AtualizarAnimalResponse();
        return atualizarAnimalResponse;
    }

    public static Animal mapAtualizarRequest(AtualizarAnimalRequest cadastrarAnimalRequest){
        Animal animal = new Animal();
        animal.setId(cadastrarAnimalRequest.getId());
        animal.setNome(cadastrarAnimalRequest.getNome());
        animal.setEspecie(cadastrarAnimalRequest.getEspecie());
        animal.setRaca(cadastrarAnimalRequest.getRaca());
        animal.setSituacao(cadastrarAnimalRequest.getSituacao());
        animal.setPorte(cadastrarAnimalRequest.getPorte());
        animal.setDataNascimento(cadastrarAnimalRequest.getDataNascimento());
        animal.setCastrado(cadastrarAnimalRequest.getCastrado());
        animal.setCadastradoEm(cadastrarAnimalRequest.getCadastradoEm());
        return animal;
    }

}
