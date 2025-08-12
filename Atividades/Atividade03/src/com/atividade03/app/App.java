package com.atividade03.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instanciando
        Scanner leia = new Scanner(System.in);
        Conta cc = new Conta("","","10101","696969",600.0);

        // declaração de variáveis 
        int opcao;
        double valor;

        System.out.println("Informe o Nome do Titular da Conta");
        cc.titular = leia.nextLine();
        System.out.println("Informe o CPF do Titular da Conta");
        cc.titular = leia.nextLine();

        do {
            // menu
            System.out.println("BANCO JAVA");
            System.out.println("1 - Exibir dados da conta");
            System.out.println("2 - Fazer Depósito");
            System.out.println("3 - Fazer Saque");
            System.out.println("4 - Sair do Programa");

            System.out.println("Informe a opção desejada");
            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    cc.exibirDados();
                    break;
                case 2:
                    System.out.println("Informe o valor do depósito");
                    valor = leia.nextDouble();
                    System.out.println((valor > 0) ? "Depósito efetuado com sucesso. Saldo: R$ " + cc.fazerDeposito(valor) : "Valor do depósito inválido.");
                    break;
                case 3:
                    System.out.println("Informe o valor do Saque");
                    valor = leia.nextDouble();
                    System.out.println((valor > 0 && valor <= cc.saldo) ? "Saque efetuado com Sucesso. Saldo: R$ " + cc.fazerSaque(valor) : "Valor do saque inválido");   
                    break;             
                case 4:
                    System.out.println("Programa Encerrado");
                    break;
               default:
                   System.out.println("Opção Inválida");
                   break;
            }
        } while (opcao != 4);

        leia.close();
    }
}

/*Crie um programa com uma classe chamada Conta, com os seguintes atributos:
         * Titular da conta
         * CPF DO TITULAR ok
         * AGENCIA ok
         * NUMERO DA CONTA OK
         * SALDO OK
         * O usuario deverá informar o nome do titular e o cpf, e 
         * o programa exibe um mene com as seguintes operações:
         * Exibir dados da conta
         * Fazer saque
         * Fazer depósito 
         * Sair do programa
         */