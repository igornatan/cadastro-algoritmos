package com.maxi.demo.model;

public class Contato {

    private String telefone;
    private String tipoTelefone;
    private String email;
    private String tipoEmail;

    public Contato(
            final String telefone,
            final String tipoTelefone,
            final String email,
            final String tipoEmail
    ) {
        this.telefone = telefone;
        this.tipoTelefone = tipoTelefone;
        this.email = email;
        this.tipoEmail = tipoEmail;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getTipoTelefone() {
        return this.tipoTelefone;
    }

    public String getEmailParticular() {
        return this.email;
    }

    public String getEmailComercial() {
        return this.tipoEmail;
    }
}
