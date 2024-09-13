package com.rafaelcastro.webapp.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelcastro.webapp.biblioteca.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    
}