package com.quatropilares.model;

import java.util.Scanner;

abstract public class Pessoa {
    // atributos
    private String email;
    private String telefone;
    private String endereco;
    

    public Pessoa(String email, String telefone, String endereco, String dataNascimento) {
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
