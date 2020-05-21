package com.pautas.apipautas.resultadovotacao.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pautas.apipautas.resultadovotacao.domain.service.ExibeVotacaoService;
import com.pautas.apipautas.resultadovotacao.domain.vo.OutExibeVotacaoVO;

@RestController
@RequestMapping("/api/v1/resultados")
public class ExibeVotacaoController {

	private ExibeVotacaoService service;
	
	@Autowired
	public ExibeVotacaoController(ExibeVotacaoService service) {
		this.service = service;
	}

	public OutExibeVotacaoVO exibirResultadoVotacao() {
		
		return service.exibirResultadoVotacaoPauta();
	}
}
