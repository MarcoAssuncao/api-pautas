package com.pautas.apipautas.pauta.domain.vo;

import java.io.Serializable;

public class InPautaVo implements Serializable {

	private static final long serialVersionUID = 5773559109997724423L;

	String nomePauta;

	public String getNomePauta() {
		return nomePauta;
	}

	public void setNomePauta(String nomePauta) {
		this.nomePauta = nomePauta;
	}
}
