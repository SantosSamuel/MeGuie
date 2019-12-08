/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Avaliacao;
import model.AvaliacaoHotel;
import model.AvaliacaoTeatro;
import model.Cidade;
import model.Hotel;
import model.Operador;
import model.PontoTuristico;
import model.Teatro;
import model.Usuario;
import model.UsuarioComum;

/**
 *
 * @author Marcus e Samuel
 */
public class ControllerMeGuie {

    static ArrayList<Cidade> cidades = new ArrayList<>();
    static ArrayList<PontoTuristico> pontosTuristicos = new ArrayList<>();
    static ArrayList<Avaliacao> avaliacoes = new ArrayList<>();
    

    static Cidade cidade = new Cidade();
    static PontoTuristico teatro = new Teatro();
    static PontoTuristico hotel = new Hotel();
    static Avaliacao avaliacaoTeatro = new AvaliacaoTeatro();
    static Avaliacao avaliacaoHotel = new AvaliacaoHotel();

    /*public ControllerMeGuie() {
        usuarios.add(new Usuario("Samuel", "samuel@meguie.com" , "123", "Masculino"));
    }*/
    
    
    public boolean cadastrarCidade(String nome, String localizacao, String estado, String pais){
        for(int i=0; i<cidades.size(); i++){
            if(cidades.get(i).getNome().equals(nome)){
                return false;
            }
        }
        cidades.add(new Cidade(nome, localizacao, estado, pais));
        return true;
    }
    public boolean cadastrarPontoTusistico(boolean internacional, boolean publico, String nome, String localizacao, String bairro, int estrelas, float preco, boolean ar, boolean cafe){

        usuarios.add(new Usuario(nomeCompleto, emailLogin, hashSenha, sexo));
        return true;
    }
    
    public boolean cadastrarPontoTusistico(boolean internacional, boolean publico, String nome, String localizacao, String bairro, int estrelas, float preco, boolean ar, boolean cafe){
        
        for(int i=0; i<pontosTuristicos.size(); i++){
            if(pontosTuristicos.get(i).getNome().equals(nome)){
                return false;
            }
        }
        pontosTuristicos.add(new Teatro(internacional, publico, nome, localizacao, bairro));
        return true;
    }
    
    public Cidade buscarCidade(String nome){
        for(int i=0; i<cidades.size(); i++){
            if(cidades.get(i).getNome().equals(nome))
                return cidades.get(i);
        }
        return null;
    }
    
    public PontoTuristico buscarPonto(String nome){
        for(int i=0; i<teatros.size(); i++){
            if(teatros.get(i).getNome().equals(nome))
                return teatros.get(i);
        }
        for(int i=0; i<hoteis.size(); i++){
            if(hoteis.get(i).getNome().equals(nome))
                return hoteis.get(i);
        }
        return null;
    }
    
    public boolean avaliarHotel(String nome, String titulo, String descricao, String data, int pontuacao, boolean internacional, boolean publico, int conforto, int qualidade, int organizacao){
        PontoTuristico ponto = buscarPonto(nome);
        
        if(ponto instanceof Hotel){
            avaliacoes.add(new AvaliacaoHotel(conforto, conforto, conforto, titulo, titulo, descricao, data, pontuacao));
            return true;
        }
        else if(ponto instanceof Teatro){
            avaliacoes.add(new AvaliacaoTeatro(conforto, qualidade, organizacao, titulo, descricao, data, pontuacao));
            return true;
        }
        return false;
    }
    
    
            
}
