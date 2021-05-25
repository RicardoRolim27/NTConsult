package com.ntconsult.votacaoPauta.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ntconsult.votacaoPauta.entities.Associado;

@Repository
public interface AssociadoRepository extends JpaRepository<Associado, Long> {
	List<Associado> findAllByOrderByNameAsc();
}
