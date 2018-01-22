/**
 * @(#) Verde.java
 */

package Ejercicio4b;

public class Verde extends Estado
{

    private static Verde verde = null;

    private Verde() {
    }
    public static Verde getInstance() {
        if (verde == null) {
            verde = new Verde();
        }
        return verde;
    }
    @Override
    public void abrir(Semaforo s) {
        throw new RuntimeException("Can't open on open semaphore");
    }
    @Override
    public void cerrar(Semaforo s) {
        s.setEstado(Amarillo.getInstance());
    }
    @Override
    public String estado() {
        return"";
    }
    @Override
    public String toString() {
        return "VERDE";
    }
}
