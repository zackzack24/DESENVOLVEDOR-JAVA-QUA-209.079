package com.heranca.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // INSTANCIAR classe e PESSOA FISICA
        Scanner leia = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica();
        PessoaJuridica empresa = new PessoaJuridica();
        
        // definindo valores dos atributos do usuário
        System.out.println("Informe o nome do usuário:");
        usuario.nome = leia.nextLine(); 
        System.out.println("Informe o CPF do usuário:"); 
        usuario.cpf = leia.nextLine(); 
        System.out.println("Informe o e-mail do usuário:"); 
        usuario.email = leia.nextLine(); 
        System.out.println("Informe o telefone do usuário:");
        usuario.telefone = leia.nextLine(); 
        System.out.println("Informe o endereço do usuário:"); 
        usuario.endereco = leia.nextLine(); 

        // definindo valores e atributos para a empresa
        System.out.println("Informe a razão social da empresa");
        empresa.razaoSocial = leia.nextLine();
        System.out.println("Informe o nome fantasia da empresa");
        empresa.nomeFantasia = leia.nextLine();
        System.out.println("Informe o CNPJ da empresa");
        empresa.cnpj = leia.nextLine();
        System.out.println("Informe o email da empresa");
        empresa.email = leia.nextLine();
        System.out.println("Informe o telefone da empresa");
        empresa.telefone = leia.nextLine();
        System.out.println("Informe o endereço da empresa");
        empresa.endereco = leia.nextLine();

        // output
        System.out.println("Nome do usuário: " + usuario.nome);
        System.out.println("CPF do usuário: " + usuario.cpf);
        System.out.println("Email do usuário: " + usuario.email);
        System.out.println("Telefone do usuário: " + usuario.telefone);
        System.out.println("Endereço do usuário: " + usuario.endereco);
        System.out.println("Razão Social da Empresa" + empresa.razaoSocial);
        System.out.println("Nome Fantasia da Empresa" + empresa.nomeFantasia);
        System.out.println("CNPJ da Empresa" + empresa.cnpj);
        System.out.println("Telefone da Empresa" + empresa.telefone);
        System.out.println("Endereço da Empresa" + empresa.endereco);

       leia.close();
    } 
}