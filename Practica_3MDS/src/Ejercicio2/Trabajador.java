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
public abstract class Trabajador {
    private String nombre;
    private String numeroSeguridadSocial;
    protected double salario;

    public Trabajador(String nombre, String numeroSeguridadSocial, double salario) {
        this.nombre = nombre;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.salario = salario;
    }
    
    public abstract void incrementar();
    
    public double nomina(){
        return salario;
    }
   
    
    public String getNombre() {
        return nombre;
    }

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
