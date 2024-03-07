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

}
