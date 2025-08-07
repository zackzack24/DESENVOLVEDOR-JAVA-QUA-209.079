package com.input01.app

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Instância do Objeto de Entrada de Dados 
        Scanner leia = new Scanner(System.in);

        // declaração de variáveis
        String nome;
        String email;
        int idade;
     
        // declaração de variáveis
        System.out.println("Informe seu nome: ");
        nome = leia.nextLine(); // chamando nextline
        System.out.println("Informe sua idade: ");
        idade = leia.nextInt(); // chamando nextline

        // necessário uma limpeza de buffer
        leia.nextLine();

        System.out.println("Informe seu email: ");
        email = leia.nextLine(); 

        // output (saída de dados)
        System.out.println("Nome: " + nome + ".");
        System.out.println("Idade: " + idade + ".");
        System.out.println("E-mail: " + email + ".");

        // fechar o objeto
        leia.close();
    }
} 


