/**
 * @(#) Rojo.java
 */
package Ejercicio4c;

public class Rojo extends Estado {

    private static Rojo rojo=null;
    private Rojo() {
        
    }

    public static Rojo getInstance() {
        if(rojo==null){
            rojo=new Rojo();
        }
        return rojo;
    }

    @Override
    public void abrir(Semaforo s) {
        if(s.getTriestable()){
            s.setEstado(Amarillo.getInstance());
        }else{
            s.setEstado(Verde.getInstance());
        }
    }

    @Override
    public void cerrar(Semaforo s) {
        throw new RuntimeException("Can't close on closed semaphore");
    }

    @Override
    public String estado() {
        return"";
    }

    @Override
    public String toString() {
        return "ROJO";
    }
    
    
}
