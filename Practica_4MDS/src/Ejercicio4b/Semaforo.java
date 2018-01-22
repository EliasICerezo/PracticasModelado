/**
 * @(#) Semaforo.java
 */

package Ejercicio4b;

public class Semaforo
{
    private Estado state;

    public Semaforo() {
        state=Rojo.getInstance();
    }
  
    public void abrir( )
    {
	state.abrir(this);
    }
	
    public void cerrar( )
    {
	state.cerrar(this);
    }
    public void setEstado(Estado state) {
        this.state = state;
    }
    public String estado(){
        return state.estado();
    }
    public Estado getEstado() {
        return state;
    }

}
