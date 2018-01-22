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
public class Expediente {
    private Expedientar paciente;
    private List<Acceso> accesos;


    /**
     * Este contructor tiene visibilidad de paquete dado que la creacion de los expedientes se lleva a cabo por los Accesos, cuando se realiza un acceso de tipo de creacion.
     * Así evitamos dejar al publico el new de estos expedientes, dado que no pueden existir expedientes que no han sido accedidos
     */
    Expediente() {
        accesos=new ArrayList<>();
    }
    
    
    public Expedientar getPaciente() {
        return paciente;
    }

    public List<Acceso> getAccesos() {
        return accesos;
    }
    
    public Acceso getAcceso(int idx){
        return accesos.get(idx);
    }

    public void setPaciente(Expedientar paciente) {
        this.paciente = paciente;
    }
    
    public void addAcceso(Acceso ac){
        accesos.add(ac);
    }

}
