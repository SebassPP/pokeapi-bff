package com.example.bff.controller;

import com.example.bff.service.PokemonServiceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PokemonController {
    private final PokemonServiceImp pokemonService;

    @GetMapping("/{requestPath}")
    public ResponseEntity<String> consumePokemonApi(@PathVariable String requestPath) {
        return ResponseEntity.ok(pokemonService.consumePokemonApi(requestPath));
    }

    @GetMapping("/pokemon/{requestPath}")
    public ResponseEntity<String> consumePokemonApiSoloPokemon(@PathVariable String requestPath) {
        return ResponseEntity.ok(pokemonService.consumePokemonApiSolo(requestPath));
    }
    @GetMapping("/pokemon-search/{requestPath}")
    public ResponseEntity<String> consumePokemonApiSearch(@PathVariable String requestPath) {
        return ResponseEntity.ok(pokemonService.consumePokemonApiSearch(requestPath));
    }

    @GetMapping("/pokemon-species/{requestPath}")
    public ResponseEntity<String> consumePokemonApiSoloPokemonSpecies(@PathVariable String requestPath) {
        return ResponseEntity.ok(pokemonService.consumePokemonApiSoloSpecies(requestPath));
    }

}
