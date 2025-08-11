package com.atividade03.app;

import java.util.Scanner;

public class Pessoa {
    public String nome;    
    public int idade, cpf, agencia, numeroDaConta, saldo;
    public double altura;

    String[] nomes = new String[10];

        for(int i = 0; i < nomes.length; i ++) {
            System.out.println("Informe o " + (i + 1) + "° nome");
            nomes[i] = leia.nextLine();
        }

        for (String nome : nomes) {
            System.out.printf(nome);
        }

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Altura: " + this.altura + " metros");
    }

    leia.close();
}
    
