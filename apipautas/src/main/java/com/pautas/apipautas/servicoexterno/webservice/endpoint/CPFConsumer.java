package com.pautas.apipautas.servicoexterno.webservice.endpoint;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import com.pautas.apipautas.servicoexterno.webservice.vo.ConsultaCpfVO;

public class CPFConsumer {

	private String uri = "https://user-info.herokuapp.com/users/{cpf}";

	public String transmitirConsultaCPF(ConsultaCpfVO in) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("cpf", in.getCpfValido());

		RestTemplate restTemplate = new RestTemplate();
		String response = restTemplate.getForObject(uri, String.class, params);

		return response;
	}
}
