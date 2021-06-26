package br.com.alura.springdata.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.springdata.orm.Unidade;

@Repository
public interface UnidadeRepository extends CrudRepository<Unidade, Integer> {

}