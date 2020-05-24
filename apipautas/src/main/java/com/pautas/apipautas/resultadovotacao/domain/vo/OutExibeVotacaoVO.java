package com.pautas.apipautas.resultadovotacao.domain.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreType
public class OutExibeVotacaoVO implements Serializable {

	private static final long serialVersionUID = 2063608091009143230L;
	
	@JsonProperty("descricao_pauta")
	private String  descricaoPauta;
	
	@JsonProperty("total_votos_validos")
	private long totalVotosValidos;
	
	@JsonProperty("voto_sim")
	private long votosSim;
	
	@JsonProperty("voto_nao")
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
	
	@Override
	public String toString() {
		return "OutExibeVotacaoVO [descricaoPauta=" + descricaoPauta + ", totalVotosValidos=" + totalVotosValidos
				+ ", votosSim=" + votosSim + ", votosNao=" + votosNao + "]";
	}
	
}
