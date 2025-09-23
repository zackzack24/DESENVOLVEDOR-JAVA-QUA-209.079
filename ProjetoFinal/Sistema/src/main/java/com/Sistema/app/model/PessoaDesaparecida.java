package com.Sistema.app.model;

public class PessoaDesaparecida {


    // terminar tudo amanha



    private Long id;
    private String nomeCompleto;
    private String dataNascimento;
    private String dataDesaparecimento;
    private String localDesaparecimento;
    private String caracteristicasFisicas;
    private boolean encontrada;

    // Construtores, getters e setters

    public PessoaDesaparecida() {
    }

    public PessoaDesaparecida(Long id, String nomeCompleto, String dataNascimento, String dataDesaparecimento,
                              String localDesaparecimento, String caracteristicasFisicas, boolean encontrada) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.dataDesaparecimento = dataDesaparecimento;
        this.localDesaparecimento = localDesaparecimento;
        this.caracteristicasFisicas = caracteristicasFisicas;
        this.encontrada = encontrada;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
