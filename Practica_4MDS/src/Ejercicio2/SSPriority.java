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
public class SSPriority extends SortStrategy{

    private static SSPriority SS=null;
    
    public static SSPriority getInstance(){
        if(SS==null){
            SS=new SSPriority();
        }
        return SS;
    }
    
    private SSPriority(){
        
    }
    
    @Override
    boolean before(Email m1, Email m2) {
        return m1.getPriority().menorque(m2.getPriority());
    }
    
}
