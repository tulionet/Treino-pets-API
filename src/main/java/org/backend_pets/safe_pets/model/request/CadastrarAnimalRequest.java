package org.backend_pets.safe_pets.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.backend_pets.safe_pets.model.Porte;

import java.time.LocalDateTime;
import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
public class CadastrarAnimalRequest {

    private String nome;
    private String especie;
    private String raca;
    private String situacao;
    private Porte porte;
    private Date dataNascimento;
    private Boolean castrado;
    private LocalDateTime cadastradoEm;

}
