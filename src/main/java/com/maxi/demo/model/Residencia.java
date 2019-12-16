package com.maxi.demo.model;

public class Residencia {

    private String logradouro;
    private String tipoEndereco;
    private String cep;
    private String numero;
    private String bairro;
    private String complemento;
    private String municipio;

    public Residencia(final String logradouro, final String tipoEndereco, final String cep, final String numero,
                      final String bairro, final String complemento, final String municipio){

        this.logradouro = logradouro;
        this.tipoEndereco = tipoEndereco;
        this.cep = cep;
        this.numero = numero;
        this.bairro = bairro;
        this.complemento = complemento;
        this.municipio = municipio;

    }

    public String getLogradouro() {
        return this.logradouro;
    }

    public String getTipoEndereco() {
        return this.tipoEndereco;
    }

    public String getCep() {
        return this.cep;
    }

    public String getNumero() {
        return this.numero;
    }

    public String getBairro() {
        return this.bairro;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public String getMunicipio() {
        return this.municipio;
    }
}
