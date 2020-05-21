package com.pautas.apipautas.aberturasessao.domain.business;

import org.springframework.stereotype.Component;

import com.pautas.apipautas.aberturasessao.domain.vo.OutAberturaSessaoVO;
import com.pautas.apipautas.pauta.domain.entity.Pauta;

@Component
public class AberturaSessaoAdapter {

	public OutAberturaSessaoVO convertToValueObject(Pauta entity) {
		OutAberturaSessaoVO outVO = new OutAberturaSessaoVO();
		outVO.setCodigoPauta(entity.getId());
		outVO.setDescricaoPauta(entity.getDescricao());
		outVO.setSituacaoPauta(entity.getSituacaoPauta().name());
		return outVO;
	}
}
