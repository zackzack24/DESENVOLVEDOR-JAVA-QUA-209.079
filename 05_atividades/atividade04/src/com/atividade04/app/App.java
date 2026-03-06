package com.atividade04.app;

import javax.swing.JOptionPane;

import com.atividade04.model.IMC;

public class App {
    public static void main(String[] args) throws Exception {
        IMC imc = new IMC(0, 0);

        String[] opcoes = {"Calcular IMC", "SAIR"};
        Object opcao;

        double imcValor;

        do {
            opcao = JOptionPane.showInputDialog(
                null, 
                "Escolha a opção desejada",
                "IMC",
                JOptionPane.QUESTION_MESSAGE,
                null, 
                opcoes,
                opcoes[0]
            );
            if (opcao == "Calcular IMC") {
                imc.setPeso(Double.parseDouble(JOptionPane.showInputDialog
                ("Informe seu Peso atual").replace(",", ".")));
                imc.setAltura(Double.parseDouble(JOptionPane.showInputDialog
                ("Informe sua altura em metros").replace(",", ".")));

                imcValor = imc.calcularIMC();
 
                JOptionPane.showMessageDialog(
                    null, 
                    "Valor do IMC: " + String.format("%.2f", imcValor) +
                    "\n" + imc.diagnostico(imcValor), 
                    "IMC RESULTADO", 
                    JOptionPane.INFORMATION_MESSAGE
                    );
            }
        } while (opcao != "Sair"); 
} 
}
