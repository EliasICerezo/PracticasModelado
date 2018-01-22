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
public class SSFrom extends SortStrategy{

    private static SSFrom SS=null;
    
    public static SSFrom getInstance(){
        if(SS==null){
            SS=new SSFrom();
        }
        return SS;
    }
    
    private SSFrom(){
        
    }
    
    @Override
    boolean before(Email m1, Email m2) {
        return m1.getFrom().compareTo(m2.getFrom())<0;
    }
    
}
