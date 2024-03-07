package com.example.bff.service;

import com.example.bff.dto.PokemonDto;
import java.util.List;

public interface PokemonService {
    List<PokemonDto> getPokemons();
    PokemonDto getPokemonByName(String name);
}
