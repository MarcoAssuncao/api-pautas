package com.pautas.apipautas.votacao.domain.mocks;

import com.pautas.apipautas.pauta.domain.mocks.PautaMock;
import com.pautas.apipautas.pauta.domain.vo.InPautaVo;
import com.pautas.apipautas.votacao.domain.entity.OpcaoVotoEnum;
import com.pautas.apipautas.votacao.domain.entity.Voto;
import com.pautas.apipautas.votacao.domain.vo.InVotoVO;

public class VotoMock {

	public static Voto create() {
		Voto voto = new Voto();
		voto.setPauta(PautaMock.createPauta());
		voto.setOpcaoVoto(OpcaoVotoEnum.SIM);
		return voto;
	}
	
	
	public static InVotoVO createInVO() {
		InVotoVO inVoto = new InVotoVO();
		inVoto.setCodigoPauta(2);
		inVoto.setVotoNao(Boolean.FALSE);
		inVoto.setVotoSim(Boolean.TRUE);
		return inVoto;
	}
}
