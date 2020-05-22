package com.pautas.apipautas.pauta.domain.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.pautas.apipautas.associado.domain.entity.Associado;



@Entity
@Table(name = "TB_PAUTA")
public class Pauta implements Serializable {
   
	
	private static final long serialVersionUID = 716565795592148247L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String  descricao;
	@Enumerated(value = EnumType.STRING)
	private SituacaoPautaEnum  situacaoPauta;
	private LocalDate dataCriacao;
	
	@OneToMany
	private Set<Associado> associados;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public SituacaoPautaEnum getSituacaoPauta() {
		return situacaoPauta;
	}
	public void setSituacaoPauta(SituacaoPautaEnum situacaoPauta) {
		this.situacaoPauta = situacaoPauta;
	}
	public LocalDate getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public Set<Associado> getAssociados() {
		return associados;
	}
	public void setAssociados(Set<Associado> associados) {
		this.associados = associados;
	}
}
