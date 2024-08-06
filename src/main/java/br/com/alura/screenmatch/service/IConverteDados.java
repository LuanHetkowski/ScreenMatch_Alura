package br.com.alura.screenmatch.service;

public interface IConverteDados {
    //Tipo de classe genérico
   <T> T obterDados(String json, Class <T> classe);
}
