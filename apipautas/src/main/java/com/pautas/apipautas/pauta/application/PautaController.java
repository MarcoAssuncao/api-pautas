package com.pautas.apipautas.pauta.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pautas.apipautas.pauta.domain.entity.Pauta;
import com.pautas.apipautas.pauta.domain.service.PautaService;
import com.pautas.apipautas.pauta.domain.vo.InPautaVo;

@RestController
@RequestMapping("/api/v1/pautas")
public class PautaController {

	private PautaService service;
	
	@Autowired
	public PautaController(PautaService service) {
		this.service = service;
	}

	public Pauta salvar(InPautaVo inPautaVO) {
		service.save(null);
		return null;
	}
}
