package com.pautas.apipautas.votacao.domain.business.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pautas.apipautas.associado.domain.service.AssociadoService;
import com.pautas.apipautas.infraestrutura.IAdapter;
import com.pautas.apipautas.pauta.domain.service.PautaService;
import com.pautas.apipautas.votacao.domain.entity.OpcaoVotoEnum;
import com.pautas.apipautas.votacao.domain.entity.Voto;
import com.pautas.apipautas.votacao.domain.vo.InVotoVO;
import com.pautas.apipautas.votacao.domain.vo.OutVotoVO;

@Component
public class VotoAdapter implements IAdapter<InVotoVO,Voto,OutVotoVO> {

	private AssociadoService associadoService;
	private PautaService pautaService;
	
	@Autowired
	public VotoAdapter(AssociadoService associadoService, PautaService pautaService) {
		this.associadoService = associadoService;
		this.pautaService = pautaService;
	}

	@Override
	public Voto convertToEntity(InVotoVO in) {
		Voto voto = new Voto();
		voto.setAssociado(associadoService.findById(in.getCodigoAssociado()));
		voto.setPauta(pautaService.findById(in.getCodigoPauta()));
		voto.setOpcaoVoto(OpcaoVotoEnum.convertToEnum(in));
		return voto;
	}

	@Override
	public OutVotoVO convertToValueObject(Voto entity) {
		OutVotoVO outVO = new OutVotoVO();
		outVO.setCodigoVoto(entity.getId());
		outVO.setCodigoPauta(entity.getPauta().getId());
		outVO.setCpfAssociado(entity.getAssociado().getCpf());
		return outVO;
	}
}
