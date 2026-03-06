package com.atividade06.app;

import javax.swing.JOptionPane;
import com.atividade06.model.Carros;
import com.atividade06.model.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa proprietario = new Pessoa(
            null, 
            null, 
            null, 
            null, 
            null, 
            null
            );
        Carros carro = new Carros(
            null, 
            null, 
            null, 
            null, 
            null, 
            proprietario
            );
    }
}

/* crie uma aplicação onde o usuario cadastro seus dados pessoais e os dados do 
 * seu veiculo pessoal, e o programa exibe os dados do veiculo na tela
 * use o conceito de composição, onde um dos atributos de veiculo e proprietario
 * nome cpf email data de nascimento 
 */

 /*  Pessoa pessoa = new Pessoa(null, null, null, null);
        Carros carro = new Carros(null, null, null);

        String[] opcoes = {"Cadastrar Dados", "Sair"};
        Object opcao;
             
        do {
            opcao = JOptionPane.showInputDialog(
                null, 
                "Escolha a opção desejada", 
                "Cadastrar Dados", 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                opcoes, 
                opcoes[0]);
        if (opcao == "Cadastrar Dados") {
                pessoa.setNome(JOptionPane.showInputDialog("Digite seu nome"));  
                pessoa.setCpf(JOptionPane.showInputDialog("Digite seu CPF")); 
                pessoa.setEmail(JOptionPane.showInputDialog("Digite seu Email")); 
                pessoa.setDataNascimento(JOptionPane.showInputDialog("Digite sua Data de Nascimento"));

               // dados do carro
               carro.setAno(JOptionPane.showInputDialog("Informe o ano do Veículo"));
               carro.setModelo(JOptionPane.showInputDialog("Informe o modelo do Carro"));
               carro.setAno(JOptionPane.showInputDialog("Informe o ano do Veículo"));
        }
        } while (opcao != "Sair"); */