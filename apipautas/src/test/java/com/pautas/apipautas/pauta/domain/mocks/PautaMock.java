package com.pautas.apipautas.pauta.domain.mocks;

import com.pautas.apipautas.pauta.domain.entity.Pauta;
import com.pautas.apipautas.pauta.domain.entity.SituacaoPautaEnum;
import com.pautas.apipautas.pauta.domain.vo.InPautaVo;

public class PautaMock {

	
	public static Pauta createPauta() {
		Pauta pauta = new Pauta();
		pauta.setDescricao("Votacao");
		pauta.setSituacaoPauta(SituacaoPautaEnum.ABERTA);
		return pauta;
	}
	
	
	public static InPautaVo createPautaVO() {
		InPautaVo inPauta = new InPautaVo();
		inPauta.setNomePauta("Votacao");
		return inPauta;
	}
	
}
