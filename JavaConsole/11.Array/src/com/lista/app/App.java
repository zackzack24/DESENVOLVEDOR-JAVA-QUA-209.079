package com.lista.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        String[] nomes = new String[10];

        for(int i = 0; i < nomes.length; i ++) {
            System.out.println("Informe o " + (i + 1) + "° nome");
            nomes[i] = leia.nextLine();
        }

        for (String nome : nomes) {
            System.out.printf(nome);
        }
        
        leia.close(); 

    }
}
