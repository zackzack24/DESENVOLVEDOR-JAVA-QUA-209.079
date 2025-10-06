package com.Sistema.app.model;

import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.cglib.core.Local;

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
    private String nomeCompletoCadastro; // adicionado para o nome do desaparecido
    private LocalDate dataNascimento; // trocar de String para LocalDate
    private LocalDate dataDesaparecimento; // trocar de String para LocalDate
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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataDesaparecimento() {
        return dataDesaparecimento;
    }

    public void setDataDesaparecimento(LocalDate dataDesaparecimento) {
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

    public String getNomeCompletoCadastro() {
        return nomeCompletoCadastro;
    }

    public void setNomeCompletoCadastro(String setNomeCompletoCadastro) {
        this.nomeCompletoCadastro = setNomeCompletoCadastro;
    }
}
