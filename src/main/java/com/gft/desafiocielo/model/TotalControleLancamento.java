package com.gft.desafiocielo.model;

public class TotalControleLancamento {

	private Long quantidadeLancamentos;
	private Long quantidadeRemessas;
	private Double valorLancamentos;
	
	public Long getQuantidadeLancamentos() {
		return quantidadeLancamentos;
	}
	public void setQuantidadeLancamentos(Long quantidadeLancamentos) {
		this.quantidadeLancamentos = quantidadeLancamentos;
	}
	public Long getQuantidadeRemessas() {
		return quantidadeRemessas;
	}
	public void setQuantidadeRemessas(Long quantidadeRemessas) {
		this.quantidadeRemessas = quantidadeRemessas;
	}
	public Double getValorLancamentos() {
		return valorLancamentos;
	}
	public void setValorLancamentos(Double valorLancamentos) {
		this.valorLancamentos = valorLancamentos;
	}
	@Override
	public String toString() {
		return "TotalControleLancamento [quantidadeLancamentos=" + quantidadeLancamentos + ", quantidadeRemessas="
				+ quantidadeRemessas + ", valorLancamentos=" + valorLancamentos + "]";
	}
	
}
