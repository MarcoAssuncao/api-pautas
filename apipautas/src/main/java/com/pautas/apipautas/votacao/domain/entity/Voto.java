package com.pautas.apipautas.votacao.domain.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.pautas.apipautas.associado.domain.entity.Associado;
import com.pautas.apipautas.pauta.domain.entity.Pauta;

@Entity 
@Table(name = "TB_VOTO")
public class Voto implements Serializable {

	private static final long serialVersionUID = -8684867607616871829L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Enumerated(value = EnumType.STRING)
	private OpcaoVotoEnum  opcaoVoto;
	
	@OneToOne
	private Associado associado;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pauta_id")
	private Pauta pauta;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public OpcaoVotoEnum getOpcaoVoto() {
		return opcaoVoto;
	}
	public void setOpcaoVoto(OpcaoVotoEnum opcaoVoto) {
		this.opcaoVoto = opcaoVoto;
	}
	public Associado getAssociado() {
		return associado;
	}
	public void setAssociado(Associado associado) {
		this.associado = associado;
	}
	public Pauta getPauta() {
		return pauta;
	}
	public void setPauta(Pauta pauta) {
		this.pauta = pauta;
	}
}
