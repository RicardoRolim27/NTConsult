package com.ntconsult.votacaoPauta.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ntconsult.votacaoPauta.entities.Pauta;

public class PautaDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String descricao;
	private Date dataInicio;
	private Date dataFim;
	private Boolean ativa;
	
	private List<VotoDTO> votos = new ArrayList<>();
	
	public PautaDTO() {}

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

	public List<VotoDTO> getVotos() {
		return votos;
	}

	public void setVotos(List<VotoDTO> votos) {
		this.votos = votos;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public Boolean getAtiva() {
		return ativa;
	}

	public void setAtiva(Boolean ativa) {
		this.ativa = ativa;
	}

	
	
}
