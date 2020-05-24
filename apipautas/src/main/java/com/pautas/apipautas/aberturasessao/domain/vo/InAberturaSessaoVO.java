package com.pautas.apipautas.aberturasessao.domain.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreType
public class InAberturaSessaoVO implements Serializable {

	private static final long serialVersionUID = -8886358837394299545L;
	
	@JsonProperty("id_pauta")
	private Integer codigoPauta;

	public Integer getCodigoPauta() {
		return codigoPauta;
	}

	public void setCodigoPauta(Integer codigoPauta) {
		this.codigoPauta = codigoPauta;
	}

	@Override
	public String toString() {
		return "InAberturaSessaoVO [codigoPauta=" + codigoPauta + "]";
	}
	
}
