/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Samuel
 */
public abstract class PontoTuristico {
    private String nome;
    private int ordem;
    private String localizacao;
    private String bairro;

    public PontoTuristico(String nome, String localizacao, String bairro) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.bairro = bairro;
    }

    public PontoTuristico(String nome, int ordem, String localizacao, String bairro) {
        this.nome = nome;
        this.ordem = ordem;
        this.localizacao = localizacao;
        this.bairro = bairro;
    }
    
    public PontoTuristico(){}

    public String getNome() {
        return nome;
    }

    public int getOrdem() {
        return ordem;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public String getBairro() {
        return bairro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    
}
