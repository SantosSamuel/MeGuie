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
import model.PontoTuristico;
import model.Teatro;
import model.Usuario;

/**
 *
 * @author Samuel
 */
public class ControllerMeGuie {
    static ArrayList<Usuario> usuarios = new ArrayList<>();
    static ArrayList<Cidade> cidades = new ArrayList<>();
    static ArrayList<PontoTuristico> pontosTuristicos = new ArrayList<>();
    static ArrayList<Avaliacao> avaliacoes = new ArrayList<>();
    
    static Usuario usuario = new Usuario();
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
    
    public boolean cadastrarUsuario(String nomeCompleto, String emailLogin, String hashSenha, String sexo){
        for(int i=0; i<usuarios.size(); i++){
            if(usuarios.get(i).getEmailLogin().equals(emailLogin)){
                return false;
            }
        }
        
        usuarios.add(new Usuario(nomeCompleto, emailLogin, hashSenha, sexo));
        return true;
    }
    
    public boolean logar(String emailLogin, String hashSenha){
        for(int i=0; i<usuarios.size(); i++){
            if(usuarios.get(i).getEmailLogin().equals(emailLogin) && usuarios.get(i).getHashSenha().equals(hashSenha))
                return true;
        }
        return false;
    }
    
    public boolean cadastrarTeatro(boolean internacional, boolean publico, String nome, String localizacao, String bairro){
        for(int i=0; i<teatros.size(); i++){
            if(teatros.get(i).getNome().equals(nome)){
                return false;
            }
        }
        teatros.add(new Teatro(internacional, publico, nome, localizacao, bairro));
        return true;
    }
    
    public boolean cadastrarHotel(int estrelas, float preco, boolean ar, boolean cafe, String nome, String localizacao, String bairro){
        for(int i=0; i<teatros.size(); i++){
            if(teatros.get(i).getNome().equals(nome)){
                return false;
            }
        }
        hoteis.add(new Hotel(estrelas, preco, ar, cafe, nome, localizacao, bairro));
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
