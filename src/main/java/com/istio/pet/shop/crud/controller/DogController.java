package com.istio.pet.shop.crud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.istio.pet.shop.crud.entity.Dog;

@RestController
@RequestMapping("/dogs")
public class DogController {

	@GetMapping
	public ResponseEntity<List<Dog>> getDogs() {
		final List<Dog> dogs = new ArrayList<>();
		dogs.add(new Dog(1L, "bertos"));
		dogs.add(new Dog(2L, "brahminha"));
		return ResponseEntity.ok(dogs);
	}

}
