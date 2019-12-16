package com.maxi.demo.model;

public class Pessoa {

    private Identificacao identificacao;
    private Profissional profissional;
    private Residencia residencia;
    private Contato contato;

    public Pessoa(
            final Identificacao identificacao,
            final Profissional profissional,
            final Residencia residencia,
            final Contato contato
    ) {
        this.identificacao = identificacao;
        this.profissional = profissional;
        this.residencia = residencia;
        this.contato = contato;
    }

    public Identificacao getIdentificacao() {
        return this.identificacao;
    }

    public Profissional getProfissional() {
        return this.profissional;
    }

    public Residencia getResidencia() {
        return this.residencia;
    }

    public Contato getContato() {
        return this.contato;
    }
}
