package com.atividade09.app;

public class Deltas {
    private double delta1;
    private double delta2;
    private double tempo;

    public Deltas(double delta1, double delta2, double tempo) {
        this.delta1 = delta1;
        this.delta2 = delta2;
        this.tempo = tempo;
    }

    public double getDelta1() {
        return this.delta1;
    }

    public void setDelta1(double delta1) {
        this.delta1 = delta1;
    }

    public double getDelta2() {
        return this.delta2;
    }

    public void setDelta2(double delta2) {
        this.delta2 = delta2;
    }

    public double getTempo() {
        return this.tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

}
