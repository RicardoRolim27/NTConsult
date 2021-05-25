package com.ntconsult.votacaoPauta.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ntconsult.votacaoPauta.entities.Pauta;

@Repository
public interface PautaRepository extends JpaRepository<Pauta, Long>{
	
	List<Pauta> findAllByOrderByNameAsc();

}
