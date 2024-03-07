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
        String response = builder.build()
                .get()
                .uri(basePath+"/"+requestPath)
                .retrieve()
                .bodyToMono(String.class)
                .block();
        System.out.println(basePath+"/"+requestPath);
        return response;
    }
}
