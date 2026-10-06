package com.github.thomasaqx.screenmatch.service;

import tools.jackson.databind.ObjectMapper;

public class ConvertDados implements IConverteDados{
    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T obterDados(String json, Class<T> classe) {
        return mapper.readValue(json, classe);
    }
}


