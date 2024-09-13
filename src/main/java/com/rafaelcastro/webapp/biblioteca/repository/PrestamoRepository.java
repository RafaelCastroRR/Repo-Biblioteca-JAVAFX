package com.rafaelcastro.webapp.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelcastro.webapp.biblioteca.model.Prestamo;

public interface PrestamoRepository extends JpaRepository<Prestamo, Long> {

}
