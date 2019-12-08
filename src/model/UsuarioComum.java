package model;

/**
 *
 * @author Samuel
 */
public class UsuarioComum extends Usuario{

    public UsuarioComum(String nomeCompleto, String emailLogin, String hashSenha, String sexo) {
        super(nomeCompleto, emailLogin, hashSenha, sexo);
    }

    public UsuarioComum() {
    }

    @Override
    public void autenticar() {
    }
    
}
