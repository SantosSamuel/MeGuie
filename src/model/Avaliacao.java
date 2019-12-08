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
public abstract class Avaliacao {
    private String titulo;
    private String descricao;
    private String data; //DATE
    private int pontuacao;
    
    public abstract String pegarTipo();

    public Avaliacao(String titulo, String descricao, String data, int pontuacao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
        this.pontuacao = pontuacao;
    }
    
    public Avaliacao(){}

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getData() {
        return data;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
    
    
    
}
