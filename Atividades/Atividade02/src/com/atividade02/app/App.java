package com.atividade02.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        String nome, sala;
        int sair = 0, idade, idadeMinima = 0;

        System.out.println("Informe o nome");
        nome = leia.nextLine();
        System.out.println("Informe a Idade");
        idade = leia.nextInt();
        

        do  {
            // SALAS
            System.out.println(" Cine Java ☕");
            System.out.println("1 - A Roda Quadrada - Livre");
            System.out.println("2 - A Volta dos Que Não Foram - 12 anos ");
            System.out.println("3 - As tranças do Rei Careca - 14 anos ");
            System.out.println("4 - Poeira em Alto Mar - 16 anos");
            System.out.println("5 - A Vingança do Frango Assado - 18 anos");
            System.out.println("Qual sala deseja entrar?");
            sala = leia.nextLine();

            switch (sala) {
                case "1":
                    break;
                case "2":
                    idadeMinima = 12;
                    break;
                case "3":
                    idadeMinima = 14;
                    break;
                case "4":
                    idadeMinima = 16;
                    break;
                case "5":
                    idadeMinima = 18;
                    break;
                default:
                    idadeMinima = idade + 1;
                System.out.println("Sala Inexistente");
            }

            if (idade >= idadeMinima) {
                System.out.println("Entrada permitida para" + nome + ".");
                System.out.println("Tenha um bom filme" + nome + "📽");
            }
        } while(sair != 0);
        
        leia.close();
    }
}

/*
 * Crie uma aplicação em java em que o usuário informe o nome e a idade, e o programa exibe 5 salas de cinema, cada uma exibindo um filme com uma classificação indicativa 
 * O usuário deverá escolher a sala de acordo com o filme desejado,
 * e se o usuário tiver idade para ver o filme o programa imprime o ingresso e encerra. Caso o udsuário não tenha a idade mínima, o programa proíbe a entrada e pede para escolher outro filme.
 */
