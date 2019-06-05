package enums;

public enum TipoFeriadosEnum {
	
	MUNICIPAL("Municipal"),
	ESTADUAL("Estadual"),
	NACIONAL("Nacional"),
	FACULTATIVO("Facultativo");

	private String descricao;

	private TipoFeriadosEnum(String descricao) {
		this.descricao = descricao;
	}
	
	
	

}
