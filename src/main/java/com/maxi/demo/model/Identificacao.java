package com.maxi.demo.model;

public class Identificacao {

    private String nomeCompleto;
    private String cpf;
    private String dataNascimento;
    private String sexo;
    private String estadoCivil;
    private String naturalidade;
    private String nacionalidade;

    public Identificacao(final String nomeCompleto, final String cpf, final String dataNascimento, final String sexo,
                         final String estadoCivil, final String naturalidade, final String nacionalidade){

        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.naturalidade = naturalidade;
        this.nacionalidade = nacionalidade;
    }

    public String getNomeCompleto() {
        return this.nomeCompleto;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public String getSexo() {
        return this.sexo;
    }

    public String getEstadoCivil() {
        return this.estadoCivil;
    }

    public String getNaturalidade() {
        return this.naturalidade;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }
}
