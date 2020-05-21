package com.pautas.apipautas.aberturasessao.domain.vo;

import java.io.Serializable;

public class InAberturaSessaoVO implements Serializable {

	private static final long serialVersionUID = -8886358837394299545L;
	
	private Integer codigoPauta;

	public Integer getCodigoPauta() {
		return codigoPauta;
	}

	public void setCodigoPauta(Integer codigoPauta) {
		this.codigoPauta = codigoPauta;
	}
}
