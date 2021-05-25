package com.ntconsult.votacaoPauta.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ntconsult.votacaoPauta.dto.AssociadoDTO;
import com.ntconsult.votacaoPauta.entities.Associado;
import com.ntconsult.votacaoPauta.repositories.AssociadoRepository;

@Service
public class AssociadoService {
	
	@Autowired
	private AssociadoRepository repository;
	
	@Transactional(readOnly = true)
	public List<AssociadoDTO> findAll(){
		List<Associado> list = repository.findAllByOrderByCpfAsc();
		
		return list.stream().map(x -> new AssociadoDTO(x)).collect(Collectors.toList());
	}

}
