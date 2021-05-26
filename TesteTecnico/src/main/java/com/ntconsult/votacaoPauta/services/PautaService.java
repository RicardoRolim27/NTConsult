package com.ntconsult.votacaoPauta.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ntconsult.votacaoPauta.dto.PautaDTO;
import com.ntconsult.votacaoPauta.dto.VotoDTO;
import com.ntconsult.votacaoPauta.entities.Pauta;
import com.ntconsult.votacaoPauta.entities.Voto;
import com.ntconsult.votacaoPauta.repositories.PautaRepository;
import com.ntconsult.votacaoPauta.repositories.VotoRepository;

@Service
public class PautaService {
	
	@Autowired
	private PautaRepository pautaRepository;
	
	@Autowired
	private VotoRepository votoRepo;  
	
	public List<PautaDTO> findAll(){
		List<Pauta> list = pautaRepository.findAllByOrderByDescricaoAsc();
		
		return list.stream().map(x -> new PautaDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional
	public PautaDTO insert(PautaDTO dto) {
		Pauta pauta = new Pauta(null, dto.getDescricao());
		
		for(VotoDTO p : dto.getVotos()) {
			@SuppressWarnings("deprecation")
			Voto voto = votoRepo.getOne(p.getId());
			
			pauta.getVotos().add(voto);
			
		}
		
		pauta = pautaRepository.save(pauta);
		
		return new PautaDTO(pauta);
	}
	

}
