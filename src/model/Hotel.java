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
public class Hotel extends PontoTuristico{
    private int estrelas;
    private float preco; //ENUMERACAO
    private boolean ar;
    private boolean cafe;

    public Hotel(int estrelas, float preco, boolean ar, boolean cafe, String nome, String localizacao, String bairro) {
        super(nome, localizacao, bairro);
        this.estrelas = estrelas;
        this.preco = preco;
        this.ar = ar;
        this.cafe = cafe;
    }
    
    public Hotel(){}

    public int getEstrelas() {
        return estrelas;
    }

    public float getPreco() {
        return preco;
    }

    public boolean isAr() {
        return ar;
    }

    public boolean isCafe() {
        return cafe;
    }

    public void setEstrelas(int estrelas) {
        this.estrelas = estrelas;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setAr(boolean ar) {
        this.ar = ar;
    }

    public void setCafe(boolean cafe) {
        this.cafe = cafe;
    }

    @Override
    public String pegarTipo() {
        return "Hotel";
    }

    
}
