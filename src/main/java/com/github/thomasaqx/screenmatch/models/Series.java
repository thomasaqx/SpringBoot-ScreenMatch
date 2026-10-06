package com.github.thomasaqx.screenmatch.models;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//classes record contém dados imutáveis e servem de molde para receberem e exibirem valores.
//JsonIgnore ignora dados não mapeados na estrutura.
@JsonIgnoreProperties(ignoreUnknown = true)
public record Series(
        @JsonAlias("Title") String titulos,
        @JsonAlias("totalSeasons") Integer temporadas,
        @JsonAlias("imdbRating") String avaliacao
){



}




