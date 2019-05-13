package com.gft.desafiocielo.model;

public class LancamentoContaCorrenteCliente {

	private Long numeroRemessaBanco;
	private String[] dadosAnaliticoLancamentoFinanceiroCliente;
	private String nomeSituacaoRemessa;
	private DadosDomicilioBancario dadosDomicilioBancario;
	private String nomeTipoOperacao;
	
	public Long getNumeroRemessaBanco() {
		return numeroRemessaBanco;
	}
	public void setNumeroRemessaBanco(Long numeroRemessaBanco) {
		this.numeroRemessaBanco = numeroRemessaBanco;
	}
	public String[] getDadosAnaliticoLancamentoFinanceiroCliente() {
		return dadosAnaliticoLancamentoFinanceiroCliente;
	}
	public void setDadosAnaliticoLancamentoFinanceiroCliente(String[] dadosAnaliticoLancamentoFinanceiroCliente) {
		this.dadosAnaliticoLancamentoFinanceiroCliente = dadosAnaliticoLancamentoFinanceiroCliente;
	}
	public String getNomeSituacaoRemessa() {
		return nomeSituacaoRemessa;
	}
	public void setNomeSituacaoRemessa(String nomeSituacaoRemessa) {
		this.nomeSituacaoRemessa = nomeSituacaoRemessa;
	}
	public String getNomeTipoOperacao() {
		return nomeTipoOperacao;
	}
	public void setNomeTipoOperacao(String nomeTipoOperacao) {
		this.nomeTipoOperacao = nomeTipoOperacao;
	}
	public DadosDomicilioBancario getDadosDomicilioBancario() {
		return dadosDomicilioBancario;
	}
	public void setDadosDomicilioBancario(DadosDomicilioBancario dadosDomicilioBancario) {
		this.dadosDomicilioBancario = dadosDomicilioBancario;
	}
	@Override
	public String toString() {
		return "LancamentoContaCorrenteCliente [numeroRemessaBanco=" + numeroRemessaBanco + ", nomeSituacaoRemessa="
				+ nomeSituacaoRemessa + ", nomeTipoOperacao=" + nomeTipoOperacao + ", dadosDomicilioBancario="
				+ dadosDomicilioBancario + "]";
	}
	
	
}
