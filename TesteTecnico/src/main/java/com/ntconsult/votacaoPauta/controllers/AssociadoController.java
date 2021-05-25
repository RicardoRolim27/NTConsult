package com.ntconsult.votacaoPauta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ntconsult.votacaoPauta.dto.AssociadoDTO;
import com.ntconsult.votacaoPauta.services.AssociadoService;

@RestController
@RequestMapping(value="/associados")
public class AssociadoController {
	
	@Autowired
	private AssociadoService service;
	
	public ResponseEntity <List<AssociadoDTO>> findAll(){
		List<AssociadoDTO> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}

}
