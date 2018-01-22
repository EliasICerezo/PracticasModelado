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
public class Full extends State{

    private static Full e=null;
    public static Full getInstance(int cap){
        if(e==null){
            e=new Full(cap);
        }else{
            e.setCapacity(cap);
        }
        return e;
        
        
    }
    
    private Full(int cap) {
        super(cap);
    }
    

    
    @Override
    public String toString() {
        return "FULL";
    }

    @Override
    public void put(Pieza p, Bandeja b) {
        throw new RuntimeException("Can't add on full tray");
    }

    @Override
    public Pieza get(Bandeja b) {
        Pieza ret= b.remove();
        if(b.size()==0){
            b.setState(Empty.getInstance(b.getCapacity()));
        }else{
            b.setState(Normal.getInstance(b.getCapacity()));
        }
        return ret;
    }
}
