package com.ntconsult.votacaoPauta.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ntconsult.votacaoPauta.dto.AssociadoDTO;
import com.ntconsult.votacaoPauta.services.AssociadoService;

@RestController
@RequestMapping(value="/associados")
public class AssociadoController {
	
	@Autowired
	private AssociadoService service;
	
	@GetMapping
	public ResponseEntity <List<AssociadoDTO>> findAll(){
		List<AssociadoDTO> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping
	public ResponseEntity<AssociadoDTO> insert(@RequestBody AssociadoDTO dto){
		
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}

}
