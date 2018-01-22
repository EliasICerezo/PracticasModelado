/**
 * @(#) Amarillo.java
 */
package Ejercicio4c;

public class Amarillo extends Estado {

    private static Amarillo amarillo=null;
    
    private Amarillo() {

    }

    public static Amarillo getInstance() {
        if(amarillo==null){
            amarillo=new Amarillo();
        }
        return amarillo;
    }

    @Override
    public void abrir(Semaforo s) {
        s.setEstado(Verde.getInstance());
    }

    @Override
    public void cerrar(Semaforo s) {
        s.setEstado(Rojo.getInstance());
    }

    @Override
    public String estado() {
        return "precaucion";
    }

    @Override
    public String toString() {
        return "AMARILLO";
    }
    
}
