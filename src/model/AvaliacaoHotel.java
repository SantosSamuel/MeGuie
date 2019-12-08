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
public class AvaliacaoHotel extends Avaliacao{
    private int custoBeneficio;
    private int atendimento;
    private int conforto;
    private String motivo; //ENUMERACAO

    public AvaliacaoHotel(int custoBeneficio, int atendimento, int conforto, String motivo, String titulo, String descricao, String data, int pontuacao) {
        super(titulo, descricao, data, pontuacao);
        this.custoBeneficio = custoBeneficio;
        this.atendimento = atendimento;
        this.conforto = conforto;
        this.motivo = motivo;
    }
    
    public AvaliacaoHotel(){}

    public int getCustoBeneficio() {
        return custoBeneficio;
    }

    public int getAtendimento() {
        return atendimento;
    }

    public int getConforto() {
        return conforto;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setCustoBeneficio(int custoBeneficio) {
        this.custoBeneficio = custoBeneficio;
    }

    public void setAtendimento(int atendimento) {
        this.atendimento = atendimento;
    }

    public void setConforto(int conforto) {
        this.conforto = conforto;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
    @Override
    public String pegarTipo() {
        return "AvaliacaoHotel";
    }
}
