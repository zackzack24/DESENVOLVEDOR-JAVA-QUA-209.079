package com.atividade09.app;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Fabricante fabricantes = new Fabricante(null);
        Modelo modelos = new Modelo(null);
        Deltas delta = new Deltas(0, 0,0);

        String[] opcoes = {"Consultar Multas", "Sair"};
        Object opcao; 
        do {
            opcao = JOptionPane.showInputDialog(
                null, 
                modelos, 
                null, 
                0, 
                null, 
                opcoes, 
                opcoes[0]);
                if (opcao == "Consultar Multas") {
                    fabricantes.setFabricante(JOptionPane.showInputDialog("Informe o Fabricante do Carro"));
                    modelos.setModelo(JOptionPane.showInputDialog("Informe o Modelo do carro:"));
                    delta.setDelta1((Double.parseDouble(JOptionPane.showInputDialog("Informe o pardel 1"))));
                    delta.setDelta2((Double.parseDouble(JOptionPane.showInputDialog("Informe o pardel 2"))));
                    delta.setTempo((Double.parseDouble(JOptionPane.showInputDialog("Informe o Tempo"))));
                }
            String Multado;
            double velocidade = (delta.getDelta2() - delta.getDelta1() / (delta.getTempo()) / 60);
            if (velocidade <= 80) {
                Multado = "Não Multado";
            }else{
                Multado = "Multado";
            }   
            JOptionPane.showMessageDialog(null, opcao, Multado, 0);                
        } while (opcao != "Sair");           
    } 
}

