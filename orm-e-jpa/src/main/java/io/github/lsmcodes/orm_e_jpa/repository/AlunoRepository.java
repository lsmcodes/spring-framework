package io.github.lsmcodes.orm_e_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.lsmcodes.orm_e_jpa.model.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
        
}