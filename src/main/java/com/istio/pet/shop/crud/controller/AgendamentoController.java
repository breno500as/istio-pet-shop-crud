package com.istio.pet.shop.crud.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("agendamentos")
public class AgendamentoController {
	
	@PostMapping
	public ResponseEntity<String> criaAgendamento(){
		 return ResponseEntity.ok("Agendado");
	}

}
