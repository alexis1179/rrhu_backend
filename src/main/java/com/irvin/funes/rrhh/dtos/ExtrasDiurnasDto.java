package com.irvin.funes.rrhh.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExtrasDiurnasDto {
    private Long id;
    private double cantidad_horas;
    private String mes;
    private String año;
    private Long usuario_id;

    public ExtrasDiurnasDto(Long id, double cantidad_horas, String mes, String año, Long usuario_id) {
        this.id = id;
        this.cantidad_horas = cantidad_horas;
        this.mes = mes;
        this.año = año;
        this.usuario_id = usuario_id;
    }
}
