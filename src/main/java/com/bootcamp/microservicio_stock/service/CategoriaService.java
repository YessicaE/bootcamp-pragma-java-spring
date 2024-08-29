package com.bootcamp.microservicio_stock.service;

import com.bootcamp.microservicio_stock.dto.CategoriaDto;
import com.bootcamp.microservicio_stock.error.ErrorCategoriaDebeTenerDescripcion;
import com.bootcamp.microservicio_stock.error.ErrorNombreMayor50Caracteres;
import com.bootcamp.microservicio_stock.mapper.CategoriaMapper;
import com.bootcamp.microservicio_stock.persistencia.entity.CategoriaEntity;
import com.bootcamp.microservicio_stock.persistencia.repository.CategoriaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor

public class CategoriaService {

    private final String CARACTERES_NULL  = null;
    private final Integer CARACTERES_MAX_NOMBRE  = 50;
    private final Integer CARACTERES_MAX_DESCRIPCION  = 90;

    private final CategoriaRepository categoriaRepository;
    private final CategoriaMapper categoriaMapper;

    public List<CategoriaDto> obtenerCategorias(){
        return categoriaRepository
                .findAll()
                .stream()
                .map(categoriaEntity -> categoriaMapper.categoriaEntityToCategoriaDto(categoriaEntity))
                .collect(Collectors.toList());
    }

    public CategoriaDto crearCategoria(CategoriaDto categoria){
        if (categoria.getDescripcion() == CARACTERES_NULL) {
            throw new ErrorCategoriaDebeTenerDescripcion("Todas las categorías deben tener una descripción");
        }
        if (categoria.getNombre().length() > CARACTERES_MAX_NOMBRE) {
            throw new ErrorCategoriaDebeTenerDescripcion("El tamaño máximo del nombre debe ser de 50 caracteres");
        }
        if (categoria.getDescripcion().length() > CARACTERES_MAX_DESCRIPCION) {
            throw new ErrorCategoriaDebeTenerDescripcion("El tamaño máximo de la descripción debe ser de 90 caracteres");
        }        CategoriaEntity categoriaEntity = this.categoriaRepository.save(
                categoriaMapper.categoriaDtoToCategoriaEntity(categoria)
        );
        return categoria;
    }
}
