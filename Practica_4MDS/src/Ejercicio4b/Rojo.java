/**
 * @(#) Rojo.java
 */
package Ejercicio4b;

public class Rojo extends Estado {

    private static Rojo rojo = null;

    private Rojo() {
    }

    public static Rojo getInstance() {
        if (rojo == null) {
            rojo = new Rojo();
        }
        return rojo;
    }
    @Override
    public void abrir(Semaforo s) {
        s.setEstado(Amarillo.getInstance());
    }
    @Override
    public void cerrar(Semaforo s) {
        throw new RuntimeException("Can't close a closed semaphore");
    }
    @Override
    public String estado() {
        return"";
    }
    @Override
    public String toString(){
        return "ROJO";
    }
}
