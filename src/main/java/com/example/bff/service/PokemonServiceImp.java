package com.example.bff.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@RequiredArgsConstructor
public class PokemonServiceImp implements PokemonService{

    @Value("${spring.external.service.base-url}")
    private String basePath;
    @Override
    public String consumePokemonApi(String requestPath) {
        WebClient.Builder builder = WebClient.builder();
        return builder.build()
                .get()
                .uri(basePath+"/"+requestPath)
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
    @Override
    public String consumePokemonApibyPokemon(String requestPath) {
        WebClient.Builder builder = WebClient.builder();
        return builder.build()
                .get()
                .uri(basePath+"/pokemon/"+requestPath)
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}
