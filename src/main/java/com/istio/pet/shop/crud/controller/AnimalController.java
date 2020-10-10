package com.istio.pet.shop.crud.controller;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.istio.pet.shop.crud.entity.Animal;

@RestController
@RequestMapping("animais")
public class AnimalController {

	@GetMapping
	public ResponseEntity<List<Animal>> getAnimals() {
		final List<Animal> animals = new ArrayList<>();
		animals.add(new Animal(1L, "Dog 1"));
		animals.add(new Animal(2L, "Cat 2"));
		return ResponseEntity.ok(animals);
	}

	@GetMapping("/teste-seguranca")
	public ResponseEntity<String> testeSeguranca(@RequestHeader("x-jwt") String jwtPayload) {
		byte[] decodedBytes = Base64.getDecoder().decode(jwtPayload);		
		return ResponseEntity.ok(new String(decodedBytes));
	}
	
}
