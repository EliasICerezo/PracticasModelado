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
public class Normal extends State {

    
    private static Normal e=null;
    public static Normal getInstance(int cap){
        if(e==null){
            e=new Normal(cap);
        }else{
            e.setCapacity(cap);
        }
        return e;
        
        
    }
    
    private Normal(int cap) {
        super(cap);
    }
    
    
    @Override
    public String toString() {
        return "NORMAL";
    }

    @Override
    public void put(Pieza p, Bandeja b) {
        b.add(p);
        if(b.size()==b.getCapacity()){
            b.setState(Full.getInstance(b.getCapacity()));
        }
    }

    @Override
    public Pieza get(Bandeja b) {
        Pieza ret= b.remove();
        
        if(b.size()==0){
            b.setState(Empty.getInstance(b.getCapacity()));
        }
        return ret;
    }
    
}
