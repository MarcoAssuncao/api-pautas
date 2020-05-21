package com.pautas.apipautas.associado.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pautas.apipautas.associado.domain.service.AssociadoService;
import com.pautas.apipautas.associado.domain.vo.InAssociadoVO;
import com.pautas.apipautas.associado.domain.vo.OutAssociadoVO;

@RestController
@RequestMapping("/api/v1/associados")
public class AssociadoController {

	private AssociadoService service;
	
	@Autowired
	public AssociadoController(AssociadoService service) {
		this.service = service;
	}

	@PostMapping
	public OutAssociadoVO salvar(InAssociadoVO associadoVO) {		
		
		return service.save(associadoVO);
	}
}
