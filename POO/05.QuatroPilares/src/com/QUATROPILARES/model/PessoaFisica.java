package com.QUATROPILARES.model;

final public class PessoaFisica extends Pessoa {
    // atributos
    private String nome;
    private String dataNascimento;
    private String cpf;


    public PessoaFisica(String nome, String cpf, String email, String telefone, String endereco, String dataNascimento) {
        super (email, telefone, endereco, dataNascimento);
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
