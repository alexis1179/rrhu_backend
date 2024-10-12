package com.irvin.funes.rrhh.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IncapacidadDiasUsuarioDto {
    private Long id;
    private double cantidad_dias;
    private String mes;
    private String año;
    private Long usuario_id;

    public IncapacidadDiasUsuarioDto(Long id, double cantidad_dias, String mes, String año, Long usuario_id) {
        this.id = id;
        this.cantidad_dias = cantidad_dias;
        this.mes = mes;
        this.año = año;
        this.usuario_id = usuario_id;
    }
}
