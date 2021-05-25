package com.ntconsult.votacaoPauta.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntconsult.votacaoPauta.dto.PautaDTO;
import com.ntconsult.votacaoPauta.entities.Pauta;
import com.ntconsult.votacaoPauta.repositories.PautaRepository;

@Service
public class PautaService {
	
	@Autowired
	private PautaRepository repository;
	
	public List<PautaDTO> findAll(){
		List<Pauta> list = repository.findAllByOrderByNameAsc();
		
		return list.stream().map(x -> new PautaDTO(x)).collect(Collectors.toList());
	}

}
