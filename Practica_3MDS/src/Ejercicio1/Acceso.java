/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Elias
 */
public class Acceso {
    private Date fecha;
    private TipoAcceso tipo;
    private Expediente ex;
    private Profesional profesional;
    /**
     * Este constructor se usa solamente si se quiere crear un expediente nuevo
     * @param f fecha
     * @param pf profesional
     */
    public Acceso(Date f, Profesional pf){
        this(f,TipoAcceso.CREACION,null,pf);
    }
    
    /**
     * Constructor del acceso, en el que se enlazan los profesionales y los pacientes con el mismo
     * @param f
     * @param t
     * @param ex
     * @param pf 
     */
    
    public Acceso(Date f, TipoAcceso t , Expediente ex, Profesional pf){
        
        if(t==TipoAcceso.CREACION){
            this.ex=new Expediente();
        }else{
             this.ex=ex;
        }
        
        fecha=f;
        tipo=t;
        profesional=pf;
        this.ex.addAcceso(this);
        profesional.setAcceso(this);
    }
    
    public Date getFecha() {
        return fecha;
    }

    public TipoAcceso getTipo() {
        return tipo;
    }

    public Expediente getExpediente() {
        return ex;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setTipo(TipoAcceso tipo) {
        this.tipo = tipo;
    }

    public void setEx(Expediente ex) {
        this.ex = ex;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }
    
}
