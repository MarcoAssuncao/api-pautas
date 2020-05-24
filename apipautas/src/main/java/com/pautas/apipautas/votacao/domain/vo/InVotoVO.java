package com.pautas.apipautas.votacao.domain.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreType
public class InVotoVO implements Serializable {

	private static final long serialVersionUID = -8624728922447556918L;
	
	@JsonProperty("id_associado")
	private Integer codigoAssociado;
	
	@JsonProperty("id_pauta")
	private Integer codigoPauta;
	
	@JsonProperty("voto_sim")
	private Boolean votoSim;
	
	@JsonProperty("voto_nao")
	private Boolean votoNao;
	
	public Integer getCodigoAssociado() {
		return codigoAssociado;
	}
	public void setCodigoAssociado(Integer codigoAssociado) {
		this.codigoAssociado = codigoAssociado;
	}
	public Integer getCodigoPauta() {
		return codigoPauta;
	}
	public void setCodigoPauta(Integer codigoPauta) {
		this.codigoPauta = codigoPauta;
	}
	public Boolean getVotoSim() {
		return votoSim;
	}
	public void setVotoSim(Boolean votoSim) {
		this.votoSim = votoSim;
	}
	public Boolean getVotoNao() {
		return votoNao;
	}
	public void setVotoNao(Boolean votoNao) {
		this.votoNao = votoNao;
	}
	
	@Override
	public String toString() {
		return "InVotoVO [codigoAssociado=" + codigoAssociado + ", codigoPauta=" + codigoPauta + ", votoSim=" + votoSim
				+ ", votoNao=" + votoNao + "]";
	}
	
}
