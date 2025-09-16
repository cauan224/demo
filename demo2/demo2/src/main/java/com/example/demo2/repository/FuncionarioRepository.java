package com.example.demo2.repository;

import com.example.demo2.model.Funcionariol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionariol, UUID> {
}
