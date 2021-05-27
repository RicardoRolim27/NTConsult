package com.ntconsult.votacaoPauta.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ntconsult.votacaoPauta.dto.PautaDTO;
import com.ntconsult.votacaoPauta.entities.Pauta;
import com.ntconsult.votacaoPauta.repositories.PautaRepository;


@Service
public class PautaService {
	
	@Autowired
	private PautaRepository pautaRepository;
	  

	public List<PautaDTO> findAll(){
		List<Pauta> list = pautaRepository.findAllByOrderByDescricaoAsc();
		
		return list.stream().map(x -> new PautaDTO(x)).collect(Collectors.toList());
	}
	
	public Optional<Pauta> findById(Long pautaId) {
		return pautaRepository.findById(pautaId);
	}
	
	@Transactional
	public PautaDTO insert(PautaDTO dto) {
		Pauta pauta = new Pauta(null, dto.getDescricao(), dto.getDuracao());
		
		pauta = pautaRepository.save(pauta);
		
		return new PautaDTO(pauta);
	}
	

}
