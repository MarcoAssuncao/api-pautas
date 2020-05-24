package com.pautas.apipautas.associado.domain.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreType
public class OutAssociadoVO implements Serializable {

	private static final long serialVersionUID = 2854726448211176884L;
	
	@JsonProperty("id_associado")
	private Integer codigoAssociado;

	@JsonProperty("nome_associado")
	private String nome;

	@JsonProperty("cpf_ativo")
	private String cpfAtivo;

	@JsonProperty("mensagem_erro")
	private String  messageErro;
	
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
	public String getMessageErro() {
		return messageErro;
	}
	public void setMessageErro(String messageErro) {
		this.messageErro = messageErro;
	}
	
	
	@Override
	public String toString() {
		return "OutAssociadoVO [codigoAssociado=" + codigoAssociado + ", nome=" + nome + ", cpfAtivo=" + cpfAtivo
				+ ", messageErro=" + messageErro + "]";
	}
		
}
