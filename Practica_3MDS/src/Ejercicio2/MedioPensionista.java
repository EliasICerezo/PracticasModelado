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
public class MedioPensionista extends Trabajador{
    Activo a;
    Pensionista p;

    public MedioPensionista(String nombre, String numeroSeguridadSocial, double salario) {
        super(nombre, numeroSeguridadSocial, salario);
        a=new Activo(nombre,numeroSeguridadSocial,salario);
        p=new Pensionista(nombre, numeroSeguridadSocial, salario);
    }

    @Override
    public double nomina(){
        return a.salario+p.salario;
    }
    
    
    
    @Override
    public void incrementar() {
        a.incrementar();
        p.incrementar();
    }
    
  
}
