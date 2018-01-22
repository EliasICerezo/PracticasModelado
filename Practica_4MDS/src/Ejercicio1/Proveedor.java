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
 * @author elias
 */
public abstract class Proveedor {
    private String nombre;
    private TipoServicio ts;
    private List<Contrato> contratos;
   
    public Proveedor(String nombre, TipoServicio ts) {
        this.nombre = nombre;
        this.ts = ts;
        contratos=new ArrayList<>();
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public TipoServicio getTs() {
        return ts;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTs(TipoServicio ts) {
        this.ts = ts;
    }

    public void remove(Contrato c) {
        contratos.remove(c);
    }

    public void addContrato(Contrato c) {
        contratos.add(c);
    }

    TipoServicio getTipoServicio() {
        return ts;
    }
    
    
    
    
}
