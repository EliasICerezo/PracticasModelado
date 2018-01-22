/**
 * @(#) Rojo.java
 */

package Ejercicio4a;

public class Rojo extends Estado
{   
    private static Rojo rojo=null;
    private Rojo( )
    {
		
    }
	
    public static Rojo getInstance( )
    {
	if(rojo==null){
            rojo=new Rojo();
        }
        return rojo;
    }

    @Override
    public void abrir(Semaforo s) {
       s.setEstado(Verde.getInstance());
    }

    @Override
    public void cerrar(Semaforo s) {
        throw new RuntimeException("Can't close a closed Semaphore");
    }
    
    @Override
    public String toString(){
        return "ROJO";
    }

    @Override
    public String estado() {
        return "cerrado";
    }
	
}
