package com.bootcamp.microservicio_stock.persistencia.repository;

import com.bootcamp.microservicio_stock.persistencia.entity.CategoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaEntity, Long> {
}