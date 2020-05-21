package com.pautas.apipautas.votacao.domain.vo;

import java.io.Serializable;

public class InVotoVO implements Serializable {

	private static final long serialVersionUID = -8624728922447556918L;
	
	private Integer codigoAssociado;
	private Integer codigoPauta;
	private Boolean votoSim;
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
	
}
