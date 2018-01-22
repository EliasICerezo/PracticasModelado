/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author Elias
 */
public class Pensionista extends Trabajador{

    public Pensionista(String nombre, String numeroSeguridadSocial, double salario) {
        super(nombre, numeroSeguridadSocial, salario);
    }
     @Override
    public void incrementar() {
        this.salario=salario*1.04;
    }
   
    
}
