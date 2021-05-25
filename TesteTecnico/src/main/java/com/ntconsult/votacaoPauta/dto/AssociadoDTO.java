package com.ntconsult.votacaoPauta.dto;

import java.io.Serializable;

import com.ntconsult.votacaoPauta.entities.Associado;

public class AssociadoDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String cpf;
	private Boolean voto;
	
	public AssociadoDTO() {
		
	}

	public AssociadoDTO(Long id, String cpf, Boolean voto) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.voto = voto;
	}

	public AssociadoDTO(Associado entity) {
		id = entity.getId();
		cpf  = entity.getCpf();
		voto = entity.getVoto();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Boolean getVoto() {
		return voto;
	}

	public void setVoto(Boolean voto) {
		this.voto = voto;
	};
	
	
	
	

}
