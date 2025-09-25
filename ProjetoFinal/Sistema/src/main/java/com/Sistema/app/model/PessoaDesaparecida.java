package com.Sistema.app.model;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PessoaDesaparecida implements Serializable {
    // atributos
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idPessoaDesaparecida;
    private String nomeCompleto;
    private String dataNascimento;
    private String dataDesaparecimento;
    private String localDesaparecimento;
    private String caracteristicasFisicas;
    private boolean encontrada;

    // Construtores, getters e setters

    public PessoaDesaparecida() {
    }

    

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDataDesaparecimento() {
        return dataDesaparecimento;
    }

    public void setDataDesaparecimento(String dataDesaparecimento) {
        this.dataDesaparecimento = dataDesaparecimento;
    }

    public String getLocalDesaparecimento() {
        return localDesaparecimento;
    }

    public void setLocalDesaparecimento(String localDesaparecimento) {
        this.localDesaparecimento = localDesaparecimento;
    }

    public String getCaracteristicasFisicas() {
        return caracteristicasFisicas;
    }

    public void setCaracteristicasFisicas(String caracteristicasFisicas) {
        this.caracteristicasFisicas = caracteristicasFisicas;
    }

    public boolean isEncontrada() {
        return encontrada;
    }

    public void setEncontrada(boolean encontrada) {
        this.encontrada = encontrada;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public long getIdPessoaDesaparecida() {
        return idPessoaDesaparecida;
    }

    public void setIdPessoaDesaparecida(long idPessoaDesaparecida) {
        this.idPessoaDesaparecida = idPessoaDesaparecida;
    }
}
