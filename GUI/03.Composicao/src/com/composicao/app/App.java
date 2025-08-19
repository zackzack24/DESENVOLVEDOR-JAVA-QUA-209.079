package com.composicao.app;

import javax.swing.JOptionPane;

import com.composicao.model.Conta;
import com.composicao.model.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa usuario = new Pessoa(
            null, 
            null, 
            null, 
            null, 
            null
            );
        Conta cc = new Conta(
            "1010-0", 
            "1010-0", 
            0, 
            usuario
            );

        String[] opcoes = {
            "Exibir os dados da conta", 
            "Fazer Depósito",
            "Fazer Saque",
            "Sair"
            };

        Object opcao;
        double valor;


        // input do titular da conta
        usuario.setNome(JOptionPane.showInputDialog("Informe o Nome do Titular da Conta"));
        usuario.setCpf(JOptionPane.showInputDialog("Informe o Cpf do Titular da Conta"));
        usuario.setEmail(JOptionPane.showInputDialog("Informe o Email do Titular da Conta"));     
        usuario.setTelefone(JOptionPane.showInputDialog("Informe o Telefone do Titular da Conta"));          
        usuario.setEndereco(JOptionPane.showInputDialog("Informe o Endereço do Titular da Conta"));
            
        do {
            opcao = JOptionPane.showInputDialog(
                null, 
                "Escolha a operação desejada", 
                "Java Bank", 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                opcoes, 
                opcoes[0]);

        switch (opcao.toString()) {
            case "Exibi dados da conta":
                JOptionPane.showMessageDialog(
                    null, 
                    cc.exibirDados(), 
                    null, 
                    JOptionPane.INFORMATION_MESSAGE
                    );
                    break;
            case "Fazer depósito":
            valor = Double.parseDouble(JOptionPane.showInputDialog(
                    "Informe o valor do Depósito em R$: "));
                    JOptionPane.showMessageDialog(
                    null, 
                    "Depósito Efetuado com Sucesso!\nSaldo atual: R$ " 
                    + cc.fazerDeposito(valor), 
                    "Depósito", 
                    JOptionPane.INFORMATION_MESSAGE
                    );
                    
                    break;
        }
        } while (opcao != "Sair");
    }
}
