package com.pautas.apipautas.associado.domain.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "TB_ASSOCIADO")
public class Associado implements Serializable {

	private static final long serialVersionUID = 425484780405401816L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String nome;

	@Enumerated(value = EnumType.STRING)
	private PerfilEnum cpfAtivo;
	
	private String cpf;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public PerfilEnum getCpfAtivo() {
		return cpfAtivo;
	}
	public void setCpfAtivo(PerfilEnum cpfAtivo) {
		this.cpfAtivo = cpfAtivo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return "Associado [id=" + id + ", nome=" + nome + ", cpfAtivo=" + cpfAtivo + ", cpf=" + cpf + "]";
	}
}
