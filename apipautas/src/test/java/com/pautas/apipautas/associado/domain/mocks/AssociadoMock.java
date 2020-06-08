package com.pautas.apipautas.associado.domain.mocks;

import com.pautas.apipautas.associado.domain.entity.Associado;
import com.pautas.apipautas.associado.domain.entity.PerfilEnum;
import com.pautas.apipautas.associado.domain.vo.InAssociadoVO;

public class AssociadoMock {
	
	
	public static InAssociadoVO createValueObject() {
		InAssociadoVO vo = new InAssociadoVO();
		vo.setCpf("0884565456");
		vo.setNome("Carla Oliveira");
		return vo;
	}
	
	public static Associado create() {
		
		Associado associado = new Associado();
		associado.setCpf("0884565456");
		associado.setCpfAtivo(PerfilEnum.CPF_ATIVO);
		associado.setId(1);
		associado.setNome("Carla Oliveira");
		return null;
	}

}
