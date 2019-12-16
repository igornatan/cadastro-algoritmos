package com.maxi.demo.model;

public class Profissional {

    private String profissao;
    private String formacao;
    private String renda;

    public Profissional(final String profissao, final String formacao, final String renda){
        this.profissao = profissao;
        this.formacao = formacao;
        this.renda = renda;
    }

    public String getProfissao() {
        return this.profissao;
    }

    public String getEscolaridade() {
        return this.formacao;
    }

    public String getRenda() {
        return this.renda;
    }
}
