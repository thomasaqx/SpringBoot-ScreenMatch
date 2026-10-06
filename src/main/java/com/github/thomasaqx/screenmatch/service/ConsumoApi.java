package com.github.thomasaqx.screenmatch.service;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ConsumoApi{
        public String consumirDados(String endereco) {
            //Cria o cliente que fará a req
            HttpClient client = HttpClient.newHttpClient();

            //Cria o Jackson para desserializar:

            // Cria a requisição:
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
            HttpResponse<String> response = null;
            try {
                //resposta da requisição
                response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //body da resposta
            String json = response.body();
            return json;

        }
    }

