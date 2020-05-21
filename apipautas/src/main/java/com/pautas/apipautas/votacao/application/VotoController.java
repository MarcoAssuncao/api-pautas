package com.pautas.apipautas.votacao.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pautas.apipautas.votacao.domain.service.VotoService;
import com.pautas.apipautas.votacao.domain.vo.InVotoVO;
import com.pautas.apipautas.votacao.domain.vo.OutVotoVO;

@RestController
@RequestMapping("/api/v1/votos")
public class VotoController {

	private VotoService service;
	
	@Autowired
	public VotoController(VotoService service) {
		this.service = service;
	}

	public OutVotoVO salvar(InVotoVO voto) {
		return service.save(voto);
	}
}
