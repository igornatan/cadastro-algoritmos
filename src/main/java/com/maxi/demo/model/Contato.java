package com.maxi.demo.model;

public class Contato {

    private String telefone;
    private String tipoTelefone;
    private String emailParticular;
    private String emailComercial;

    public Contato(final String telefone, final String tipoTelefone, final String emailComercial, final String emailParticular){
        this.telefone = telefone;
        this.tipoTelefone = tipoTelefone;
        this.emailComercial = emailComercial;
        this.emailParticular = emailParticular;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getTipoTelefone() {
        return tipoTelefone;
    }

    public String getEmailParticular() {
        return emailParticular;
    }

    public String getEmailComercial() {
        return emailComercial;
    }
}
