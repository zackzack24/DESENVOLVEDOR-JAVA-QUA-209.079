package com.quatropilares.model;

final public class PessoaJuridica extends Pessoa {
    // atributos
    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;


    public PessoaJuridica(String razaoSocial, String nomeFantasia, String cnpj, String email, String telefone, String endereco, String dataNascimento) {
        super(email, telefone, endereco, dataNascimento) ;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return this.nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

}
