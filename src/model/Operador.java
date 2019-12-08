package model;

/**
 *
 * @author Samuel
 */
public class Operador extends Usuario{

    public Operador(String nomeCompleto, String emailLogin, String hashSenha, String sexo) {
        super(nomeCompleto, emailLogin, hashSenha, sexo);
    }

    @Override
    public void autenticar() {
    }
    
}
