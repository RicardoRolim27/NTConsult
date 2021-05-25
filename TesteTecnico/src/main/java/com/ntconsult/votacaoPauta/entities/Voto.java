package com.ntconsult.votacaoPauta.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "voto")
public class Voto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Boolean voto;
	
	@ManyToOne(fetch = FetchType.LAZY) 
	@JoinColumn(name = "pauta_id")
	private Pauta pauta;
	
	@ManyToOne(fetch = FetchType.LAZY) 
	@JoinColumn(name = "associado_id")
	private Associado associado;
	
	
	public Voto() {}


	public Voto(Long id, Boolean voto, Pauta pauta, Associado associado) {
		super();
		this.id = id;
		this.voto = voto;
		this.pauta = pauta;
		this.associado = associado;
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
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voto other = (Voto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	};
	
	

}
