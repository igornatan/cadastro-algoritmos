package com.maxi.demo.controller;

import com.maxi.demo.model.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CadastroController {

    @GetMapping("/pessoa")
    public Pessoa mostrarPessoa(){
        Identificacao identificacao = new Identificacao(
                "Igor Bagio",
                "113-624-299-61",
                "19/08/1999",
                "Masculino",
                "Solteiro",
                "Xaxim/SC",
                "Brasileiro"
        );

        Profissional profissional = new Profissional(
                "Desenvolvedor",
                "Graduando",
                "1.000,00"
        );

        Residencia residencia = new Residencia(
                "Getúlio Vargas",
                "Avenida",
                "898888-000",
                "80",
                "Centro",
                "Sem complemento",
                "Chapecó/SC"
        );

        Contato contato = new Contato(
                "(49) 99999-9999",
                "Particular",
                "teste@teste.com",
                "teste@teste.com"
        );

        Pessoa pessoa = new Pessoa(identificacao, profissional, residencia, contato);

        return pessoa;
    }

    @GetMapping("/")
    public String index(){
        return "Teste";
    }

}
