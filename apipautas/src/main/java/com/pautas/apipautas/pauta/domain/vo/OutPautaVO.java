package com.pautas.apipautas.pauta.domain.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreType
public class OutPautaVO implements Serializable {

	private static final long serialVersionUID = -3006829544546102499L;
	
	@JsonProperty("id_pauta")
	private Integer codigoPauta;
	
	@JsonProperty("descricao_pauta")
	private String  descricaoPauta;
	
	@JsonProperty("situacao_pauta")
	private String  situacaoPauta;

	public Integer getCodigoPauta() {
		return codigoPauta;
	}
	public void setCodigoPauta(Integer codigoPauta) {
		this.codigoPauta = codigoPauta;
	}
	public String getDescricaoPauta() {
		return descricaoPauta;
	}
	public void setDescricaoPauta(String descricaoPauta) {
		this.descricaoPauta = descricaoPauta;
	}
	public String getSituacaoPauta() {
		return situacaoPauta;
	}
	public void setSituacaoPauta(String situacaoPauta) {
		this.situacaoPauta = situacaoPauta;
	}
	
	
	@Override
	public String toString() {
		return "OutPautaVO [codigoPauta=" + codigoPauta + ", descricaoPauta=" + descricaoPauta + ", situacaoPauta="
				+ situacaoPauta + "]";
	}
	
	
}
