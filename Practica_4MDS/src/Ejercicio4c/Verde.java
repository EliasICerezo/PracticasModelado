/**
 * @(#) Verde.java
 */
package Ejercicio4c;

public class Verde extends Estado {

    private static Verde verde=null;
    
    private Verde() {

    }

    public static Verde getInstance() {
        if(verde==null){
            verde=new Verde();
        }
        return verde;
    }

    @Override
    public void abrir(Semaforo s) {
        throw new RuntimeException("Can't open on open semaphore");
    }

    @Override
    public void cerrar(Semaforo s) {
        if(s.getTriestable()){
            s.setEstado(Amarillo.getInstance());
        }else{
            s.setEstado(Rojo.getInstance());
        }
    }

    @Override
    public String estado() {
        return "";
    }

    @Override
    public String toString() {
        return "VERDE";
    }
    
}
