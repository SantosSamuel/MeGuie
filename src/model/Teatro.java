/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.logging.Logger;

/**
 *
 * @author Samuel
 */
public class Teatro extends PontoTuristico{
    private boolean internacional;
    private boolean publico;

    public Teatro(boolean internacional, boolean publico, String nome, String localizacao, String bairro) {
        super(nome, localizacao, bairro);
        this.internacional = internacional;
        this.publico = publico;
    }
    
    public Teatro(){}

    public boolean isInternacional() {
        return internacional;
    }

    public boolean isPublico() {
        return publico;
    }

    public void setInternacional(boolean internacional) {
        this.internacional = internacional;
    }

    public void setPublico(boolean publico) {
        this.publico = publico;
    }
    
}
