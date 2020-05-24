package com.pautas.apipautas.votacao.domain.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreType
public class OutVotoVO  implements Serializable {

	private static final long serialVersionUID = -7227450184605271819L;
	
	@JsonProperty("id_voto")
	private Integer codigoVoto;
	
	@JsonProperty("id_pauta")
	private Integer codigoPauta;
	
	@JsonProperty("cpf_associado")
	private String  cpfAssociado;
	
	@JsonProperty("mensagem_erro")
	private String  messageErro;
	
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
	
	public String getMessageErro() {
		return messageErro;
	}
	public void setMessageErro(String messageErro) {
		this.messageErro = messageErro;
	}
	@Override
	public String toString() {
		return "OutVotoVO [codigoVoto=" + codigoVoto + ", codigoPauta=" + codigoPauta + ", cpfAssociado=" + cpfAssociado
				+ ", messageErro=" + messageErro + "]";
	}
	
}
