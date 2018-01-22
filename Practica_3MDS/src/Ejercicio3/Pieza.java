/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author Elias
 */
public class Pieza {
    private Bandeja b;
    
    public Pieza(Bandeja bj){
        b=bj;
    }
    
    public Bandeja getBandeja(){
        return b;
    }
    
    public void setBandeja(Bandeja bj){
        b=bj;
    }
    
    
    
}
