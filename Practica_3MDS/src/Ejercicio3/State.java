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
public abstract class State {
  
    private int capacity;
    
    public State(int cap){
        capacity=cap;
     
    }
    
    public abstract void put(Pieza p, Bandeja b);
    public abstract Pieza get(Bandeja b);
    @Override
    public abstract String toString();
    
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    
    @Override
    public boolean equals(Object o){
        boolean b=false;
        if(o instanceof State){
            State aux=(State)o;
           
            if(aux.toString().equals(toString())){
                
                b=true;
            }
        }
        return b;
    }
    
    
}
