package com.gft.desafiocielo.model;

public class DadosDomicilioBancario {

	private Long codigoBanco;
	private Long numeroAgencia;
	private String numeroContaCorrente;
	public Long getCodigoBanco() {
		return codigoBanco;
	}
	public void setCodigoBanco(Long codigoBanco) {
		this.codigoBanco = codigoBanco;
	}
	public Long getNumeroAgencia() {
		return numeroAgencia;
	}
	public void setNumeroAgencia(Long numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	public String getNumeroContaCorrente() {
		return numeroContaCorrente;
	}
	public void setNumeroContaCorrente(String numeroContaCorrente) {
		this.numeroContaCorrente = numeroContaCorrente;
	}
	@Override
	public String toString() {
		return "DadosDomicilioBancario [codigoBanco=" + codigoBanco + ", numeroAgencia=" + numeroAgencia
				+ ", numeroContaCorrente=" + numeroContaCorrente + "]";
	}
	
}
