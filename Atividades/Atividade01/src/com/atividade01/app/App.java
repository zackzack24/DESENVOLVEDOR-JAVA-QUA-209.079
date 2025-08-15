package Atividades.atividade01.src.com.atividade01.app;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
         Scanner leia = new Scanner(System.in);
            
         String nome, opcao, diagnostico;
         double altura, peso, imc;
         int saida = 0;
        
         do {
            System.out.println("1 Calcular IMC");
            System.out.println("2 SAIR ");
            System.out.println("Escolha a opção");
            opcao = leia.nextLine();

            switch (opcao) {
                case "1":
                System.out.println("Informe seu nome");
                nome = leia.nextLine();
                System.out.println("Informe seu peso em Kg");
                peso = leia.nextDouble();
                System.out.println("Informe sua altura em metros");
                altura = leia.nextDouble();

                imc = peso / (altura*altura);
                System.out.println("O IMC de " + nome + "é" + imc + ".");
                
                diagnostico = (imc < 18.5) ? nome + "Está abaixo do peso"
                : (imc < 25) ? nome + "está abaixo do peso."
                : (imc < 30) ? nome + "está acima do peso."
                : (imc < 35) ? nome + "está obesa."
                : (imc < 40) ? nome + "está com obesidade nível II."
                : nome + " está quase explodindo" ;

                System.out.println(diagnostico);
                break;

                case "2":
                    saida = Integer.parseInt(opcao);
                    System.out.println("Programa Encerrado"); 
                    break;
                default:      
                System.out.println("Opção Inválida");       
            }

        }while (opcao != "2");

        leia.close();
    }
}

        /*  OPÇÃO 2
          switch (opcao) {
             case "2": System.out.println("Até mais!"); 
                 break;   
        } */

        /*    declaração de variáveis
        System.out.println("Vamos verificar o seu IMC");
        System.out.println("Informe seu nome: ");
        nome = leia.nextLine(); 
        System.out.println("Informe sua idade: ");
        idade = leia.nextInt(); 
        leia.nextLine(); // fechando buffer
        System.out.println("Informe sua altura: ");
        altura = leia.nextDouble(); 
        System.out.println("Informe seu peso: ");
        peso = leia.nextDouble(); 
        
        imc = peso/(altura*altura);

         formula do imc = PESO/ALTURA*ALTURA
        if (peso <= 18.5) {
            System.out.println(nome + " está abaixo do peso");
        }
        if (peso >= 18.6 && peso <= 29.9) {
            System.out.println(nome + " peso ideal, parabéns!");
        }
        if (peso >= 25 && peso <= 34.9) {
            System.out.println(nome + " Levemente acima do peso");
        }
        if (peso >= 30 && peso <= 34.9) {
            System.out.println(nome + " Obesidade Grau 1");
        }
        if (peso >= 35 && peso <= 39.9) {
            System.out.println(nome + " Obesidade Grau 2");
        }
        if (peso > 40) {
            System.out.println(nome + " Obesidade Mórbida, Morte em breve...");
        }
        
        leia.close();
    }
}
*\

/* 
         * Crie um Programa que receba o nome, peso e altura do usuário,
         * 
         * e calcule o valor do seu IMC (Índice de Massa Corporal)
         * cuja fórmula é PESO/ALTURA*ALTURA, e informe o seu diagnóstico 
         * baseado na tabela do IMC
         * o programa pode calcular o IMC de vários usuários, e deverá ter a opção de sair
        */

