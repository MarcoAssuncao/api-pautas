package com.pautas.apipautas.associado.domain.business.component;

import org.springframework.stereotype.Component;

import com.pautas.apipautas.associado.domain.entity.Associado;
import com.pautas.apipautas.associado.domain.entity.PerfilEnum;
import com.pautas.apipautas.associado.domain.vo.InAssociadoVO;
import com.pautas.apipautas.associado.domain.vo.OutAssociadoVO;
import com.pautas.apipautas.infraestrutura.IAdapter;

@Component
public class AssociadoAdapter implements IAdapter<InAssociadoVO, Associado, OutAssociadoVO> {

	@Override
	public Associado convertToEntity(InAssociadoVO in) {
		Associado associado = new Associado();
		associado.setId(null);
		associado.setNome(in.getNome());
		associado.setCpfAtivo(PerfilEnum.CPF_ATIVO);
		associado.setCpf(in.getCpf());
		return associado;
	}

	@Override
	public OutAssociadoVO convertToValueObject(Associado entity) {
		OutAssociadoVO outVo = new OutAssociadoVO();
		outVo.setCodigoAssociado(entity.getId());
		outVo.setCpfAtivo(entity.getCpfAtivo().name());
		outVo.setNome(entity.getNome());
		return outVo;
	}
}
