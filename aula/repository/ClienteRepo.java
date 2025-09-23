package com.example.aula.repository;

import com.example.aula.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepo extends JpaRepository <Cliente, Long> {
    Optional<Cliente> findByprotocolo(String protocolo);
}
