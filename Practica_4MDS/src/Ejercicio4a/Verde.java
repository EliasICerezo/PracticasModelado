/**
 * @(#) Verde.java
 */

package Ejercicio4a;

public class Verde extends Estado
{
    private static Verde verde=null;
    private Verde()
    {
		
    }
	
    public static Verde getInstance( )
    {
	if(verde==null){
            verde=new Verde();
        }	
        return verde;
    }

    @Override
    public void abrir(Semaforo s) {
        throw new RuntimeException("Can't open on a open semaphore");
    }

    @Override
    public void cerrar(Semaforo s) {
        s.setEstado(Rojo.getInstance());
    }

    public String toString(){
        return "VERDE";
    }

    @Override
    public String estado() {
        return "abierto";
    }
	
}
