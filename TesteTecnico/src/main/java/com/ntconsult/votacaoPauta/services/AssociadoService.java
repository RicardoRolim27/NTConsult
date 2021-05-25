package com.ntconsult.votacaoPauta.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntconsult.votacaoPauta.dto.AssociadoDTO;
import com.ntconsult.votacaoPauta.entities.Associado;
import com.ntconsult.votacaoPauta.repositories.AssociadoRepository;

@Service
public class AssociadoService {
	
	@Autowired
	private AssociadoRepository repository;
	
	public List<AssociadoDTO> findAll(){
		List<Associado> list = repository.findAllByOrderByNameAsc();
		
		return list.stream().map(x -> new AssociadoDTO(x)).collect(Collectors.toList());
	}

}
