package org.backend_pets.safe_pets.model;

import lombok.AllArgsConstructor;

import java.util.Date;


@AllArgsConstructor
public class Animal {
    private String Nome;
    private String especie;
    private String raca;
    private String situacao;
    private String porte;
    private Date dataNascimento;
    private boolean castrado;
}
