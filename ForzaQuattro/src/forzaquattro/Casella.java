/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forzaquattro;

/**
 *
 * @author rossi.alessandroachi
 */
public class Casella {
    private boolean libera;
    String giocatore;
    public Casella (){
        libera = true;
        
    }
    
    @Override
    public String toString(){
        return giocatore;
    }
    
    public boolean isFree(){
        return libera;
    }
    
    public void cambiaColore(String newColore){
        giocatore=newColore;
        libera=false;
    }
    
}
