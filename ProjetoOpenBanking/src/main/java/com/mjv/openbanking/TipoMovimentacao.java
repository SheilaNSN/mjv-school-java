package com.mjv.openbanking;

public enum TipoMovimentacao {
	RECEITA("R"),
	DESPESA("S");

	private String sigla;

	private TipoMovimentacao(String sigla) {
		this.sigla = sigla;
	}

	public String getSigla() {
		return sigla;
	}

}
