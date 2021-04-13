package com.algaworks.erp.model;

public enum TipoEmpresa {

	MEI("Microempreendedor Individual"), EIRELI("Empresa Individual de Responsabilidade"), LTDA("Sociedade Limitada"),
	SA("Sociedade Anonima");

	private String descricao;

	TipoEmpresa(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
