package com.ifelse04.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println(" Informe seu nome:");
        nome = leia.nextLine();
        System.out.println(" Informe sua idade:");
        idade = leia.nextInt();

        // TERNÁRIO 
        // ? = se é verdadeiro, : = se não é verdadeiro
        System.out.println(nome + ((idade >= 18) ? " é maior de idade" : "é menor de idade"));

        leia.close();
    }
}
