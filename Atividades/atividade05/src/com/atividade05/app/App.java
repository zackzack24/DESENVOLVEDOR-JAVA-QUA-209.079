package com.atividade05.app;

import javax.swing.JOptionPane;

import com.atividade05.model.Combustiveis;

public class App {
    public static void main(String[] args) throws Exception {
        Combustiveis combustivel = new Combustiveis(0, 0);
        
        String[] opcoes = {"Calcular preço", "Sair"};
        Object opcao;

        double precoCombustivel;
         
        do {
            JOptionPane.showInputDialog(
                "Digite o preço da Gasolina",
                "Digite o Preço do Etanol");   
            if (opcao == "Calcular preço") {
                Combustiveis.setCombustivel(Double.parseDouble(JOptionPane.showInputDialog
                ("Informe o combustível")));
                Combustiveis.setPreco(Double.parseDouble(JOptionPane.showInputDialog
                ("Informe preço do combustível")));
            }

        } while (opcao != "Sair");
    }        
        
}        





        // to do 
        /*
         * Crie um app para verificar qual o melhor combustivel para um carro flex abastecer
         *NOTE: compensa mais abastecer com etanol caso o valor dele seja até 70% do valor da gasolina
         */


