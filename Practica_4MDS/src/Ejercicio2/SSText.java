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
public class SSText extends SortStrategy{
    private static SSText SS=null;
    
    public static SSText getInstance(){
        if(SS==null){
            SS=new SSText();
        }
        return SS;
    }
    
    private SSText(){
        
    }
    
    @Override
    boolean before(Email m1, Email m2) {
        return m1.getText().compareTo(m2.getText())<0;
    }
    
}
