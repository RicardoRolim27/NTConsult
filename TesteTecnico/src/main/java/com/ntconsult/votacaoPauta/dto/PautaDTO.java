package com.ntconsult.votacaoPauta.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.ntconsult.votacaoPauta.entities.Pauta;

public class PautaDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String descricao;
	
	private List<AssociadoDTO> associados = new ArrayList<>();
	
	public PautaDTO() {
	
	}

	public PautaDTO(Long id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}

	public PautaDTO(Pauta entity) {
		id = entity.getId();
		descricao = entity.getDescricao();
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

	public List<AssociadoDTO> getAssociados() {
		return associados;
	}

	public void setAssociados(List<AssociadoDTO> associados) {
		this.associados = associados;
	};
	
	
}
