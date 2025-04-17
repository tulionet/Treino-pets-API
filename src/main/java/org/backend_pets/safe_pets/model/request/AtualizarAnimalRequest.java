package org.backend_pets.safe_pets.model.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.backend_pets.safe_pets.model.Porte;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class AtualizarAnimalRequest {

    private String id;
    private String nome;
    @NotBlank(message = "Especie deve ser informada")
    private String especie;
    private String raca;
    private String situacao;
    @NotNull
    private Porte porte;
    private Date dataNascimento;
    private Boolean castrado;
    private LocalDateTime cadastradoEm;
}
