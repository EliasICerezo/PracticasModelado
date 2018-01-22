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
public class SSSubject extends SortStrategy{

    private static SSSubject SS=null;
    
    public static SSSubject getInstance(){
        if(SS==null){
            SS=new SSSubject();
        }
        return SS;
    }
    
    private SSSubject(){
        
    }
    
    @Override
    boolean before(Email m1, Email m2) {
        return m1.getSubject().compareTo(m2.getSubject())<0;
    }
    
}
