package com.pautas.apipautas.associado.domain.vo;

import java.io.Serializable;

public class OutAssociadoVO implements Serializable {

	private static final long serialVersionUID = 2854726448211176884L;
	
	private Integer codigoAssociado;
	private String nome;
	private String cpfAtivo;
	
	
	public Integer getCodigoAssociado() {
		return codigoAssociado;
	}
	public void setCodigoAssociado(Integer codigoAssociado) {
		this.codigoAssociado = codigoAssociado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpfAtivo() {
		return cpfAtivo;
	}
	public void setCpfAtivo(String cpfAtivo) {
		this.cpfAtivo = cpfAtivo;
	}
}
