package com.example.PokemonAPI.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDTO {

    // No todo necesita validaciones. Solo lo que el usuarioo nos envia porq siempre miente
    private String mensaje;
    private List<String> detalles;
    private LocalDateTime fecha;
}
