package com.pautas.apipautas.aberturasessao.domain.vo;

import java.io.Serializable;

public class OutAberturaSessaoVO implements Serializable {

	private static final long serialVersionUID = 3320636689985310973L;
	
	private Integer codigoPauta;
	private String descricaoPauta;
	private String situacaoPauta;
	
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
}
