package com.pautas.apipautas.pauta.domain.business.component;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import com.pautas.apipautas.infraestrutura.IAdapter;
import com.pautas.apipautas.pauta.domain.entity.Pauta;
import com.pautas.apipautas.pauta.domain.entity.SituacaoPautaEnum;
import com.pautas.apipautas.pauta.domain.vo.InPautaVo;
import com.pautas.apipautas.pauta.domain.vo.OutPautaVO;

@Component
public class PautaAdapter implements IAdapter<InPautaVo,Pauta,OutPautaVO> {

	@Override
	public Pauta convertToEntity(InPautaVo in) {
		Pauta pauta = new Pauta();
		pauta.setDescricao(in.getNomePauta());
		pauta.setDataCriacao(LocalDate.now());
		pauta.setSituacaoPauta(SituacaoPautaEnum.CRIADA);
		return pauta;
	}

	@Override
	public OutPautaVO convertToValueObject(Pauta entity) {
		OutPautaVO outVO = new OutPautaVO();
		outVO.setCodigoPauta(entity.getId());
		outVO.setDescricaoPauta(entity.getDescricao());
		outVO.setSituacaoPauta(entity.getSituacaoPauta().name());
		return outVO;
	}
}
