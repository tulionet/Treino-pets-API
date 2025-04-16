package org.backend_pets.safe_pets.model;

import lombok.AllArgsConstructor;

import java.util.Date;

@AllArgsConstructor
public class Voluntario {
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private String localizacao;
    private String funcoes;
}
