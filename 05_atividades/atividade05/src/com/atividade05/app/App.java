package com.atividade05.app;

import javax.swing.JOptionPane;

import com.atividade05.model.Combustiveis;

public class App {
    public static void main(String[] args) throws Exception {
        Combustiveis combustivel = new Combustiveis(0, 0);

        String[] opcoes = {"Calcular Combustível", "Sair"};
        Object opcao; 
        do {
            opcao = JOptionPane.showInputDialog(
                null, 
                "Escolha uma opção", 
                null, 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                opcoes, 
                opcoes[0]);
            if (opcao == "Calcular Combustível") {
            combustivel.setGasolina(Double.parseDouble(JOptionPane.showInputDialog("Informe o Valor da Gasolina").replace(",", ".")));
            combustivel.setEtanol(Double.parseDouble(JOptionPane.showInputDialog("Informe o Valor do Etanol").replace(",", ".")));

            // output
            JOptionPane.showMessageDialog(
                null, 
                combustivel.calculo(), 
                "Resultado", 
                JOptionPane.INFORMATION_MESSAGE);
                }
        } while (opcao != "Sair");
    }
}                         
        // to do 
        /*
         * Crie um app para verificar qual o melhor combustivel para um carro flex abastecer
         *NOTE: compensa mais abastecer com etanol caso o valor dele seja até 70% do valor da gasolina
         */


