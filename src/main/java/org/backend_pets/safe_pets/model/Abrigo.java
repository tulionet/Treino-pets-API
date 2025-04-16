package org.backend_pets.safe_pets.model;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class Abrigo {
    private String responsável;
    private Integer capacidadeTotal;
    private List<Animal> animais;
    private String localizacao;
}
