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
        return logradouro;
    }

    public String getTipoEndereco() {
        return tipoEndereco;
    }

    public String getCep() {
        return cep;
    }

    public String getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getMunicipio() {
        return municipio;
    }
}
