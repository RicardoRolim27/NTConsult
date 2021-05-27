package com.ntconsult.votacaoPauta.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ntconsult.votacaoPauta.entities.Pauta;
import com.ntconsult.votacaoPauta.entities.Sessao;

@Repository
public interface SessaoRepository extends JpaRepository<Sessao, Long>{
	
	List<Sessao> findAll();
	
	Optional<Sessao> findByPauta(Pauta pauta);

}
