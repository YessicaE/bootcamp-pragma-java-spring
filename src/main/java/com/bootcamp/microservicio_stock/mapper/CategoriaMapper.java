package com.bootcamp.microservicio_stock.mapper;

import com.bootcamp.microservicio_stock.dto.CategoriaDto;
import com.bootcamp.microservicio_stock.persistencia.entity.CategoriaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CategoriaMapper {


    CategoriaDto categoriaEntityToCategoriaDto(CategoriaEntity categoria);

    CategoriaEntity categoriaDtoToCategoriaEntity (CategoriaDto categoria);
}
