package com.ntconsult.votacaoPauta.dto;

import java.io.Serializable;

import com.ntconsult.votacaoPauta.entities.Associado;

public class AssociadoDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String cpf;
	
	public AssociadoDTO() {
		
	}

	public AssociadoDTO(Long id, String cpf) {
		super();
		this.id = id;
		this.cpf = cpf;
	}

	public AssociadoDTO(Associado entity) {
		id = entity.getId();
		cpf  = entity.getCpf();
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

	
	
	

}
