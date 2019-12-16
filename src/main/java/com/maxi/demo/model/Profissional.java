package com.maxi.demo.model;

public class Profissional {

    private String profissao;
    private String formacao;

    public Profissional(final String profissao, final String formacao){
        this.profissao = profissao;
        this.formacao = formacao;
    }

    public String getProfissao() {
        return profissao;
    }

    public String getEscolaridade() {
        return formacao;
    }
}
