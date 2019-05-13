package com.gft.desafiocielo.model;

public class ControleLancamento {

	private LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente;
	private String dataEfetivaLancamento;
	private String dataLancamentoContaCorrenteCliente;
	private Long numeroEvento;
	private String descricaoGrupoPagamento;
	private String codigoIdentificadorUnico;
	private String nomeBanco;
	private Long quantidadeLancamentoRemessa;
	private String numeroRaizCNPJ;
	private String numeroSufixoCNPJ;
	private Double valorLancamentoRemessa;
	private Long dateLancamentoContaCorrenteCliente;
	private Long dateEfetivaLancamento;
	
	public String getDataEfetivaLancamento() {
		return dataEfetivaLancamento;
	}
	public void setDataEfetivaLancamento(String dataEfetivaLancamento) {
		this.dataEfetivaLancamento = dataEfetivaLancamento;
	}
	public String getDataLancamentoContaCorrenteCliente() {
		return dataLancamentoContaCorrenteCliente;
	}
	public void setDataLancamentoContaCorrenteCliente(String dataLancamentoContaCorrenteCliente) {
		this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
	}
	public Long getNumeroEvento() {
		return numeroEvento;
	}
	public void setNumeroEvento(Long numeroEvento) {
		this.numeroEvento = numeroEvento;
	}
	public String getDescricaoGrupoPagamento() {
		return descricaoGrupoPagamento;
	}
	public void setDescricaoGrupoPagamento(String descricaoGrupoPagamento) {
		this.descricaoGrupoPagamento = descricaoGrupoPagamento;
	}
	public String getCodigoIdentificadorUnico() {
		return codigoIdentificadorUnico;
	}
	public void setCodigoIdentificadorUnico(String codigoIdentificadorUnico) {
		this.codigoIdentificadorUnico = codigoIdentificadorUnico;
	}
	public String getNomeBanco() {
		return nomeBanco;
	}
	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
	public Long getQuantidadeLancamentoRemessa() {
		return quantidadeLancamentoRemessa;
	}
	public void setQuantidadeLancamentoRemessa(Long quantidadeLancamentoRemessa) {
		this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
	}
	public String getNumeroRaizCNPJ() {
		return numeroRaizCNPJ;
	}
	public void setNumeroRaizCNPJ(String numeroRaizCNPJ) {
		this.numeroRaizCNPJ = numeroRaizCNPJ;
	}
	public String getNumeroSufixoCNPJ() {
		return numeroSufixoCNPJ;
	}
	public void setNumeroSufixoCNPJ(String numeroSufixoCNPJ) {
		this.numeroSufixoCNPJ = numeroSufixoCNPJ;
	}
	public Double getValorLancamentoRemessa() {
		return valorLancamentoRemessa;
	}
	public void setValorLancamentoRemessa(Double valorLancamentoRemessa) {
		this.valorLancamentoRemessa = valorLancamentoRemessa;
	}
	public Long getDateLancamentoContaCorrenteCliente() {
		return dateLancamentoContaCorrenteCliente;
	}
	public void setDateLancamentoContaCorrenteCliente(Long dateLancamentoContaCorrenteCliente) {
		this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
	}
	public Long getDateEfetivaLancamento() {
		return dateEfetivaLancamento;
	}
	public void setDateEfetivaLancamento(Long dateEfetivaLancamento) {
		this.dateEfetivaLancamento = dateEfetivaLancamento;
	}
	public LancamentoContaCorrenteCliente getLancamentoContaCorrenteCliente() {
		return lancamentoContaCorrenteCliente;
	}
	public void setLancamentoContaCorrenteCliente(LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente) {
		this.lancamentoContaCorrenteCliente = lancamentoContaCorrenteCliente;
	}
	@Override
	public String toString() {
		return "ControleLancamento [dataEfetivaLancamento=" + dataEfetivaLancamento
				+ ", dataLancamentoContaCorrenteCliente=" + dataLancamentoContaCorrenteCliente + ", numeroEvento="
				+ numeroEvento + ", descricaoGrupoPagamento=" + descricaoGrupoPagamento + ", codigoIdentificadorUnico="
				+ codigoIdentificadorUnico + ", nomeBanco=" + nomeBanco + ", quantidadeLancamentoRemessa="
				+ quantidadeLancamentoRemessa + ", numeroRaizCNPJ=" + numeroRaizCNPJ + ", numeroSufixoCNPJ="
				+ numeroSufixoCNPJ + ", valorLancamentoRemessa=" + valorLancamentoRemessa
				+ ", dateLancamentoContaCorrenteCliente=" + dateLancamentoContaCorrenteCliente
				+ ", dateEfetivaLancamento=" + dateEfetivaLancamento + ", lancamentoContaCorrenteCliente="
				+ lancamentoContaCorrenteCliente + "]";
	}
	
}
