package com.atividade05.model;

public class Combustiveis {
    private Double Gasolina;
    private Double Etanol;

    // CONSTRUTOR
    public Combustiveis(Double Gasolina, Double Etanol) {
        this.Gasolina = Gasolina;
        this.Etanol = Etanol;
    }

    // GETTERS AND SETTERS

    public Double getGasolina() {
        return this.Gasolina;
    }

    public void setGasolina(Double Gasolina) {
        this.Gasolina = Gasolina;
    }

    public Double getEtanol() {
        return this.Etanol;
    }

    public void setEtanol(Double Etanol) {
        this.Etanol = Etanol;
    }

}