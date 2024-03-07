package com.example.bff.controller;

import com.example.bff.dto.PokemonDto;
import com.example.bff.service.PokemonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PokemonController {


    private final PokemonService pokemonService;

    @GetMapping("/pokemon")
    public ResponseEntity<List<PokemonDto>> getPokemons() {
        return ResponseEntity.ok(pokemonService.getPokemons());
    }

    @GetMapping("/pokemon/{pokemonName}")
    public ResponseEntity<PokemonDto> getPokemonByName(@PathVariable String pokemonName) {
        PokemonDto pokemon = pokemonService.getPokemonByName(pokemonName);
        return ResponseEntity.ok(pokemon);
    }
}
