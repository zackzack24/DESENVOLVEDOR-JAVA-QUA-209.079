package com.dialogos.app;

import javax.swing.JOptionPane;

import com.dialogos.model.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        // instanciando classes
        Pessoa usuario = new Pessoa(null, 0);

        // caixa de input
        usuario.setNome(JOptionPane.showInputDialog("Informe seu nome"));
        usuario.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe sua Idade")));
        
        // caixa de output
        JOptionPane.showMessageDialog(
        null,
        "Nome: " + usuario.getNome() +
        "\nIdade: " + usuario.getIdade(),
        "Saida",
        JOptionPane.INFORMATION_MESSAGE
        );
    }
}
