package com.pautas.apipautas.pauta.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pautas.apipautas.pauta.domain.service.PautaService;
import com.pautas.apipautas.pauta.domain.vo.InPautaVo;
import com.pautas.apipautas.pauta.domain.vo.OutPautaVO;

@RestController
@RequestMapping("/api/v1/pautas")
public class PautaController {

	private PautaService service;
	
	@Autowired
	public PautaController(PautaService service) {
		this.service = service;
	}

	@PostMapping
	public OutPautaVO salvar(@RequestBody InPautaVo inPautaVO) {
		
		return service.save(inPautaVO);
	}
}
