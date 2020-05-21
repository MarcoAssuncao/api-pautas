package com.pautas.apipautas.votacao.domain.entity;

import java.util.Objects;

import com.pautas.apipautas.votacao.domain.vo.InVotoVO;

public enum OpcaoVotoEnum {

	SIM,
	NAO;
	
	
	public static OpcaoVotoEnum convertToEnum(InVotoVO in) {
		
		if(Objects.nonNull(in.getVotoSim()) && Objects.nonNull(!in.getVotoNao())) {
			return OpcaoVotoEnum.SIM;
		} 
		if(Objects.nonNull(!in.getVotoSim()) && Objects.nonNull(in.getVotoNao())){
			return OpcaoVotoEnum.NAO;
		}
		return null;
	}
}
