package com.pautas.apipautas.servicoexterno.webservice.vo;

import java.io.Serializable;

public class ConsultaCpfVO implements Serializable {

	private static final long serialVersionUID = 3699233775884755900L;
	
	private String cpfValido;
	private String statusRetorno;
	
	public String getCpfValido() {
		return cpfValido;
	}
	public void setCpfValido(String cpfValido) {
		this.cpfValido = cpfValido;
	}
	public String getStatusRetorno() {
		return statusRetorno;
	}
	public void setStatusRetorno(String statusRetorno) {
		this.statusRetorno = statusRetorno;
	}
}
