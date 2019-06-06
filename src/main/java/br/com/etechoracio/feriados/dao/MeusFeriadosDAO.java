package br.com.etechoracio.feriados.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.etechoracio.feriados.model.MeusFeriados;

public interface MeusFeriadosDAO extends JpaRepository<MeusFeriados, Long> {

}
