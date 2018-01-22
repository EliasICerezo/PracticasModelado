/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;
import java.util.*;
/**
 *
 * @author Elias
 */
public class Expedientar {
   private Paciente paciente;
   private Expediente expediente;

    public Expedientar(Paciente paciente, Expediente expediente) {
        this.paciente = paciente;
        this.expediente = expediente;
        this.paciente.setExpedientes(this);
        this.expediente.setPaciente(this);
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Expediente getExpediente() {
        return expediente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setExpediente(Expediente expediente) {
        this.expediente = expediente;
    }
         
}
