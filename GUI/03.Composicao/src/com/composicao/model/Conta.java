package com.composicao.model;

import com.composicao.interfaces.IConta;

public class Conta implements IConta {
    private String agencia;
    private String nConta;
    private double saldo;
    private Pessoa titular;

    // construtor
    public Conta(String agencia, String nConta, double saldo, Pessoa titular) {
        this.agencia = agencia;
        this.nConta = nConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    // getters and setters
    public String getAgencia() {
        return this.agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNConta() {
        return this.nConta;
    }

    public void setNConta(String nConta) {
        this.nConta = nConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Pessoa getTitular() {
        return this.titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }


    @Override
    public String exibirDados() {
        return "Agência " + this.agencia + 
        "\nNúmero da conta" + this.nConta + 
        "\nSaldo da Conta: R$ " + String.format("2f", this.saldo) +
        "\nNome do Titular da conta: " + this.titular.getNome() +
        "\nCPF do Titular da conta: " + this.titular.getCpf() +
        "\nEmail do Titular da conta: " + this.titular.getEmail() +
        "\nTelefone do Titular da conta" + this.titular.getTelefone() +
        "\nEndereço do Titular da conta" + this.titular.getEndereco();
    }

    @Override
    public double fazerDeposito(double valor) {
        this.saldo += valor;
        return this.saldo;
    }

    @Override
    public double fazerSaque(double valor) {
        this.saldo -= valor;
        return this.saldo;
    }

}
