package com.pautas.apipautas.resultadovotacao.domain.vo;

import java.io.Serializable;

public class OutExibeVotacaoVO implements Serializable {

	private static final long serialVersionUID = 2063608091009143230L;
	
	private String  descricaoPauta;
	private long totalVotosValidos;
	private long votosSim;
	private long votosNao;
	
	public String getDescricaoPauta() {
		return descricaoPauta;
	}
	public void setDescricaoPauta(String descricaoPauta) {
		this.descricaoPauta = descricaoPauta;
	}
	public long getTotalVotosValidos() {
		return totalVotosValidos;
	}
	public void setTotalVotosValidos(long totalVotosValidos) {
		this.totalVotosValidos = totalVotosValidos;
	}
	public long getVotosSim() {
		return votosSim;
	}
	public void setVotosSim(long votosSim) {
		this.votosSim = votosSim;
	}
	public long getVotosNao() {
		return votosNao;
	}
	public void setVotosNao(long votosNao) {
		this.votosNao = votosNao;
	}
}
