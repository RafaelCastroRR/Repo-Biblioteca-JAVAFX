package com.rafaelcastro.webapp.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelcastro.webapp.biblioteca.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}