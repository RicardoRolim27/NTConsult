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

import com.ntconsult.votacaoPauta.dto.VotoDTO;
import com.ntconsult.votacaoPauta.services.VotoService;


@RestController
@RequestMapping(value="/votacao")
public class VotoController {
	
	@Autowired
	private VotoService service;
	
	@GetMapping
	public ResponseEntity<List<VotoDTO>> findAll(){
		
		List<VotoDTO> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping
	public ResponseEntity<VotoDTO> insert(@RequestBody VotoDTO dto){
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}

}
