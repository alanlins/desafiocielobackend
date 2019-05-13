package com.gft.desafiocielo.model;

import java.util.Arrays;

public class LancamentoContaLegado {

	private TotalControleLancamento totalControleLancamento;
	private ControleLancamento[] listaControleLancamento;
	private Long indice;
	private Long tamanhoPagina;
	private Long totalElements;
	
	public Long getIndice() {
		return indice;
	}
	public void setIndice(Long indice) {
		this.indice = indice;
	}
	public Long getTamanhoPagina() {
		return tamanhoPagina;
	}
	public void setTamanhoPagina(Long tamanhoPagina) {
		this.tamanhoPagina = tamanhoPagina;
	}
	public Long getTotalElements() {
		return totalElements;
	}
	public void setTotalElements(Long totalElements) {
		this.totalElements = totalElements;
	}
	public TotalControleLancamento getTotalControleLancamento() {
		return totalControleLancamento;
	}
	public void setTotalControleLancamento(TotalControleLancamento totalControleLancamento) {
		this.totalControleLancamento = totalControleLancamento;
	}
	public ControleLancamento[] getListaControleLancamento() {
		return listaControleLancamento;
	}
	public void setListaControleLancamento(ControleLancamento[] listaControleLancamento) {
		this.listaControleLancamento = listaControleLancamento;
	}
	@Override
	public String toString() {
		return "LancamentoContaLegado [indice=" + indice + ", tamanhoPagina=" + tamanhoPagina + ", totalElements="
				+ totalElements + ", totalControleLancamento=" + totalControleLancamento + ", listaControleLancamento="
				+ Arrays.toString(listaControleLancamento) + "]";
	}
	
}
