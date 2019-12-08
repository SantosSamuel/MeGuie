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
public abstract class Usuario {
    private String emailLogin;
    private String hashSenha;
    private String sexo;
    private String nomeCompleto;

    public Usuario(String nomeCompleto, String emailLogin, String hashSenha, String sexo) {
        this.nomeCompleto = nomeCompleto;
        this.emailLogin = emailLogin;
        this.hashSenha = hashSenha;
        this.sexo = sexo;
    }
    
    public Usuario(){
    }

    public String getEmailLogin() {
        return emailLogin;
    }

    public String getHashSenha() {
        return hashSenha;
    }

    public String getSexo() {
        return sexo;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setEmailLogin(String emailLogin) {
        this.emailLogin = emailLogin;
    }

    public void setHashSenha(String hashSenha) {
        this.hashSenha = hashSenha;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    
    public abstract void autenticar();
    
}
