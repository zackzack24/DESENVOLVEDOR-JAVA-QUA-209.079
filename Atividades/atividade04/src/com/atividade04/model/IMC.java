package com.atividade04.model;

public class IMC {
    private double peso;
    private double altura;
                            
    // construtor
    public IMC(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    // getters abd setters
    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularIMC() {
        return this.peso / (this.altura * this.altura);
    }

    public String diagnostico(double imc) {
        return (imc <= 18.5) ?  "Você está anêmico."
        : (imc < 25) ? "Você está no shape"
        : (imc < 30) ? "Você está gordinho hein vai fazer dieta muleque"
        : (imc < 35) ? "Obesidade começando"
        : (imc < 40) ? "Obesidade suprema tá morando no McDonalds"
        : "Explosão";
    }
}
