package br.com.redhat.model;

import java.io.Serializable;

public class PessoaJuridica implements Serializable {

    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    } 
}
