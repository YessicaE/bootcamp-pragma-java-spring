package com.bootcamp.microservicio_stock.controller;

import com.bootcamp.microservicio_stock.dto.CategoriaDto;
import com.bootcamp.microservicio_stock.error.ErrorCategoriaDebeTenerDescripcion;
import com.bootcamp.microservicio_stock.error.ErrorNombreMayor50Caracteres;
import com.bootcamp.microservicio_stock.mapper.CategoriaMapper;
import com.bootcamp.microservicio_stock.persistencia.entity.CategoriaEntity;
import com.bootcamp.microservicio_stock.persistencia.repository.CategoriaRepository;
import com.bootcamp.microservicio_stock.service.CategoriaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/categorias")
@RequiredArgsConstructor
public class CategoriaController {

    private final CategoriaService categoriaService;

    @PostMapping
    private CategoriaDto crearCategoria(@RequestBody CategoriaDto categoria){
        return categoriaService.crearCategoria(categoria);
    }
    @GetMapping
    private List<CategoriaDto> obtenerCategoria(){
        return categoriaService.obtenerCategorias();
    }

}
