package com.example.bff.service;

import com.example.bff.dto.PokemonDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PokemonServiceImp implements PokemonService{

    @Value("${spring.external.service.base-url}")
    private String basePath;

    private final RestTemplate restTemplate;
    public List<PokemonDto> getPokemons() {
        PokemonDto[] response = restTemplate.getForObject(basePath+"/pokemon", PokemonDto[].class);
        return Arrays.asList(response);
    }

    public PokemonDto getPokemonByName(String name) {
        return restTemplate.getForObject(basePath+"/pokemon/"+name, PokemonDto.class);
    }
}
