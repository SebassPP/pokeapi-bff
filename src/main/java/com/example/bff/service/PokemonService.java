package com.example.bff.service;

public interface PokemonService {
    String consumePokemonApi(String requestPath);

    String consumePokemonApiSolo(String requestPath);

    String consumePokemonApiSoloSpecies(String requestPath);

    String consumePokemonApiSearch(String requestPath);
}
