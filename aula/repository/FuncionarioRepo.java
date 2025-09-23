package com.example.aula.repository;

import com.example.aula.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepo extends JpaRepository<Funcionario, Long> {
}
