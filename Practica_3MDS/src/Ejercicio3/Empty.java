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
public class Empty extends State{

    private static Empty e=null;
    public static Empty getInstance(int cap){
        if(e==null){
            e=new Empty(cap);
        }else{
            e.setCapacity(cap);
        }
        return e;
        
        
    }
    
    
    private Empty(int cap){
        super(cap);
    }
    
    @Override
    public String toString() {
        return "EMPTY";
    }

    @Override
    public void put(Pieza p, Bandeja b) {
        b.add(p);
        if(b.size()==b.getCapacity()){
            b.setState(Full.getInstance(b.getCapacity()));
        }else{
            b.setState(Normal.getInstance(b.getCapacity()));
        }
    }

    @Override
    public Pieza get(Bandeja b) {
        throw new RuntimeException("Can't get on Empty tray");
    }

    
    
}
