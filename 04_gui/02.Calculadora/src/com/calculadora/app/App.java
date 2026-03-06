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
                JOptionPane.showMessageDialog(
                null, 
                "O Resultado da Soma é  " + 
                calculadora.somar(calculadora.getX(), calculadora.getY()),
                "Soma",
                JOptionPane.INFORMATION_MESSAGE
                );
            }
            else if (opcao == "Subtrair") {
                JOptionPane.showMessageDialog(
                null, 
                "O Resultado da Subtração é  " + 
                calculadora.subtrair(calculadora.getX(), calculadora.getY()),
                "Subtrair",
                JOptionPane.INFORMATION_MESSAGE
                );
                
            }
            else if (opcao == "Multiplicar") {
                JOptionPane.showMessageDialog(
                null, 
                "O Resultado da Multiplicação é  " +
                calculadora.multiplicar(calculadora.getX(), calculadora.getY()), 
                null, 
                JOptionPane.INFORMATION_MESSAGE);
            }
            if (opcao == "dividir") {
                JOptionPane.showMessageDialog(
                null,
                "O Resultado da Divisão é  " + 
                calculadora.dividir(calculadora.getX(), calculadora.getY()),
                null, 
                0
                );
            }

        } while (opcao != "Sair");
    }
}
