package org.backend_pets.safe_pets.model;

import lombok.AllArgsConstructor;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
public class Tutor {
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private String localizacao;
    private List<Animal> animais;
}
