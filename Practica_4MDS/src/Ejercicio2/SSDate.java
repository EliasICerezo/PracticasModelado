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
public class SSDate extends SortStrategy{
    private static SSDate SS=null;
    
    public static SSDate getInstance(){
        if(SS==null){
            SS=new SSDate();
        }
        return SS;
    }
    
    private SSDate(){
        
    }
    
    @Override
    boolean before(Email m1, Email m2) {
        return m1.getDate().compareTo(m2.getDate())<0;
    }
    
}
