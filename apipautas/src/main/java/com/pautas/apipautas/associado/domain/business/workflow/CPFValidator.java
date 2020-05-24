package com.pautas.apipautas.associado.domain.business.workflow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pautas.apipautas.servicoexterno.CPFIntegrationService;

@Component
public class CPFValidator {

	private CPFIntegrationService cpfIntegrationService;
	
	@Autowired
	public CPFValidator(CPFIntegrationService cpfIntegrationService) {
		this.cpfIntegrationService = cpfIntegrationService;
	}

	public String isValid(String cpf) {
		Boolean cpfValido = cpfIntegrationService.findByCpfServicoExterno(cpf);
		if(!cpfValido) {
			return "CPF inválido";
		}
		return null;
	}
}
