/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author elias
 */
public class Priority {
    private int prioridad;

    public Priority() {
        prioridad=100;
    }

    public Priority(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
  
    public boolean menorque(Priority p2){
        return prioridad<=p2.getPrioridad();
    }
}
