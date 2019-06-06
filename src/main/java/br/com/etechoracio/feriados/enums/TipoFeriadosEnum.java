package br.com.etechoracio.feriados.enums;

public enum TipoFeriadosEnum {
	
	MUNICIPAL("Municipal"),
	ESTADUAL("Estadual"),
	NACIONAL("Nacional"),
	FACULTATIVO("Facultativo");

	private String descricao;

	private TipoFeriadosEnum(String descricao) {
		this.setDescricao(descricao);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	

}
