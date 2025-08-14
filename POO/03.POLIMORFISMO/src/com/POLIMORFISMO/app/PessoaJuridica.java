package com.POLIMORFISMO.app;

final public class PessoaJuridica extends Pessoa {
    // atributos
    public String razaoSocial;
    public String nomeFantasia;
    public String cnpj;

    public PessoaJuridica(String razaoSocial, String nomeFantasia, String cnpj, String nome, String cpf, String dataNascimento, String email, String telefone, String endereco) {
        super(email, telefone, endereco);
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }

    public String cumprimentar() {
        return "Olá somos a empresa " + this.nomeFantasia +  " da razão Social " + this.razaoSocial + " nosso CNPJ é " + this.cnpj +  " estamos localizados em  " + this.endereco + " nosso telefone é " + this.telefone + " e meu e-mail é " + this.email + ".";
    }
}
