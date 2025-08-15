package com.calculadora.app;

import javax.swing.JOptionPane;

import com.calculadora.controller.Calculadora;

public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora(0, 0);

        String[] opcoes = {"Somar", "Subtrair", "Multiplicar", "Dividir", "Sair"};
        Object opcao;

        do {
            opcao = JOptionPane.showInputDialog(null, "Selecione uma Opção", "Opções", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

            if (opcao != "Sair") {
                calculadora.setX(Double.parseDouble(JOptionPane.showInputDialog("Informe o Valor de X:")));
                calculadora.setY(Double.parseDouble(JOptionPane.showInputDialog("Informe o Valor de Y")));
            }

            if (opcao == "Somar") {

            }
            
        } while (opcao != "Sair");
    }
}
