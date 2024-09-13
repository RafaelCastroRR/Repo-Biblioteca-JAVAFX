package com.rafaelcastro.webapp.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelcastro.webapp.biblioteca.model.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long> {


}
