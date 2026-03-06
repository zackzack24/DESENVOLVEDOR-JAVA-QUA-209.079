package com.ifelse.app;

import java.util.Scanner;

public class App {
        public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

            // instancia o objeto Scanner
            Scanner leia = new Scanner(System.in);

            // declarando variaveis
            String nome;
            int idade; 

            // input
            System.out.println("Informe seu nome:  ");
            nome = leia.nextLine();
            System.out.println("Informe sua idade:  ");
            idade = leia.nextInt();

            // estrutura de decisão
            if (idade >= 18) {
                System.out.println(nome + " é maior de idade.");
            }
            else {
                System.out.println(nome + "é menor de idade.");
            }

            // fecha o objeto
            leia.close();          
    }
}