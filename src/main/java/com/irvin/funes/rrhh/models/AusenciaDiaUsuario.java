package com.irvin.funes.rrhh.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ausenciaDia-usuario")
public class AusenciaDiaUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double cantidad_horas;
    private String mes;
    private String año;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    @JsonIgnore // Esto evitará que el usuario completo aparezca en el JSON
    private Usuario usuario;
}
