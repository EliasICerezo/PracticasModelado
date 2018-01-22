/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author elias
 */
public class MailBox {
    private List<Email> emails;
    private SortStrategy st;
    private TypeStrategy estrategia;

    public MailBox() {
        emails=new ArrayList<>();
        st=SortStrategy.setStrategy(TypeStrategy.FROM);
        estrategia=TypeStrategy.FROM;
    }

    
    public MailBox( TypeStrategy estrategia) {
        this.emails = new ArrayList<>();
        this.estrategia = estrategia;
        this.st=SortStrategy.setStrategy(estrategia);
    }
    
    
    public void show(){
        System.out.println("----------------Emails----------------");
        for(Email e:emails){
            System.out.println(e);
        }
        System.out.println("--------------------------------------");
    }
    
    
    public void sort(){
       
        for ( int i = 0; i <= emails.size()-1; i++ ) {
            for ( int j = 0; j<emails.size()-i-1; j++ ) { 
                if ( st.before(emails.get(j),emails.get(j+1)) ){
                    Email aux=emails.get(j+1);
                    emails.set(j+1, emails.get(j));
                    emails.set(j, aux);
                }
           }
        }   

    }

    /**
     *
     * @param idx Indice del email que se quiere recuperar
     * @return Email de la lista con el indice proporcionado.
     */
    public Email getEmail(int idx) {
        return emails.get(idx);
    }

    public TypeStrategy getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(TypeStrategy estrategia) {
        this.estrategia = estrategia;
        this.st= SortStrategy.setStrategy(estrategia);
    }
    
    public void addEmail(Email m){
        emails.add(m);
    }

}
