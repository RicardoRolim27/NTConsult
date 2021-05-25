package com.ntconsult.votacaoPauta.dto;

import java.io.Serializable;

import com.ntconsult.votacaoPauta.entities.Associado;
import com.ntconsult.votacaoPauta.entities.Pauta;
import com.ntconsult.votacaoPauta.entities.Voto;

public class VotoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Boolean voto;
	private Pauta pauta;
	private Associado associado;
	
	public VotoDTO() {}

	public VotoDTO(Long id, Boolean voto, Pauta pauta, Associado associado) {
		super();
		this.id = id;
		this.voto = voto;
		this.pauta = pauta;
		this.associado = associado;
	}

	public VotoDTO(Voto entity) {
		super();
		id = entity.getId();
		voto = entity.getVoto();
		pauta = entity.getPauta();
		associado = entity.getAssociado();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getVoto() {
		return voto;
	}

	public void setVoto(Boolean voto) {
		this.voto = voto;
	}

	public Pauta getPauta() {
		return pauta;
	}

	public void setPauta(Pauta pauta) {
		this.pauta = pauta;
	}

	public Associado getAssociado() {
		return associado;
	}

	public void setAssociado(Associado associado) {
		this.associado = associado;
	};
	
	

}
