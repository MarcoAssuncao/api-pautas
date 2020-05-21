package com.pautas.apipautas.associado.domain.vo;

import java.io.Serializable;

public class InAssociadoVO implements Serializable {

	private static final long serialVersionUID = -7511615413611917347L;
	
	private String nome;
	private String cpf;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
