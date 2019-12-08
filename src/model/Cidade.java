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
public class Cidade {
    private String nome;
    private String localizacao;
    private String estado;
    private String pais;

    public Cidade(String nome, String localizacao, String estado, String pais) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.estado = estado;
        this.pais = pais;
    }
    
    public Cidade(){}

    public String getNome() {
        return nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public String getEstado() {
        return estado;
    }

    public String getPais() {
        return pais;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    
}
