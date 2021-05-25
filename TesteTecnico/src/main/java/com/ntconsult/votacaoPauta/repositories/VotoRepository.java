package com.ntconsult.votacaoPauta.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ntconsult.votacaoPauta.entities.Voto;

@Repository
public interface VotoRepository extends JpaRepository<Voto, Long>{
	List<Voto> findAllByOrderByIdAsc();

}
