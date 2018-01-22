/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Elias
 */
public class Bandeja {
    private State state;
    private int capacity;
    private List<Pieza> piezas;
    
    public Bandeja(int cap) {
       capacity=cap;
       State empty=Empty.getInstance(cap);
       this.state = empty;
       piezas=new ArrayList<>();
    }
    
    /**
     * 
     * @return Numero de elementos que tiene la bandeja 
     */
    public int size(){
        return piezas.size();
    }
    
    public String getState(){
        return state.toString();
    }
    
    public void setState(State st){
        this.state=st;
    }
    
    public int getCapacity(){
        return capacity;
    }
     
    
    public void add(Pieza p){
        piezas.add(p);
    }
    
    public Pieza remove(){
        return piezas.remove(0);
    }
    
    public void put(Pieza p){
        state.put(p, this);
    }
    
    
    
    public Pieza get(){
        Pieza result=state.get(this);
        return result;
    }
    
    
    
}
