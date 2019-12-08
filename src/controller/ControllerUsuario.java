package controller;

import java.util.ArrayList;
import model.Operador;
import model.Usuario;
import model.UsuarioComum;

public class ControllerUsuario {
    static ArrayList<Usuario> usuarios = new ArrayList<>();
    static Usuario usuarioComum = new UsuarioComum();
    static Usuario operador = new Operador();    
    
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
}
