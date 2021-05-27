package com.ntconsult.votacaoPauta.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sessao")
public class Sessao implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne()
	@JoinColumn(name = "pauta_id")
	private Pauta pautaId;
	
	private LocalDateTime inicioVotacao;
	
	private LocalDateTime fimVotacao;

	public Sessao(Long id, Pauta pautaId, LocalDateTime inicioVotacao, LocalDateTime fimVotacao) {
		super();
		this.id = id;
		this.pautaId = pautaId;
		this.inicioVotacao = inicioVotacao;
		this.fimVotacao = fimVotacao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pauta getPautaId() {
		return pautaId;
	}

	public void setPautaId(Pauta pautaId) {
		this.pautaId = pautaId;
	}

	public LocalDateTime getInicioVotacao() {
		return inicioVotacao;
	}

	public void setInicioVotacao(LocalDateTime inicioVotacao) {
		this.inicioVotacao = inicioVotacao;
	}

	public LocalDateTime getFimVotacao() {
		return fimVotacao;
	}

	public void setFimVotacao(LocalDateTime fimVotacao) {
		this.fimVotacao = fimVotacao;
	}
	
	

}
