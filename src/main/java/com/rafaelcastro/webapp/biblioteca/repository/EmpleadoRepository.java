package com.rafaelcastro.webapp.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelcastro.webapp.biblioteca.model.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
    
}