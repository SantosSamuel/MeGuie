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
public class AvaliacaoTeatro extends Avaliacao{
    private int conforto;
    private int qualidade;
    private int organizacao;

    public AvaliacaoTeatro(int conforto, int qualidade, int organizacao, String titulo, String descricao, String data, int pontuacao) {
        super(titulo, descricao, data, pontuacao);
        this.conforto = conforto;
        this.qualidade = qualidade;
        this.organizacao = organizacao;
    }
    
    public AvaliacaoTeatro(){}

    public int getConforto() {
        return conforto;
    }

    public int getQualidade() {
        return qualidade;
    }

    public int getOrganizacao() {
        return organizacao;
    }

    public void setConforto(int conforto) {
        this.conforto = conforto;
    }

    public void setQualidade(int qualidade) {
        this.qualidade = qualidade;
    }

    public void setOrganizacao(int organizacao) {
        this.organizacao = organizacao;
    }
    
    
}
