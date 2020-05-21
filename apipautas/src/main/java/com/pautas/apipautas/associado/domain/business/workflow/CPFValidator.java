package com.pautas.apipautas.associado.domain.business.workflow;

import org.springframework.stereotype.Component;

@Component
public class CPFValidator {

	public String isValid(String cpf) {
		if(cpf.length() > 9 || cpf.length() < 7) {
			return "CPF inválido";
		}
		return null;
	}
}
