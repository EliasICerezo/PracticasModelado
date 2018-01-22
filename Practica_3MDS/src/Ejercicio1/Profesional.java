/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Elias
 */
public class Profesional {
    List<Acceso> accesos;
    
    public Profesional(){
        accesos=new ArrayList<>();
    }
    
    public void setAcceso(Acceso a){
        accesos.add(a);
    }

    public List<Acceso> getAccesos() {
        return accesos;
    }
    
    public Acceso getAcceso(int idx){
        return accesos.get(idx);
    }

    
    
    
    
}
