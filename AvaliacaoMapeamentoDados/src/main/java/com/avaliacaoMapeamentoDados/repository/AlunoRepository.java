package com.avaliacaoMapeamentoDados.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jdbc.repository.query.Query;
import com.avaliacaoMapeamentoDados.entities.Aluno;


public interface AlunoRepository extends JpaRepository<Aluno, Long> {
	List<Aluno> findByCidade(String cidade);
	/*List<Aluno> findByNome(String nome);*/
	List<Aluno> findByRenda(Double renda);
	List<Aluno> findByRa(String ra);
    List<Aluno> findByCidadeAndRenda(String cidade, Double renda);
    
    //Buscar todos os alunos com nome "xxx":
    @Query("SELECT a FROM Aluno a WHERE a.nome = :nome")
    List<Aluno> findByNome(@Param("nome") String nome);
    
    //Buscar Nome completo
    @Query("SELECT a FROM Aluno a WHERE a.nomeCompleto LIKE :nomeCompleto")
    List<Aluno> findByNomeLike(@Param("nomeCompleto") String nomeCompleto);
    
    //Buscar todos os alunos de uma determinada turma:
    @Query("SELECT a FROM Aluno a JOIN a.turma t.WHERE t.id = :turmaId")
    List<Aluno> findByTurmaId(@Param("turmaId")Long turmaId);

}
