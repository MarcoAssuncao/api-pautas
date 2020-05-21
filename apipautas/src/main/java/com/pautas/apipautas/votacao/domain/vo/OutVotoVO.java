package com.pautas.apipautas.votacao.domain.vo;

import java.io.Serializable;

public class OutVotoVO implements Serializable {

	private static final long serialVersionUID = -7227450184605271819L;
	
	private Integer codigoVoto;
	private Integer codigoPauta;
	private String  cpfAssociado;
	
	public Integer getCodigoVoto() {
		return codigoVoto;
	}
	public void setCodigoVoto(Integer codigoVoto) {
		this.codigoVoto = codigoVoto;
	}
	public Integer getCodigoPauta() {
		return codigoPauta;
	}
	public void setCodigoPauta(Integer codigoPauta) {
		this.codigoPauta = codigoPauta;
	}
	public String getCpfAssociado() {
		return cpfAssociado;
	}
	public void setCpfAssociado(String cpfAssociado) {
		this.cpfAssociado = cpfAssociado;
	}
}
