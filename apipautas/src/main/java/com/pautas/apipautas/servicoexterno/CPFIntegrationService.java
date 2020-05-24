package com.pautas.apipautas.servicoexterno;

import org.springframework.stereotype.Component;

import com.pautas.apipautas.servicoexterno.webservice.endpoint.CPFConsumer;
import com.pautas.apipautas.servicoexterno.webservice.vo.ConsultaCpfVO;

@Component
public class CPFIntegrationService {

	private CPFConsumer consumer;
	
	public Boolean findByCpfServicoExterno(String cpf) {
		ConsultaCpfVO vo = new ConsultaCpfVO();
		vo.setCpfValido(cpf);
		consumer = new CPFConsumer();
		String retorno = consumer.transmitirConsultaCPF(vo);	
		return   retorno.equals("UNABLE_TO_VOTE") ? Boolean.TRUE : Boolean.FALSE;
	}
}
