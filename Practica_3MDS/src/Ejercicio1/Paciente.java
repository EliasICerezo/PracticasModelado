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
public class Paciente {
    Expediente expedienteAbierto;
    List<Expedientar> expedientes;
    
    public Paciente(){
       expedienteAbierto=null;
       expedientes=new ArrayList<>();
    }

    public Expediente getExpedienteAbierto() {
        return expedienteAbierto;
    }

    
    
    public void setExpedienteAbierto(Expediente ex){
        expedienteAbierto=ex;
        
    }
    
    public Expedientar getExpediente(int idx){
        return expedientes.get(idx);
    }
    
    public List<Expedientar> getExpedientes() {
        return expedientes;
    }
    
    
    public void setExpedientes(Expedientar ex){
        expedientes.add(ex);
    }
  
    
}
