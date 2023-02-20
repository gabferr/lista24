package br.edu.unoesc.Lista24.Repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.edu.unoesc.Lista24.model.Aluno;

public interface AlunoRepository extends CrudRepository<Aluno, Long> {

	public List<Aluno> findByNomeIgnoringCase(String nome);

	@Query("Select l from Aluno l where l.salario >= :salario")
	public List<Aluno> porSalario(@Param("salario") BigDecimal salario);

	@Query("Select l from Aluno l where upper(l.nome) like upper(concat('%', :filtro, '%')) order by nome")
	public List<Aluno> findByFiltro(@Param("filtro") String filtro);

}