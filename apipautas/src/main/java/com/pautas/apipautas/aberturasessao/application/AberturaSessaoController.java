package com.pautas.apipautas.aberturasessao.application;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pautas.apipautas.aberturasessao.domain.service.AberturaSessaoService;
import com.pautas.apipautas.aberturasessao.domain.vo.InAberturaSessaoVO;
import com.pautas.apipautas.aberturasessao.domain.vo.OutAberturaSessaoVO;

@RestController
@RequestMapping("/api/v1/sessoes")
public class AberturaSessaoController {

	private AberturaSessaoService service;
	
	public OutAberturaSessaoVO cicloDeVotacao(InAberturaSessaoVO in) {
		
		return service.abrirEfecharSessaoVotacao(in);
	}
}
