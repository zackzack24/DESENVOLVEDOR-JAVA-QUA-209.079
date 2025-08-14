package com.QUATROPILARES.app;

import java.util.Scanner;

import com.QUATROPILARES.model.PessoaFisica;
import com.QUATROPILARES.model.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica(null,"","","","","");
        PessoaJuridica empresa = new PessoaJuridica(null,"","","","","","");

        // input do usuario
        System.out.print
        ("Informe os dados do usuário:\n");         
        System.out.printf("Informe o nome:"); 
        usuario.setNome(leia.nextLine());

        System.out.printf("Informe o CPF:");
        usuario.setCpf(leia.nextLine());

        System.out.printf("Informe a Data de Nascimento:"); 
        usuario.setDataNascimento(leia.nextLine());

        System.out.printf("Informe o e-mail:"); 
        usuario.setEmail(leia.nextLine());

        System.out.printf("Informe o telefone do usuário:");
        usuario.setTelefone(leia.nextLine()); 

        System.out.printf("Informe o endereço do usuário:"); 
        usuario.setEndereco(leia.nextLine()); 
        
        // saida
        System.out.println("Informações da Empresa");
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("CPF:" + usuario.getCpf()); 
        System.out.println("Data de Nascimento: " + usuario.getDataNascimento());
        System.out.println("EMAIL: " + usuario.getEmail());
        System.out.println("Telefone: " + usuario.getTelefone()); 
        System.out.println("Endereço: " + usuario.getEndereco()); 

        System.out.println("Informações da Empresa");
        System.out.println("Razão Social da Empresa" + empresa.getRazaoSocial());
        System.out.println("Nome Fantasia da Empresa" + empresa.getNomeFantasia()); 
        System.out.println("CNPJ da Empresa" + empresa.getCnpj());
        System.out.println("Email do usuário: " + usuario.getEmail());
        System.out.println("Telefone do usuário: " + usuario.getTelefone());
        System.out.println("Endereço do usuário: " + usuario.getEndereco());


        
    

        leia.close(); 
    }
}
