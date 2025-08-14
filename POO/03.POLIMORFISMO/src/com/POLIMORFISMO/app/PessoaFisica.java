package com.POLIMORFISMO.app;

final public class PessoaFisica extends Pessoa {
    // atributos 
    public String nome;
    public String cpf;
    public String dataNascimento;

    public PessoaFisica(String nome, String cpf, String dataNascimento, String email, String telefone, String endereco) {
        super(email, telefone, endereco);
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }  

    public String cumprimentar() {              
        return "Olá meu nome é " + this.nome +  " anos, nasci em " + this.dataNascimento + " meu CPF é " + this.cpf +  "moro em " + this.endereco + " meu telefone é " + this.telefone + " e meu e-mail é " + this.email + 
        ".";
    }
}