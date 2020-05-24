package com.pautas.apipautas.associado.domain.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreType
public class InAssociadoVO implements Serializable {

	private static final long serialVersionUID = -7511615413611917347L;
	
	@JsonProperty("nome_associado")
	private String nome;
	
	@JsonProperty("cpf_associado")
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
	
	
	@Override
	public String toString() {
		return "InAssociadoVO [nome=" + nome + ", cpf=" + cpf + "]";
	}
	
}
