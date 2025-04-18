package org.backend_pets.safe_pets.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Animal {
    @Id
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
