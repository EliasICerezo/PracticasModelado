/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.List;

/**
 *
 * @author elias
 */
public abstract class SortStrategy {
    private static SortStrategy SS=null;

    public static SortStrategy setStrategy(TypeStrategy ts){
        SortStrategy ss;
        switch(ts){
            case FROM: 
                ss=SSFrom.getInstance();
                break;
            case DATE:
                ss=SSDate.getInstance();
                break;
            case PRIORITY:
                ss=SSPriority.getInstance();
                break;
            case TEXT:
                ss=SSText.getInstance();
                break;
            case SUBJECT:
                ss=SSSubject.getInstance();
                break;
            default:
                ss=SSFrom.getInstance();
        }
        SS=ss;
        return ss;
    }

    public SortStrategy getSS() {
        return SS;
    }
    
    
    
    abstract boolean before(Email m1, Email m2);
    
}
