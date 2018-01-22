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
public class Usuario {
    private List<Contrato> contratos;

    public Usuario() {
        contratos=new ArrayList<>();
    }
    
    
    
    public void removeContrato(Contrato c) {
        contratos.remove(c);
    }
    public Contrato getContrato(int idx){
        return contratos.get(idx);
    }
    public void addContrato(Contrato c) {
       contratos.add(c);
    }
    
}
