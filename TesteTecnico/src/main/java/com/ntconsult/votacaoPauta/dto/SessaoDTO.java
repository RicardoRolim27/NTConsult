package com.ntconsult.votacaoPauta.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.ntconsult.votacaoPauta.entities.Pauta;
import com.ntconsult.votacaoPauta.entities.Sessao;

public class SessaoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Pauta pautaId;
	private LocalDateTime inicioVotacao;
	private LocalDateTime fimVotacao;
	
	public SessaoDTO() {}

	public SessaoDTO(Long id, Pauta pautaId, LocalDateTime inicioVotacao, LocalDateTime fimVotacao) {
		super();
		this.id = id;
		this.pautaId = pautaId;
		this.inicioVotacao = inicioVotacao;
		this.fimVotacao = fimVotacao;
	}

	public SessaoDTO(Sessao entity) {
		super();
		id = entity.getId();
		pautaId = entity.getPautaId();
		inicioVotacao = entity.getInicioVotacao();
		fimVotacao = entity.getFimVotacao();
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
