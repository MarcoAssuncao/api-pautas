package com.pautas.apipautas.pauta.domain.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreType
public class InPautaVo implements Serializable {

	private static final long serialVersionUID = 5773559109997724423L;

	@JsonProperty("nome_pauta")
	String nomePauta;

	public String getNomePauta() {
		return nomePauta;
	}

	public void setNomePauta(String nomePauta) {
		this.nomePauta = nomePauta;
	}

	@Override
	public String toString() {
		return "InPautaVo [nomePauta=" + nomePauta + "]";
	}
	
}
