package com.ntconsult.votacaoPauta.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.ntconsult.votacaoPauta.entities.Pauta;

public class PautaDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String descricao;
	private LocalDateTime duracao;
	
	private List<VotoDTO> votos = new ArrayList<>();
	
	public PautaDTO() {}

	public PautaDTO(Long id, String descricao, LocalDateTime duracao) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.duracao = duracao;
	}

	public PautaDTO(Pauta entity) {
		id = entity.getId();
		descricao = entity.getDescricao();
		duracao = entity.getDuracao();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<VotoDTO> getVotos() {
		return votos;
	}

	public void setVotos(List<VotoDTO> votos) {
		this.votos = votos;
	}

	public LocalDateTime getDuracao() {
		return duracao;
	}

	public void setDuracao(LocalDateTime duracao) {
		this.duracao = duracao;
	}

	
	
}
