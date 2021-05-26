package com.ntconsult.votacaoPauta.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ntconsult.votacaoPauta.dto.VotoDTO;
import com.ntconsult.votacaoPauta.entities.Voto;
import com.ntconsult.votacaoPauta.repositories.VotoRepository;

@Service
public class VotoService {
	
	@Autowired
	private VotoRepository votoRepo;
	
	public List<VotoDTO> findAll(){
		List<Voto> list = votoRepo.findAllByOrderByIdAsc();
		
		return list.stream().map(x -> new VotoDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional
	public VotoDTO insert(VotoDTO dto) {
		Voto voto = new Voto(null, dto.getVoto(), dto.getPauta(), dto.getAssociado());
		
		voto = votoRepo.save(voto);
		
		return new VotoDTO(voto);
	}
	

}
