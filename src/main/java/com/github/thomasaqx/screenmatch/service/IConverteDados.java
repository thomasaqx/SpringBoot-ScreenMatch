package com.github.thomasaqx.screenmatch.service;

public interface IConverteDados {
    // <T> T é  usado para indicar que ele retorna qualquer tipo de dados
    <T> T obterDados(String json, Class<T> classe); //Class <T> retorna um classe de qualquer tipo.
}
