package com.bootcamp.microservicio_stock.dto;

import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaDto {
    private Long uniqueID;
    private String nombre;
    @NotNull
    private String descripcion;
}
