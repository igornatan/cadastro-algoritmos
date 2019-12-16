package com.maxi.demo.model;

public class Contato {

    private String telefone;
    private String tipoTelefone;
    private String emailParticular;
    private String emailComercial;

    public Contato(
            final String telefone,
            final String tipoTelefone,
            final String emailComercial,
            final String emailParticular
    ) {
        this.telefone = telefone;
        this.tipoTelefone = tipoTelefone;
        this.emailComercial = emailComercial;
        this.emailParticular = emailParticular;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getTipoTelefone() {
        return this.tipoTelefone;
    }

    public String getEmailParticular() {
        return this.emailParticular;
    }

    public String getEmailComercial() {
        return this.emailComercial;
    }
}
