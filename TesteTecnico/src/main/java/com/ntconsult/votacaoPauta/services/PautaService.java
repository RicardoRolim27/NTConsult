package com.ntconsult.votacaoPauta.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ntconsult.votacaoPauta.dto.AssociadoDTO;
import com.ntconsult.votacaoPauta.dto.PautaDTO;
import com.ntconsult.votacaoPauta.entities.Associado;
import com.ntconsult.votacaoPauta.entities.Pauta;
import com.ntconsult.votacaoPauta.repositories.AssociadoRepository;
import com.ntconsult.votacaoPauta.repositories.PautaRepository;

@Service
public class PautaService {
	
	@Autowired
	private PautaRepository repository;
	private PautaRepository pautaRepository;
	
	@Autowired
	private AssociadoRepository associadoRepo;  
	
	public List<PautaDTO> findAll(){
		List<Pauta> list = repository.findAllByOrderByNameAsc();
		List<Pauta> list = pautaRepository.findAllByOrderByNameAsc();
		
		return list.stream().map(x -> new PautaDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional
	public PautaDTO insert(PautaDTO dto) {
		Pauta pauta = new Pauta(null, dto.getDescricao());
		
		for(AssociadoDTO p : dto.getAssociados()) {
			@SuppressWarnings("deprecation")
			Associado associado = associadoRepo.getOne(p.getId());
			
			pauta.getAssociados().add(associado);
			
		}
		
		pauta = pautaRepository.save(pauta);
		
		return new PautaDTO(pauta);
	}
	

}
