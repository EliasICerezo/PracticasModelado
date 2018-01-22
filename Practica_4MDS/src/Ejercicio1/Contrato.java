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
public class Contrato {
    private double precio;
    private Usuario usuario;
    private Proveedor proveedor;
    private final FabricaServicios fabrica;
    
    public Contrato(double precio, Usuario usuario, Proveedor proveedor) {
        this.precio = precio;
        this.usuario = usuario;
        this.proveedor = proveedor;
        fabrica=FabricaServicios.getInstance();
    }

    public double getPrecio() {
        return precio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    public Servicio ejecutar(){
        
        return fabrica.nuevo(proveedor.getTipoServicio());
    }
}


