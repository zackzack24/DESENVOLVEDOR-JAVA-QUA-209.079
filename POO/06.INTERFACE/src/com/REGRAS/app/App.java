package com.REGRAS.app;

import com.REGRAS.model.Conta;
import com.REGRAS.interfaces.IConta;
import java.util.Scanner;

public class App extends Conta {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        Conta cc = new Conta("1","1","1","1", 0.0);
        
        System.out.print("Informe os dados do usuário:\n");         
        System.out.printf("Informe o Titular:"); 
        cc.setTitular(leia.nextLine());
        System.out.printf("Informe o CPF:"); 
        cc.setCpf(leia.nextLine());
        System.out.printf("Informe a Agência:"); 
        cc.setAgencia(leia.nextLine());
        System.out.printf("Informe o Número da conta:"); 
        cc.setNConta(leia.nextLine());
        System.out.printf("Informe o saldo:"); 
        cc.setSaldo(leia.nextDouble());

        System.out.println("Informações da Empresa");
        System.out.println("Nome: " + cc.getTitular());
        System.out.println("CPF:" + cc.getCpf()); 
        System.out.println("Conta: " + cc.getAgencia());
        System.out.println("Número da Conta: " + cc.getNConta());
        System.out.println("Saldo: " + cc.getSaldo()); 
        
        leia.close();
    }
}
