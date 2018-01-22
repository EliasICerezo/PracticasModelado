/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author elias
 */
public class FabricaServicios {
    private static FabricaServicios fs=null;
  
    public static FabricaServicios getInstance(){
        if(fs==null){
            fs=new FabricaServicios();
        }
        return fs;
    }
    
    private FabricaServicios(){
        
    }
    
    public Servicio nuevo(TipoServicio ts){
        Servicio s=null;
        switch(ts){
            case ADSL:
                s=new ADSL();
        }
        if(s==null){
            throw new RuntimeException("El ripo de servicio no existe");
        }
        return s;
    }
    
    
}
