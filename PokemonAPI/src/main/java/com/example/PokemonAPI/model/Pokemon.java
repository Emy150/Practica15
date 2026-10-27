package com.example.PokemonAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aspectj.bridge.IMessage;
import org.hibernate.validator.constraints.URL;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre no puede ser vacío")
    @Size(min = 2, max = 50, message = "El nombre debe tener entre 2 y 50 caracteres")
    private String nombre;

    @NotBlank(message = "El tipo no puede ser vacío")
    private String tipo;

    @NotNull(message = "El nivel es requerido")
    @Min(value = 1, message = "El valor minimo esd 1")
    @Max(value = 100, message = "El nivel máximo es 100")
    private Integer nivel;

    @Min(value = 1, message = "El ataque minimo es 1")
    private Integer ataque;

    @Min(value = 1, message = "La defensa no puede ser negativa")
    private Integer defensa;

    @Size(max = 255, message = "La longitud de la descripción no puede exceder los 255 caractere")
    private String descripcion;

    @URL(message = "La imagen debe sere una URL")
    private String imagenUrl;

    @Email(message = "El correo debe tener un formato valido")
    private String correoEntrenador;

    @PastOrPresent(message = "La fecha de nacimiento no puede ser mayot a la actual")
    private LocalDate fechaNacimiento;

    @Positive(message = "El peso del pokemon debe ser mayor a 0")
    private Double peso;

    @Pattern(regexp = "^\\d{10}$" , message = "El formato del telefono no es válido")
    private String telefonoEntrenador;

    @AssertTrue(message = "El pokemon debe estar sanito")
    private Boolean estaSano;
}
