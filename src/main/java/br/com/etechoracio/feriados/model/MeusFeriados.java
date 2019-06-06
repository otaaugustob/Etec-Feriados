package br.com.etechoracio.feriados.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.etechoracio.feriados.enums.TipoFeriadosEnum;

@Entity
@Table(name="TBL_FERIADOS")
public class MeusFeriados {
	
	@Id
	@GeneratedValue
	@Column(name="ID_FERIADO")
	private Long id;
	
	@Column(name="TX_NOME")
	private String nome;
	
	@Enumerated(EnumType.STRING)
	@Column(name="TP_FERIADO")
	private TipoFeriadosEnum tipo;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoFeriadosEnum getTipo() {
		return tipo;
	}

	public void setTipo(TipoFeriadosEnum tipo) {
		this.tipo = tipo;
	}

	public Date getDataferiado() {
		return dataferiado;
	}

	public void setDataferiado(Date dataferiado) {
		this.dataferiado = dataferiado;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATA_FERIADO")	private Date dataferiado;
	

}
